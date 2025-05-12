package exceptionHandling.customeException;

public class BankAccount  {
    private int amountWithDraw;
    private int balance = 15000;

    public BankAccount(int amountWithDraw ) {
        this.amountWithDraw = amountWithDraw;

    }
public void withdraw() throws createCustomException {
        if(amountWithDraw > balance) {
            throw new createCustomException(amountWithDraw);
        }
        else{
            System.out.println("Money WithDrawn");
            System.out.println("Balance : " +(balance-amountWithDraw));
        }

}

}
