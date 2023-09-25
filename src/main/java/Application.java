
public class Application {
    /**
     * This class contains a main method that allows you to manually test the Hello World lab functionality.
     * No changes you make here affect the test case results. You must still run & pass the testcase.

     *
     * The Lab.sayHello method should produce a value, "Hello, World!", which this class should be able to print
     * when you run the main method.
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");

        Lab hello = new Lab();
        String output = hello.sayHello();

        System.out.println(output);
    }
}
