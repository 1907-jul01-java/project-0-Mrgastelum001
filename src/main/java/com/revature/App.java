package com.revature;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Accounts Beatrice = new Accounts(1000000.00, 8000000.00);
        Beatrice.withdraw("C");
    }
}
