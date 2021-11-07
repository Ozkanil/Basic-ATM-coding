package BankAccount;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void deposit(double depositedAmount){
        this.balance= this.balance+depositedAmount;
    }

    public void withdrawal(double withdrawnAmount){
        if (balance-withdrawnAmount<0){
            System.out.println("You don't have sufficient balance!");
        }else {
            balance= balance-withdrawnAmount;
            System.out.println(withdrawnAmount+ " withdrawn from your account. Your new balance is "+ balance + (balance==0?" Deposit fund!":""));

        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

