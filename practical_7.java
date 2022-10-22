import java.util.*;

class account {

    String name;
    String acc_no;
    double balance=10000;
    String acc_type;

    int deposit;
    int withdwar;
    Scanner sc = new Scanner(System.in);

    
    account() {
        
        
        System.out.println("Account Holder's Name : ");
        name = sc.nextLine();
        System.out.println("Account Number : ");
        acc_no = sc.nextLine();
        // System.out.println("Account Type : ");
        // acc_type = sc.nextLine();

    }

    void withdrawl() {

        System.out.print("Enter Amout to withdwa ");
        withdwar = sc.nextInt();

    }

    void deposit() {
        System.out.print("Enter Amout to deposit ");
        deposit = sc.nextInt();

    }

    void display() {//display balance
        System.out.print("Your Balance is : " + balance);

    }

    void update_balance() {
        balance  = balance + deposit;
        balance = balance - withdwar;
        
    }

}

class curr_acc extends account {
    double serviceCharge;
    String chequebook;

    void issueCheque() {
        System.out.println("Issue Checque Book Holder Name : ");
        chequebook = sc.nextLine();

    }

    void minBallence() {
        if (balance < 5000) {
            System.out.println("Penalty Rs.500 Deducted : ");
            balance = balance - 500;
        }

    }
}

class sav_acc extends account {
    double intrest;
    
    void intrest() {
        intrest = (balance * 7 * 12) / 100;
        System.out.println("Simple Anual Intrest of 7% is : " + intrest);

    }
}


public class practical_7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        int i=0;
        while(i==0)
        {
            System.out.println("Enter Account Type | 1 Current  | 2 for Savings | 0 for exit ");
            Scanner sc1 = new Scanner(System.in);
            int ch = sc1.nextInt();
            switch(ch){
                case 1:
                System.out.println("Wellcome to HRS Bank Current account Profile ");
                curr_acc c = new curr_acc();
                while (i == 0) {
                    System.out.println("Enter | 1 Withdrawl  | 2 Deposit | 3 Display Bal | 4 Issue Cheque | 0 Exit ");
                    switch(ch){
                        case 1:
                        c.minBallence();
                        c.withdrawl();
                        break;
                
                    case 2:
                        c.deposit();
                        break;

                    case 3:
                        c.display();
                        break;

                    case 4:
                        c.issueCheque();
                        break;

                    case 0:
                        // return;
                    }   
                }
                break;
                
             case 2:
                System.out.println("Wellcome to HRS Bank Savings account Profile ");
                sav_acc s = new sav_acc();
                while (i == 0) {
                    System.out.println("Enter | 1 Withdrawl  | 2 Deposit | 3 Display Bal | 4 Issue Cheque | 0 Exit ");
                    switch(ch){
                    case 1:
                        s.withdrawl();
                        break;
                
                    case 2:
                        s.deposit();
                        break;

                    case 3:
                        s.display();
                        break;

                    case 4:
                        s.intrest();
                        break;

                    case 0:
                        return;
                    }   
                }
                break;

             case 0:
                return;
                
            }

        }
    }
}
