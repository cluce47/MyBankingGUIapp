public class Credit extends Account {
    public Credit(double bal, String catgry) {
        super(bal, catgry);
    }
    private void deposit(double amt){
        setBalance(getBalance()-amt);
    }
    private void withdraw(double amt){
        setBalance(getBalance()+amt);
    }
}
