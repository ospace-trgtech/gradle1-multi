/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package application;

import library.Library;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Library lib = new Library();
        System.out.println(">> " + lib.hello());
    }
}
