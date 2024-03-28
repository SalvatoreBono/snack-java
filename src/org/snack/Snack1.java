package org.snack;

import java.util.Arrays;

public class Snack1 {
    public static void main(String[] args) {
        String[] ar = {"God of War", "Uncharted", "Persona 5"};
        for (int i = 0; i < ar.length ; i++) {
        String arUpperCase = ar[i].toUpperCase();
        ar[i] = arUpperCase;
        }
        System.out.println(Arrays.toString(ar));
    }
}
