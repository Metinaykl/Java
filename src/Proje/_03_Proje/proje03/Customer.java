package Proje._03_Proje.proje03;

import java.util.List;

public class Customer {

    public String userName;
    public String password;
    public List<Account> accounts;

    public Customer(String userName, String password, List<Account> accounts) {
        this.userName = userName;
        this.password = password;
        this.accounts = accounts;
    }
}
