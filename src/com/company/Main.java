package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    char[] alfabet = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Æ', 'Ø', 'Å'};

    Scanner sc = new Scanner(System.in);

    public void udskrivHovedenu() {
        System.out.printf("1) Cæsar %n2) Vigenére %n0) Exit %n");
        valgHovedmenu();
    }

    public void valgHovedmenu() {
        int valg = sc.nextInt();
        if (valg == 1) {
            udskrivCæsarMenu();
        } else if (valg == 2) {
            udskrivVigenéreMenu();
        } else if (valg == 0) {
            System.exit(0);
        } else {
            System.out.println("Indtast dit valg igen");
            valgHovedmenu();
        }
    }

    public void udskrivCæsarMenu() {
        System.out.printf("Cæsar %n  1) Kryptér eller %n  2) Dekryptér %n");
        valgCæsarMenu();
    }

    public void valgCæsarMenu() {
        int valg = sc.nextInt();
        if (valg == 1) {
            cæsarKryptér();
        } else if (valg == 2) {
            cæsarDekryptér();
        } else {
            System.out.println("Indtast dit valg igen");
            valgCæsarMenu();
        }
    }

    public void udskrivVigenéreMenu() {
        System.out.printf("Vigenére %n  1) Kryptér eller %n  2) Dekryptér %n");
        valgVigenéreMenu();
    }

    public void valgVigenéreMenu() {
        int valg = sc.nextInt();
        if (valg == 1) {
            vigenéreKryptér();
        } else if (valg == 2) {
            vigenéreDekryptér();
        } else {
            System.out.println("Indtast dit valg igen");
            valgVigenéreMenu();
        }
    }

    public void cæsarKryptér() {
        System.out.printf("Cæsar kryptering %n  Indtast tekst %n");
        String tekst = sc.nextLine();
        tekst = sc.nextLine();
        System.out.println("  Vælg shift (0-29)");
        int shift = sc.nextInt();
        System.out.println("  Kodeteksten er");
        System.out.println("  XXXXXXXXX");
        udskrivPostCæsarKryptérMenu();
    }

    public void cæsarDekryptér() {
        System.out.printf("Cæsar dekryptering %n  Indtast kodetekst %n");
        String kodetekst = sc.nextLine();
        kodetekst = sc.nextLine();
        System.out.println("  Vælg shift (0-29)");
        int shift = sc.nextInt();
        System.out.println("  Originalteksten er");
        System.out.println("  XXXXXXXXX");
        udskrivPostCæsarDekryptérMenu();
    }

    public void vigenéreKryptér() {
        System.out.printf("Vigenére kryptering %n  Indtast tekst %n");
        String tekst = sc.nextLine();
        tekst = sc.nextLine();
        System.out.println("  Indtast nøgleord");
        int nøgleord = sc.nextInt();
        System.out.println("  Kodeteksten er");
        System.out.println("  XXXXXXXXX");
        udskrivPostViginéreKryptérMenu();
    }

    public void vigenéreDekryptér() {
        System.out.printf("Vigenére dekryptering %n  Indtast kodetekst %n");
        String kodetekst = sc.nextLine();
        kodetekst = sc.nextLine();
        System.out.println("  Indtast nøgleord");
        int nøgleord = sc.nextInt();
        System.out.println("  Originalteksten er");
        System.out.println("  XXXXXXXXX");
        udskrivPostViginéreDekryptérMenu();
    }

    public void udskrivPostViginéreKryptérMenu() {
        System.out.printf("1) Ny tekst %n2) Dekryptér%n0) Hovedmenu %n");
        valgPostViginéreKryptérMenu();
    }

    public void udskrivPostCæsarKryptérMenu() {
        System.out.printf("1) Ny tekst %n2) Dekryptér%n0) Hovedmenu %n");
        valgPostCæsarKryptérMenu();
    }

    public void udskrivPostViginéreDekryptérMenu() {
        System.out.printf("1) Ny kodetekst %n2) Kryptér%n0) Hovedmenu %n");
        valgPostViginéreDekryptérMenu();
    }

    public void udskrivPostCæsarDekryptérMenu() {
        System.out.printf("1) Ny kodetekst %n2) Kryptér%n0) Hovedmenu %n");
        valgPostCæsarDekryptérMenu();
    }

    public void valgPostViginéreKryptérMenu() {
        int valg = sc.nextInt();
        if (valg == 1) {
            vigenéreKryptér();
        } else if (valg == 2) {
            vigenéreDekryptér();
        } else {
            udskrivHovedenu();
        }
    }

    public void valgPostViginéreDekryptérMenu() {
        int valg = sc.nextInt();
        if (valg == 1) {
            vigenéreDekryptér();
        } else if (valg == 2) {
            vigenéreKryptér();
        } else {
            udskrivHovedenu();
        }
    }

    public void valgPostCæsarKryptérMenu() {
        int valg = sc.nextInt();
        if (valg == 1) {
            cæsarKryptér();
        } else if (valg == 2) {
            cæsarDekryptér();
        } else {
            udskrivHovedenu();
        }
    }

    public void valgPostCæsarDekryptérMenu() {
        int valg = sc.nextInt();
        if (valg == 1) {
            cæsarDekryptér();
        } else if (valg == 2) {
            cæsarKryptér();
        } else {
            udskrivHovedenu();
        }
    }

    public int bogstavTilTal(char bogstav) {
        int index = -1;
        for (int i=0; i< alfabet.length; i++) {
            if(bogstav ==alfabet[i]) {
                index = i;
                i = alfabet.length;
            }
        }
        return index;
    }

    public char talTilBogstav(int tal) {
        char bogstav = alfabet[tal];
        return bogstav;
    }

    public StringBuilder cæsarTekstTilKode(String tekst, int shift) {
        tekst = tekst.toUpperCase(Locale.ROOT);
        StringBuilder kodetekst = new StringBuilder();
        int kodeværdi;
        for (int i = 0; i < tekst.length(); i++) {
            char bogstav = tekst.charAt(i);
            int talVærdi = bogstavTilTal(bogstav);
            if (talVærdi != 0) {
                kodeværdi = talVærdi + shift;
            } else {
                kodeværdi = 0;
            }
            if (kodeværdi > 29) {
                kodeværdi = kodeværdi - 29;
            }
            char kodeBogstav = talTilBogstav(kodeværdi);
            kodetekst.append(kodeBogstav);
        }
        return kodetekst;
    }

    public StringBuilder cæsarKodeTilTekst(String kodetekst, int shift) {
        kodetekst = kodetekst.toUpperCase(Locale.ROOT);
        StringBuilder tekst = new StringBuilder();
        int talværdi;
        for (int i = 0; i < kodetekst.length(); i++) {
            char kodebogstav = kodetekst.charAt(i);
            int kodeværdi = bogstavTilTal(kodebogstav);
            if (kodeværdi != 0) {
                talværdi = kodeværdi - shift;
            } else {
                talværdi = 0;
            }
            if (talværdi < 0) {
                talværdi = talværdi + 29;
            }
            char bogstav = talTilBogstav(talværdi);
            tekst.append(bogstav);
        }
        return tekst;
    }


    public static void main(String[] args) {
	// write your code here
        Main obj = new Main();
        obj.udskrivHovedenu();
    }
}
