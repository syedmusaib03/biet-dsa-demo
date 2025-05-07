package exceptionHandling;

public class throwException {


    public static void chechAge(int age) {
        if (age >= 18){
            System.out.println(age);
        }
        else {
            throw new RuntimeException("Not Eligible Access Denied");
        }

    }
    public static void main(String[] args) {
        chechAge(12);
    }
}
