package pkg.inheritance;

// Superclass 1
class Grandfather {
    void land() {
        System.out.println("Grandfather has 1 acre of land.");
    }
}

// Superclass 2 (inherits from Grandfather)
class Father1 extends Grandfather {
    void building() {
        System.out.println("Father has 2 buildings.");
    }
}

// Subclass (inherits from Father)
class Son1 extends Father1 {
    void vehicle() {
        System.out.println("Son has 1 bike and 1 car.");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        Son1 s = new Son1();
        s.land();       // Inherited from Grandfather
        s.building();   // Inherited from Father
        s.vehicle();    // Defined in Son
    }
}

