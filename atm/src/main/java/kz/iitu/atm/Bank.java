package kz.iitu.atm;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Bank implements BankInterface {

    private Long id;
    private String userName;
    private List<User> users;

    public Bank(Long id, String userName, List<User> users) {
        this.id = id;
        this.userName = userName;
        this.users = users;
    }

    public Bank() {
        this.userName = "Halyk bank (default)";
    }

    public List<User> getAccounts() {
        return users;
    }

    public void setAccounts(List<User> users) {
        this.users = users;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void addAccount(User user){
        users.add(user);
    }

    public boolean checkAccount(String accountNumber, int currentCin) {
        boolean ans = false;
        for (int i = 0; i < users.size(); i++) {
            if((users.get(i).getUserName() == accountNumber) && users.get(i).getPin() == currentCin){
                ans = true;
            }else
                ans = false;
        }
        return ans;
    }

    public void changePin(String accountNumber, int oldPin, int newPin) {
        for (int i = 0; i < users.size(); i++) {
            if((users.get(i).getUserName() == accountNumber) && users.get(i).getPin() == oldPin){
                users.get(i).setPin(newPin);
            }else
                System.out.println("Error");
        }
    }

    @Override
    public void checkBalance(String accountNumber) {
        for (int i = 0; i < users.size(); i++){
            if (users.get(i).getUserName() == accountNumber)
                System.out.println("Your balance is " + users.get(i).getBalance());
        }
    }

    @Override
    public void withdraw(String accountNumber, int amount) {
        for (int i = 0; i < users.size(); i++){
            if (users.get(i).getUserName() == accountNumber && users.get(i).getBalance() >= amount) {
                System.out.println("Withdraw succesfull");
                users.get(i).setBalance(users.get(i).getBalance() - amount);
            }else
                System.out.println("Balance is less than amount");
        }
    }

    @Override
    public void topUp(String accountNumber, int top) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName() == accountNumber)
                users.get(i).setBalance(users.get(i).getBalance() + top);
        }
    }
}
