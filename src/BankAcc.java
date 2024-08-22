public class BankAcc {
    private static int nextId = 0; // Static variable to keep track of the next ID
    private final int id;
    private final String name;
    private final String surname;
    private long balance;

    private BankAcc(){
        this.id = 0;
        this.name = "";
        this.surname = "";
        this.balance = 0;
    }

    public BankAcc(String name, String surname, long balance) {
        this.id = nextId++;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }

    public long deposit(long a){
        this.balance = this.balance + a;
        return this.balance;
    }

    public long debit(long a){
        if (a<=this.balance){
            this.balance = this.balance - a;
        }else{
            System.out.println("Insufficient balance");
        }
        return this.balance;
    }
    public void getBankAcc(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.surname);
        System.out.println(this.balance);
    }
}
