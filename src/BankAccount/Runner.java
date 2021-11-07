package BankAccount;

public class Runner {

    public static void main(String[] args) {
        BankAccount tim= new BankAccount();

        tim.setCustomerName("Tim");
        tim.setPhoneNumber("+1 00545 87");
        tim.setEmail("tim@gmail.com");
        tim.setAccountNumber(89562);
        tim.setBalance(100000);
        tim.withdrawal(20000);
        tim.withdrawal(50000);
        tim.withdrawal(20000);
        System.out.println(tim.getBalance());


    }
}
