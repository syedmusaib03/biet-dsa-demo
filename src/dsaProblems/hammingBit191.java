package dsaProblems;

public class hammingBit191 {
    //with using modulo
    public static int method1(int n) {

        int count = 0;
        while (n != 0) {
            if (n % 2 == 1) {
                count++;
            }
            n /= 2;
        }
        return count;
    }

    //without using modulo
    //Bit wise or method
    public static int method2(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(method1(2147483645));

        System.out.println(method2(2147483645));
    }
}
