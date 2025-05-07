package classWork;

class constructor {


    int x;
    int y;


    constructor() {
        x = 20;
        y = 30;
    }

    constructor(int x, int y) {
        x = x;
        y = x;
    }

    constructor(float x, float y) {
        this.x = (int) x; // type casting
        this.y = (int) y; // type casting
    }
}


public class constrructors {
    public static void main(String[] args) {
        constructor obj1 = new constructor();
        constructor obj2 = new constructor(10, 20);
        constructor obj3 = new constructor(3.5f, 4.5f);


        System.out.println(obj1.x + " " + obj1.y);
        System.out.println(obj2.x + " " + obj2.y);


        System.out.println(obj3.x + " " + obj3.y);
    }
}
