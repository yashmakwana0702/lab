function dummy = rangefinder(d,I,R,N)

%defines constants for later use

u = 1.26e-6;  %permability constant
%I = 10;       %current through wire in amps
%R = .2;       %radius of coil in meters
%N = 200;      %turns per each coil

%end constants


%evaluation parameters

low = -1;       %low bound
high = 1;       %high bound
step = .001;    %spatial step
counter = 0;    %to keep track of things  

%end evaluation parameters


%makes x and B(x) vectors

for i = low:step:high
    counter = counter + 1;
    x(counter) = i;
    B(counter) = .5*u*N*I*R^2*(1/((R^2 + i^2)^(3/2)) + 1/(R^2 + (d-i)^2)^(3/2));
end

%end vector making


%plots vectors and marks locations of coils

plot(x,B,[0,0],[0,max(B)],'r',[d,d],[0,max(B)],'r')
title('B(x) vs. x')
xlabel('x (m)')
ylabel('B(x) (T)')

