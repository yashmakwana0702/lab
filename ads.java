import java.util.Scanner;
class account {
    Scanner sc = new Scanner(System.in);
    double AccountCharges(double n) {
        double x = n;
        x = (0.10) * x;
        if (x < 50) {
            return x;
        } else {
            x = 50;
            return x;
        }
    }
    double Interest(double n) {
        double x = n * (0.07);
        return x;
    }
}
class regular extends account {
    @Override
    double Interest(double n) {
        return 0;
    }
    double Penalty(double n) {
        if (n < 500) {
            return 100;
        } else {
            return 0;
        }
    }
}
class interest extends account {
    double Penalty(double n) {
        return 0;
    }
}
class checking extends account {
    double Penalty(double n) {
        if (n < 1000) {
            return 50;
        } else {
            return 0;
        }
    }
    void transactioncharge() {
        double x;
        System.out.println("Enter amount of money which you want to Transfer.");
        x = sc.nextInt();
        x = x * (0.10);
        System.out.print("Amount for Sucessful Transaction : ");
        System.out.print(x);
    }
}
class cd extends account {
    @Override
    double Interest(double n) {
        double x = n * (0.15);
        return x;
    }
    double Penalty(double n) {
			System.out.println("is this your 2nd Transaction before 12 months if  no then enter 0 ");
			int c= sc.nextInt();
			if(c==0){
				return 0;
			}else{
        System.out.println("Penalty due to withdrawal before 12 months.");
        double x = n * (0.2);
        return x;
    }}
}
public class ads {
    static Scanner sc = new Scanner(System.in);
    static float pin, balance;
    static int id = 0;
    static float cur[][] = new float[100][3];
    public static void Create_Account(int x) {
        System.out.println("Your PIN is : " + Integer.toString(id));
        System.out.println("Entre your Balance : ");
        balance = sc.nextFloat();
        cur[id][0] = id;
        cur[id][1] = balance;
        cur[id][2] = x;
        id++;
    }
    public static boolean Check_Account(int pin, int x) {
        for (int i = 0; i < id; i++) {
            if (cur[i][0] == pin && cur[i][2] == x) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
				int x=1;
				while(x!=5){
        System.out.println("1.  open a new Account.");
        System.out.println("2. have an Existing Account.");
        int choice = scan.nextInt();
        System.out.println("Enter the type of Account : ");
        System.out.println(" [1]  Regular Account");
        System.out.println(" [2]  Interest Account");
        System.out.println(" [3]  Checking Accont");
        System.out.println(" [4]  CD Account");
        System.out.println("To exit enter 5 or ctrl+C ");
         x = scan.nextInt();
        if (x == 5)
            System.exit(0);
        if (choice == 1) {
            Create_Account(x);
        } else {
            System.out.println("Entre your PIN : ");
            int pin = scan.nextInt();
            if (Check_Account(pin, x)) {
                System.out.println("Welcome to our Bank");
                double PIN = pin, type = cur[pin][2], ans;
                double BALANCE = cur[pin][1];
                if (x == 1) {
                    regular current = new regular();
                    while (true) {
                        System.out.println("[1]. Account Charges");
                        System.out.println("[2]. Interest Charges");
                        System.out.println("[3]. Penalty");
												System.out.println(" [4] Account Balance");
                        System.out.println("[5]. Exit");
                        int y = scan.nextInt();
                        if (y == 4) {
                            break;
                        } else if (y == 3) {

                        }
                    }
                } else if (x == 2) {
                    interest current = new interest();
                } else if (x == 3) {
                    checking current = new checking();
                } else {
                    cd current = new cd();
                }
            } else {
                System.out.println("Check your PIN and TYPE of Account and Enter again");
            }}
        }
    }
}
