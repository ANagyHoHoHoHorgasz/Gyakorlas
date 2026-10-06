package app;

import java.util.Scanner;

public class Gyakorlas {
///1 FELADAT
    public static void main(String[] args) {
        int szazalek;

        szazalek = bekeres("Hány százalék lett: ");
        koszontes(szazalek);
        int homerseklet;

        homerseklet = bekeres2("Hány fok van: ");
        koszontes2(homerseklet);
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
    ///2 FELADAT
    private static int bekeres2(String kerdes) {
        int homerseklet;

        System.out.print(kerdes);
        Scanner scr = new Scanner(System.in);
        homerseklet = scr.nextInt();

        return homerseklet;
    }

    private static void koszontes2(int homerseklet) {

        if (homerseklet <= 0) {
            System.out.println("fagy");
        } else if (homerseklet >= 0 && homerseklet <= 7) {
            System.out.println("hideg");
        } else if (homerseklet >= 8 &&homerseklet <= 15) {
            System.out.println("kellemes");
        } else if (homerseklet >= 16 &&homerseklet <= 25) {
            System.out.println("meleg");
        } else if (homerseklet >= 25) {
            System.out.println("forró");
        }
        
    }
}
