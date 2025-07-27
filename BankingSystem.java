package Mini_Training.Next;

import java.util.*;
class Bank{
    private int AcNo,BankId;
    private String Name;
    private double Balance,Withdraw;

    public void setAcNo(int AcNo){
        this.AcNo = AcNo;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public void setBankId(int BankId){
        this.BankId = BankId;
    }

    public void setBalance(double Balance){
        this.Balance = Balance;
    }

    public double setDeposit(int Deposit){
        Balance += Deposit;
        return Balance;
    }

    public String withdraw(Double Withdraw){
        if(Withdraw > Balance){
            return "Insufficient Balance";
        }
        else{
            Balance -= Withdraw;
            return "Sucess";
        }
    }

    public int getAcno(){
        return AcNo;
    }

    public String getName(){
        return Name;
    }

    public Double getBalance(){
        return Balance;
    }

    public Double getWithdraw(){
        return Withdraw;
    }

    public int getBankId(){
        return BankId;
    }


}
public class BankingSystem {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        Bank B = new Bank();
        B.setAcNo(4567);
        B.setName("Bhaskar");
        B.setBankId(850014);
        B.setBalance(1000);

        
        while(true){

            System.out.println("enter your choice : " + B.getName());
            System.out.println("1.Balance\n2.Deposit\n3.Withdraw\n4.Exit ");
            char choice = ss.next().charAt(0);

            switch(choice){
                case '3':
                System.out.print("Enter Withdrawl Amount : ");
                double wit = ss.nextDouble();
                String result = B.withdraw(wit);
                System.out.println( "withdraw is : " + result);
                System.out.println("Your reaming Balance : " + B.getBalance());
                break;

                case '2':
                System.out.print("Enter Deposit Amount : ");
                int dep = ss.nextInt();
                B.setDeposit(dep);
                System.out.println("New Balance is : "+B.getBalance());
                break;

                case '1':
                System.out.println(B.getBalance());
                break;

                case '4':
                System.out.println("Thanks for getting us : " + B.getName());
                return;

                case '5':
                System.out.println("Bank id is : " + B.getBankId());

                default:
                System.out.println("Invalid Choice");
                break;

            }
        }
    }
}

