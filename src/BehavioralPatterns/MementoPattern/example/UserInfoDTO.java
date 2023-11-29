package BehavioralPatterns.MementoPattern.example;

public class UserInfoDTO {
    private String account;
    private String password;
    private String tel;

    public String getAccount() {
        return account;
    }

    public UserInfoDTO setAccount(String account) {
        this.account = account;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserInfoDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getTel() {
        return tel;
    }

    public UserInfoDTO setTel(String tel) {
        this.tel = tel;
        return this;
    }

    public Memento saveMemento(){
        return new Memento(account, password, tel);
    }

    public void restoreMemento(Memento memento){
        this.account = memento.getAccount();
        this.password = memento.getPassword();
        this.tel = memento.getTel();
    }

    public void show(){
        System.out.println("************************");
        System.out.println("** Account: " + account);
        System.out.println("** Password: " + password);
        System.out.println("** Telephone: " + tel);
        System.out.println("************************");
    }
}
