public class Client {
    String name;
    String accountName;
    String id;
    int pin;

    public Client(String clName, String acctName, String ident, int code){
        name=clName;
        accountName=acctName;
        id=ident;
        pin=code;
    }
    public String getName(){
        return name;
    }
    public String getAccountName(){
        return accountName;
    }
    public String getId() {
        return id;
    }
    public int getPin(){
        return pin;
    }

    public void setAccountName(String acctCatgry) {
        accountName = acctCatgry;
    }
    public void setName(String clName){
        name=clName;
    }
    public void setId(String ident){
        id=ident;
    }
    public void setPin(int code) {
        pin = code;
    }

    public String toString(){
        return "Client: "+name+"\nAcount: "+accountName+"\nID: "+id;
    }
}
