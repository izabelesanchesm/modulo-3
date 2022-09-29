package com.exemplo.pratica.util;

import java.util.*;

public class ConversorCodigoMorseParaPortugues {

    static char[] alfabeto = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '.'};
    static String[] morse = { ".-" , "-..." , "-.-." , "-.." , "." , "..-." , "--." , "...." , ".." , ".---" , "-.-" , ".-.." , "--" , "-." , "---" , ".--." , "--.-" ,  ".-." , "..." , "-" , "..-" , "...-" , ".--" , "-..-" , "-.--" , "--.." , "|"};

    public static String conversor(String palavra) {
        String retorno = "";
        String texto = palavra;
        String[] palavras = null;
        if (texto.contains("  ")) {
            palavras = texto.split("  ");
        } else {
            palavras = new String[1];
            palavras[0] = texto;
        }

        for (String letra: palavras){
            String[] caracteres = letra.split(" ");
            for(int h = 0;h < caracteres.length;h++){
                for(int i = 0;i < morse.length;i++){
                    if(caracteres[h].equals(morse[i])){
                        retorno += alfabeto[i];
                    }
                }
            }
        }

        return retorno.toUpperCase();
    }

}
