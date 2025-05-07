package classWork;

public class staticFinal {
    //where do we initialize a static final variable
    //ans: static block
    final static int y;

    static {
        y = 60;
    }

    //where do we initialize a final variable
    //ans : constructors
    final int x;

    staticFinal() {
        x = 20;
    }

    public static void main(String[] args) {

    }
}
