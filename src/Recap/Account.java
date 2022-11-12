package Recap;

public class Account {
    long acc_no;
    String name;
    String email;
    double amount;

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
// greater methood
    public long getAcc_no() {
        return acc_no;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getAmount() {
        return amount;
    }
}
class TestAccount {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.acc_no=(7560504000L);
        acc.name=("Sumair");
        acc.email=("sumair@syntax.com");
        acc.amount=(50000.0);

        System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());


    }
}