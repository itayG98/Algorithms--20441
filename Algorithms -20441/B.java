public class B extends A {

    public B() {
        System.out.println("B");
    }

    public void one() {
        System.out.println("One of B");
    }

    public void two() {
        System.out.println("Two of B");
    }

    public void three() {
        super.two();
    }
}
