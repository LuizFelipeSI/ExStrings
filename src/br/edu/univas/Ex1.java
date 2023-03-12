package br.edu.univas;

import java.util.Scanner;

public class Ex1 {

    public static void main (String []args) {

        Scanner scan = new Scanner(System.in);
        String[] tracos = new String[40];

        for (int i = 0; i < 40; i++) {
            tracos[i] = "_";
        }

        System.out.println("digite uma palavra de no máximo 40 letras: (caso mais palavras sejam digitadas, somente a primeira será considerada)");
        String palavra = scan.next();
        if (palavra.length() > tracos.length) {
            System.out.println("número de letras excede o limite");
        } else {
            int numeroDaPosicao = palavra.length();

            for (int i = tracos.length-1; i >=0; i--) {
                if (i == 39) {
                    tracos[i] = palavra.substring(numeroDaPosicao);
                    numeroDaPosicao--;
                } else {
                    tracos[i] = palavra.substring(numeroDaPosicao, numeroDaPosicao+1);
                    numeroDaPosicao--;
                    if (numeroDaPosicao < 0) {
                        break;
                    }
                }
            }

            for (String traco : tracos) {
                System.out.print(traco);
            }
        }
    }
}