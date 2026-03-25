class dconstruct {
    dconstruct(int x) {
        System.out.println("I am inside parameterized constructor");
    }
}

public class defaultConstructor {
    public static void main(String[] args) {
        System.out.println("See your default constructor");
        dconstruct d = new dconstruct(0);
    }
}
