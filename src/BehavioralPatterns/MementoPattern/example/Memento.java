package BehavioralPatterns.MementoPattern.example;

public class Memento {
    private String account;
    private String password;
    private String tel;

    public Memento(String account, String password, String tel) {
        System.out.println("---- [Creating memento] ----");
        this.account = account;
        this.password = password;
        this.tel = tel;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
