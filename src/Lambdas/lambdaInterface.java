package Lambdas;

interface Demo {

    void method();

}

public class lambdaInterface {
    public static void main(String[] args) {

        Demo demp = new Demo() {
            @Override
            public void method() {
                System.out.println("Hi");
            }
        };

        //USING LAMBDA EXPRESSION

        Demo demo = () -> System.out.println("Hi");

        demo.method(); // Output: Hi
    }
}
