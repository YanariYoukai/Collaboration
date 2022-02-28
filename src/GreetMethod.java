public class GreetMethod {
    private String myName;
    private int age;

    public GreetMethod() {
        System.out.println("my base lang is Java");
        this.myName = "Radek Kocka";
        this.age = 30;
    }

 
    public void greet(String name) {
        System.out.println("Greetings for the " + name + "!");
 
    }
}