package ua.edu.chmnu.network.java;

import java.net.URL;
import java.util.Scanner;

public class URLValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("=== URL Validator ===");
        System.out.println("Enter URL to verify or 'exit' to finish:");

        while (true) {
            System.out.print("Enter URL: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Program is finished.");
                break;
            }

            if (isValidURL(input)) {
                System.out.println("URL is valid");
            } else {
                System.out.println("Invalid URL");
            }
        }

        scanner.close();
    }

    public static boolean isValidURL(String urlString) {
        try {
            new URL(urlString);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}