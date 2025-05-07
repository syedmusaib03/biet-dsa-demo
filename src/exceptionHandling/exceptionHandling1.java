package exceptionHandling;


public class exceptionHandling1 {
    public static void main(String[] args) {
        int i = 2, j = 0, k ;

        try {
            k = i / j;
            System.out.println(k);
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide By Zero");
           // e.printStackTrace(); // to know which line has error
        } finally {
            System.out.println("End Of Exception");
        }

        //we can create object for iib like this also
        //to print iib we need to create object compulsorly
        new exceptionHandling1();
        {
            System.out.println("instance initializer block");
        }


    }
    //static Block
    static {
        System.out.println("lastly typed");
    }
}
