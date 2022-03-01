package com.company;

import java.util.Scanner;

public class Main {

    char[] alfabet = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Æ', 'Ø', 'Å'};

    Scanner sc = new Scanner(System.in);

    public void udskrivMenu(){
        System.out.printf("1) Cæsar %n2) Vigenére %n0) Exit");
    }

    public void udskrivCæsarMenu(){
        System.out.printf("Cæsar %n  Kryptér eller %n  Dekryptér");
    }

    public void udskrivVigenéreMenu(){
        System.out.printf("Vigenére %n  Kryptér eller %n  Dekryptér");
    }

    public void cæsarKryptér(){
        System.out.printf("Cæsar kryptering %n  Indtast tekst %n");
        String tekst = sc.nextLine();
        System.out.println("  Vælg shift (0-29)");
        int shift = sc.nextInt();
        System.out.println("  Kodeteksten er");
        System.out.println("  XXXXXXXXX");
    }

    public void cæsarDekryptér(){
        System.out.printf("Cæsar dekryptering %n  Indtast kodetekst %n");
        String kodetekst = sc.nextLine();
        System.out.println("  Vælg shift (0-29)");
        int shift = sc.nextInt();
        System.out.println("  Originalteksten er");
        System.out.println("  XXXXXXXXX");
    }

    public void vigenéreKryptér(){
        System.out.printf("Vigenére kryptering %n  Indtast tekst %n");
        String tekst = sc.nextLine();
        System.out.println("  Indtast nøgleord");
        int nøgleord = sc.nextInt();
        System.out.println("  Kodeteksten er");
        System.out.println("  XXXXXXXXX");
    }

    public void vigenéreDekryptér(){
        System.out.printf("Vigenére dekryptering %n  Indtast kodetekst %n");
        String kodetekst = sc.nextLine();
        System.out.println("  Indtast nøgleord");
        int nøgleord = sc.nextInt();
        System.out.println("  Originalteksten er");
        System.out.println("  XXXXXXXXX");
    }

    public int bogstavTilTal(char bogstav){
        int index = -1;
        for (int i=0; i< alfabet.length; i++){
            if(bogstav ==alfabet[i]){
                index = i;
                i = alfabet.length;
            }
        }
        return index;
    }

    public char talTilBogstav(int tal){
        char bogstav = alfabet[tal];
        return bogstav;
    }


    public static void main(String[] args) {
	// write your code here
        Main obj = new Main();
        obj.cæsarDekryptér();
    }
}
