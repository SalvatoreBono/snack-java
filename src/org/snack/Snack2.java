package org.snack;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        String[] names = {"Giuseppe\tMongelli", "Giulio\tD'Angelo", "Roberto\tBenfini",
                "Salvatore\tBono", "Umberto Maria\tFaenza", "Massimo\tAzzini", "Alessandro\tCingolani",
                "Giuseppe\tGerace", "Alessandro\tMatricardi", "Alessandro\tPirisinu",
                "Salvatore Dario\tTorrisi", "Valerio\tCarbone", "Edoardo\tCicognani", "Gabriel\tD'Amico",
                "Francesco\tCarrara", "Vinicius\tDe Miranda", "Davide\tGila", "Luca\tMasera",
                "Mekki\tOuertani", "Matteo\tPupino", "Alberto\tStizzoli", "Cristian\tUrsino",
                "Luca\tMincuzzi", "Serena\tPeschiaroli"};

        Random randomGenerator = new Random();
        int randomNumber= randomGenerator.nextInt(names.length);
        String randomNames = names[randomNumber];
        System.out.println("Numero estratto è "+ randomNumber + " = " + randomNames);
    }
}
