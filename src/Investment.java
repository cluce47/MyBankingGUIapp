public class Investment extends Account {
    public Investment(double bal, String catgry) {
        super(bal, catgry);
    }
    private void withdraw(double amt, double rate){
        setBalance(getBalance()-amt-(rate/100)*getBalance());
    }
}
