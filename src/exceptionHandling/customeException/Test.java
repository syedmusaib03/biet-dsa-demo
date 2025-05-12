package exceptionHandling.customeException;

public class Test {
    public static void main(String[] args) {
        BankAccount musaib = new BankAccount(18000);
        try {
            musaib.withdraw();
        }catch (createCustomException e) {
            System.out.println(e);
            System.out.println(e.getAmount());
        }

    }
}
