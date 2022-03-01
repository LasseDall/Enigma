package com.company;

public class Main {

    char[] alfabet = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Æ', 'Ø', 'Å'};

    public void udskrivMenu(){
        System.out.printf("1) Cæsar %n2) Vigenére %n0) Exit");
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
    }
}
