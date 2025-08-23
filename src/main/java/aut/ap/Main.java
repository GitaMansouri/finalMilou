package aut.ap;

import aut.ap.cli.CLI;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Milou Email System ===");
        try {
            CLI.start();
        } catch (Exception e) {
            System.err.println("An error occurred while running the application: " + e.getMessage());
        }
    }
}