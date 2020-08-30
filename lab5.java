import java.util.Scanner;

public class lab5 {
    public static void main(String arg[]) {
        Scanner KB = new Scanner(System.in);
        //create initial accounts
        System.out.print("How Many Customer U Want to Input : ");
        int n = KB.nextInt();
        Bank C[] = new Bank[n];
        for (int i = 0; i < C.length; i++)
            C[i] = new Bank();
            C[i].openAccount();
        }
    }
class Base {
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
    // ONLY for Interest Account and Checking Account
    // for others declared in their respective classes.
    double Interest(double n) {
        double x = n * (0.07);
        return x;
    }
}
class Regular_Account extends Base {
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
class Interest_Account extends Base {
    double Penalty(double n) {
        return 0;
    }
}
class Checking_Account extends Base {
    double Penalty(double n) {
        if (n < 1000) {
            return 50;
        } else {
            return 0;
        }
    }
    void Charge_Transaction() {
        double x;
        System.out.println("Enter amount of money which you want to Transfer.");
        x = sc.nextInt();
        x = x * (0.10);
        System.out.print("Amount for Sucessful Transaction : ");
        System.out.print(x);
    }
}
class CD_Account extends Base {
    double Interest(double n) {

    }
}
import java.util.Date;



public class Account {

//define var1, var2
	private int id = 0;
	private double balance= 0;
	private static double annualInterestRate = 0;
	private Date dateCreated = new Date();
//no arg constructer
	Account() {

		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
	}
//constructor with specific id and initial balance
public Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	 Account(int newId, double newBalance, double newAnnualInterestRate) {
		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
	}
//accessor/mutator methods for id, balance, and annualInterestRate
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setId(int newId) {
		id = newId;
	}
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	public static void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
//accessor method for dateCreated

public Date getDateCreated() {

	return dateCreated;
	}
//define method getMonthlyInterestRate
	double getMonthlyInterestRate() {
		return annualInterestRate/12/100 * balance;
	}
//define method withdraw
	double withdraw(double amount) {
		return balance -= amount;
	}
//define method deposit
	double deposit(double amount) {
		return balance += amount;
	}
}
