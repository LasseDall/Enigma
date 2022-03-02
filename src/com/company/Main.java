package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    char[] alfabet = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Æ', 'Ø', 'Å'};

    char[] alfabet2 = {' ', 'B', 'A', 'D', 'C', 'F', 'E', 'H', 'G', 'J', 'I', 'L', 'K', 'N', 'M', 'P', 'O', 'R', 'Q', 'T', 'S', 'V', 'U', 'X', 'W', 'Z', 'Y', 'Ø', 'Æ', 'Å'};

    char[] alfabet3 = {' ', 'Å', 'X', 'O', 'K', 'T', 'L', 'N', 'H', 'P', 'Y', 'D', 'F', 'Z', 'G', 'C', 'I', 'S', 'Æ', 'Q', 'E', 'U', 'Ø', 'W', 'B', 'J', 'M', 'R', 'V', 'A'};

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
        String kodetekst = String.valueOf(cæsarTekstTilKode(tekst, shift));
        System.out.println("  Kodeteksten er");
        System.out.println("   " + kodetekst );
        udskrivPostCæsarKryptérMenu();
    }

    public void cæsarDekryptér() {
        System.out.printf("Cæsar dekryptering %n  Indtast kodetekst %n");
        String kodetekst = sc.nextLine();
        kodetekst = sc.nextLine();
        System.out.println("  Vælg shift (0-29)");
        int shift = sc.nextInt();
        String originaltekst = String.valueOf(cæsarKodeTilTekst(kodetekst, shift));
        System.out.println("  Originalteksten er");
        System.out.println("    " + originaltekst);
        udskrivPostCæsarDekryptérMenu();
    }

    public void vigenéreKryptér() {
        System.out.printf("Vigenére kryptering %n  Indtast tekst %n");
        String tekst = sc.nextLine();
        tekst = sc.nextLine();
        System.out.println("  Indtast nøgleord");
        String nøgleord = sc.nextLine();
        String kodetekst = String.valueOf(viginéreTekstTilKode(tekst, nøgleord));
        System.out.println("  Kodeteksten er");
        System.out.println("    " + kodetekst);
        udskrivPostViginéreKryptérMenu();
    }

    public void vigenéreDekryptér() {
        System.out.printf("Vigenére dekryptering %n  Indtast kodetekst %n");
        String kodetekst = sc.nextLine();
        kodetekst = sc.nextLine();
        System.out.println("  Indtast nøgleord");
        String nøgleord = sc.nextLine();
        String originaltekst = String.valueOf(viginéreKodeTilTekst(kodetekst, nøgleord));
        System.out.println("  Originalteksten er");
        System.out.println("    " + originaltekst);
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

    public char talTilBogstav(int tal){
        if (tal > 29) {
            tal = tal - 29;
        } else if (tal < 0) {
            tal = tal + 29;
        }
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
                if (talværdi == 0) {
                    talværdi = 29;
                }
            } else {
                talværdi = 0;
            }
            char bogstav = talTilBogstav(talværdi);
            tekst.append(bogstav);
        }
        return tekst;
    }

    public StringBuilder viginéreTekstTilKode(String tekst, String nøgleord) {
        tekst = tekst.toUpperCase(Locale.ROOT);
        nøgleord = nøgleord.toUpperCase(Locale.ROOT);
        StringBuilder kodetekst = new StringBuilder();
        StringBuilder nøgletekst = new StringBuilder();
        nøgletekst.append(nøgleord);
        int nøgleværdi;
        char kodebogstav;
        for (int i = 0; i < tekst.length(); i++) {
            char bogstav = tekst.charAt(i);
            int bogstavværdi = bogstavTilTal(bogstav);
            if (i == nøgletekst.length()) {
                nøgletekst.append(nøgleord);
            }
            char nøglebogstav = nøgletekst.charAt(i);
            nøgleværdi = bogstavTilTal(nøglebogstav) - 1;
            if (bogstavværdi != 0) {
                int kodeværdi = bogstavværdi + nøgleværdi;
                kodebogstav = talTilBogstav(kodeværdi);
            } else {
                kodebogstav = ' ';
            }
            kodetekst.append(kodebogstav);
        }
        return kodetekst;
    }

    public StringBuilder viginéreKodeTilTekst(String kodetekst, String nøgleord) {
        kodetekst = kodetekst.toUpperCase(Locale.ROOT);
        nøgleord = nøgleord.toUpperCase(Locale.ROOT);
        StringBuilder originaltekst = new StringBuilder();
        StringBuilder nøgletekst = new StringBuilder();
        nøgletekst.append(nøgleord);
        int nøgleværdi;
        char originalbogstav;
        for (int i = 0; i < kodetekst.length(); i++) {
            char kodebogstav = kodetekst.charAt(i);
            int kodeværdi = bogstavTilTal(kodebogstav);
            if (i == nøgletekst.length()) {
                nøgletekst.append(nøgleord);
            }
            char nøglebogstav = nøgletekst.charAt(i);
            nøgleværdi = bogstavTilTal(nøglebogstav) - 1;
            if (kodeværdi != 0) {
                int originalværdi = kodeværdi - nøgleværdi;
                if (originalværdi == 0) {
                    originalværdi = 29;
                }
                originalbogstav = talTilBogstav(originalværdi);
            } else {
                originalbogstav = ' ';
            }
            originaltekst.append(originalbogstav);
        }
        return originaltekst;
    }

    public StringBuilder enigmaTekstTilKode(String tekst) {
        tekst = tekst.toUpperCase(Locale.ROOT);
        StringBuilder kodetekst = new StringBuilder();
        for (int i = 0; i < tekst.length(); i++) {
            char bogstav = tekst.charAt(i);
            int bogstavværdi = bogstavTilTal(bogstav);
            char bogstav2 = alfabet2[bogstavværdi];
            int bogstavværdi2 = bogstavTilTal(bogstav2);
            char bogstav3 = alfabet3[bogstavværdi2];
            int bogstavværdi3 = bogstavTilTal(bogstav3);
            char bogstav4 = alfabet2[bogstavværdi3];
            int bogstavværdi4 = bogstavTilTal(bogstav4);
            char kodebogstav = alfabet[bogstavværdi4];
            kodetekst.append(kodebogstav);
        }
        return kodetekst;
    }

    public StringBuilder enigmaKodeTilTekst(String kodetekst) {
        kodetekst = kodetekst.toUpperCase(Locale.ROOT);
        StringBuilder tekst = new StringBuilder();
        for (int i = 0; i < kodetekst.length(); i++) {
            char bogstav = kodetekst.charAt(i);
            int bogstavværdi = bogstavTilTal(bogstav);
            char bogstav2 = alfabet2[bogstavværdi];
            int bogstavværdi2 = bogstavTilTal(bogstav2);
            char bogstav3 = alfabet3[bogstavværdi2];
            int bogstavværdi3 = bogstavTilTal(bogstav3);
            char bogstav4 = alfabet2[bogstavværdi3];
            int bogstavværdi4 = bogstavTilTal(bogstav4);
            char kodebogstav = alfabet[bogstavværdi4];
            tekst.append(kodebogstav);
        }
        return tekst;
    }



    public static void main(String[] args) {
	// write your code here
        Main obj = new Main();
        obj.udskrivHovedenu();
    }
}
