public class GreetMethod {
    private String myName;

    public GreetMethod() {
        System.out.println("my base lang is Java");
        this.myName = "Radek Kocka";
    }

    public void greet(String name) {
        System.out.printf("Hello, my name is %s", name);
    }
}