package com.hospital.util;

import java.util.Scanner;

public class InputUtil {
	private static Scanner scanner = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int getInt(String prompt) {
        System.out.print(prompt);
        return Integer.parseInt(scanner.nextLine());
    }

    public static void closeScanner() {
        scanner.close();
    }

}
