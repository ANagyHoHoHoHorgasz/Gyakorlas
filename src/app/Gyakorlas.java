package app;

import java.util.Scanner;

public class Gyakorlas {

    public static void main(String[] args) {
        int szazalek;

        szazalek = bekeres("Hány százalék lett: ");
        koszontes(szazalek);
    }

    private static int bekeres(String kerdes) {
        int szazalek;

        System.out.print(kerdes);
        Scanner scr = new Scanner(System.in);
        szazalek = scr.nextInt();

        return szazalek;
    }

    private static void koszontes(int szazalek) {

        if (szazalek >= 0 && szazalek <= 39) {
            System.out.println("Elégtelen");
        } else if (szazalek <= 50) {
            System.out.println("Elégséges");
        } else if (szazalek <= 64) {
            System.out.println("Közepes");
        } else if (szazalek <= 84) {
            System.out.println("Jó");
        } else if (szazalek <= 100) {
            System.out.println("Jeles");
        }

        if (szazalek == 100) {
            System.out.println("Gratulálok a 100%-hoz!");
        }
    }
}
