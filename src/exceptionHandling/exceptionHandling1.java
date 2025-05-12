package exceptionHandling;


public class exceptionHandling1 {
    //static Block
    static {
        System.out.println("Inside The Static Block");
    }

    public static void main(String[] args) {
        int i = 4;
        int j = 0;
        int k;

        try {
            k = i / j;
            System.out.println(k);
        } catch (ArithmeticException e) {
            System.out.println("Arithimetic Exception Occured");
           //  e.printStackTrace(); // to know which line has error
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        } catch (Exception e) { //it handles all type of above exception and need not to specify seprately
            System.out.println(e);
            
        }


        //we can create object for instance initializer block like this also
        //to print iib we need to create object compulsorly
        new exceptionHandling1();
        {
            System.out.println("Instance Initializer Block");
        }


    }
}
