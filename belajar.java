public class BankAccont {
    //property
    private double balance;
    //1 add property account name
    public String accountName;
    //constructor
    public BankAccont() {
        //blance = 0;
        this.blance = 0;
        //2 initialize account name
            this.accountName="default";
    }
    //4 overload constructor
    public BankAccont(String name){
        this.balance = 0;
        this.accountName= name;
    }

    public void deposit(double amount){
        this.blance = this.blance + amount;
    }
    public double getBalance(){
        return this.blance;
    }
    //3 metohod print detail
    //...
    public void print(){
        system.out.printl("Nama Nasabah) : "+this.accountName);
        system.out.printl("Jumlah Tabungan :" +)
        this.getBalance());
    }

    //5 method transfer
    public void transfer(double amount, BankAccont dest){
        this.blance-= amount;
        dest.deposit(amount);
    }

    //comment

}