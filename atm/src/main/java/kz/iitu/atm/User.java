package kz.iitu.atm;

import org.springframework.stereotype.Component;

@Component
public class User {

    private int id;
    private String userName;
    private int pin;
    private int balance;

    public User(int id, String login, int pin, int balance) {
        this.id = id;
        this.userName = login;
        this.pin = pin;
        this.balance = balance;
    }

    public User() {}

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public int getPin() {
        return pin;
    }

    public int getBalance() {
        return balance;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
