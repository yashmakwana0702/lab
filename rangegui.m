close all
figure

dlab = uicontrol('style','text','units','normalized','position',[.00,.85,.05,.03],'string','d');
dunits = uicontrol('style','text','units','normalized','position',[.05,.81,.02,.03],'string','m');
dtextbox = uicontrol('style','edit','units','normalized','position',[.00,.8,.05,.05],'string','d','callback','dval__ = str2num(get(dtextbox,''String'')); ' );

ilab = uicontrol('style','text','units','normalized','position',[.00,0.75,.05,.03],'string','I');
iunits = uicontrol('style','text','units','normalized','position',[.05,0.71,.02,.03],'string','A');
Itextbox = uicontrol('style','edit','units','normalized','position',[.00,.7,.05,.05],'string','I','callback','Ival__ = str2num(get(Itextbox,''String'')); ' );

nlab = uicontrol('style','text','units','normalized','position',[.00,0.65,.05,.03],'string','N');
Ntextbox = uicontrol('style','edit','units','normalized','position',[.00,.6,.05,.05],'string','N','callback','Nval__ = str2num(get(Ntextbox,''String''));');

rlab = uicontrol('style','text','units','normalized','position',[.00,0.55,.05,.03],'string','R');
runits = uicontrol('style','text','units','normalized','position',[.05,0.51,.02,.03],'string','m');
Rtextbox = uicontrol('style','edit','units','normalized','position',[.00,.5,.05,.05],'string','R','callback','Rval__ = str2num(get(Rtextbox,''String''));' );



leftbutton = uicontrol('style', 'pushbutton', 'units','normalized', 'position', [.00,.3,.05,.05],'String', 'Go!','callback', 'rangefinder(dval__,Ival__,Rval__,Nval__);');