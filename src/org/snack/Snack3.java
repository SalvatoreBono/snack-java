package org.snack;

import java.util.Scanner;

public class Snack3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Inserisi una stringa");
        String str = keyboard.nextLine().toLowerCase();
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            char singleChar = str.charAt(i);
            if (singleChar == 'a'){
                counter++;
            }
        }
        System.out.println("Nella stringa " + str +" sono presenti " + counter + " a");
        keyboard.close();
    }
}
