package app;

import java.util.Scanner;

public class Gyakorlas {

    public static void main(String[] args) {
        /*//1.fel
        int szazalek;
        szazalek = bekeres("Hány százalék lett: ");
        koszontes(szazalek);
        //2.fel
        int homerseklet;
        homerseklet = bekeres2("Hány fok van: ");
        koszontes2(homerseklet);
        //3.fel
        int jegy;
        int diak;
        jegy = bekeres3("Hány éves vagy?: ");
        diak = bekeres32("Van diákod?(1=igen 2=nem): ");
        koszontes32(diak, jegy);
        koszontes3(jegy);*/
        //4.fel
        int menu;
        int kedvez;
        menu = bekeres4("hambi(1) pizza(2) vagy saláta menü(3)?: ");
        kedvez = bekeres42("Van kedvezményed?(1=igen 2=nem): ");
        koszontes42(kedvez, menu);
        koszontes4(menu);
    }
//1 FELADAT
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
    //2 FELADAT
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
        } else if (homerseklet == 0) {
            System.out.println("pont 0 fok van hideg de 0 fok");
        }else if (homerseklet >= 0 && homerseklet <= 7) {
            System.out.println("hideg");
        }else if (homerseklet >= 8 &&homerseklet <= 15) {
            System.out.println("kellemes");
        } else if (homerseklet >= 16 &&homerseklet <= 25) {
            System.out.println("meleg");
        } else if (homerseklet >= 25) {
            System.out.println("forró");
        }
        
    }
    //3 FELADAT
    private static int bekeres3(String kerdes) {
        int jegy;

        System.out.print(kerdes);
        Scanner scr = new Scanner(System.in);
        jegy = scr.nextInt();

        return jegy;
    }
    private static int bekeres32(String kerdes) {
        int diak;

        System.out.print(kerdes);
        Scanner scr = new Scanner(System.in);
        diak = scr.nextInt();

        return diak;}
    private static void koszontes32(int diak, int jegy) {

        if (diak == 1 && jegy >= 18) {
            System.out.println("felnőtt 1760 Ft");
        } else{
            System.out.println("felnőtt 2200 Ft");
        }
        
    }

    private static void koszontes3(int jegy) {

        if (jegy >= 0 && jegy <= 5) {
            System.out.println("ingyenes");
        } else if (jegy >= 6 &&jegy <= 13) {
            System.out.println("gyerek jegy 1200 Ft");
        } else if (jegy >= 14 &&jegy <= 17) {
            System.out.println("diák, 1600 Ft");
    }
}
    
    private static int bekeres4(String kerdes) {
        int menu;

        System.out.print(kerdes);
        Scanner scr = new Scanner(System.in);
        menu = scr.nextInt();

        return menu;
    }
    private static int bekeres42(String kerdes) {
        int kedvez;

        System.out.print(kerdes);
        Scanner scr = new Scanner(System.in);
        kedvez = scr.nextInt();

        return kedvez;}
    private static void koszontes42(int kedvez, int menu) {

        if (kedvez == 1 && menu == 1) {
            System.out.println("hamburger menü kedvezményes 1760Ft");
        } else if (kedvez == 1&& menu == 2){
            System.out.println("Pizza menü kedvezményes 2250Ft");
        }else if (kedvez == 1&& menu == 3){
            System.out.println("saláta menü kedvezményes 1620Ft");
        }
        
    }

    private static void koszontes4(int menu) {

        if (menu >= 1) {
            System.out.println("hamburger menü 2200Ft");
        } else if (menu >= 2) {
            System.out.println("pizza menü 2500Ft");
        } else if (menu >= 3) {
            System.out.println("saláta menü 1800Ft");
        }}}
