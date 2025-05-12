package exceptionHandling.customeException;

//f
public class createCustomException extends Exception {
    private int amount;

    public createCustomException(int amount) {


        this.amount = amount;
    }

    @Override
    public String toString() {
        return "you do not have enough money";
    }

    public int getAmount() {
        return amount;
    }
}
