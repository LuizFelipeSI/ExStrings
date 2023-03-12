package br.edu.univas;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("digite uma palavra:");

        String palavra = scan.next();
        String[] vogaisMaiusculas = new String[palavra.length()];

        for (int i = 0; i < palavra.length(); i++) {
            vogaisMaiusculas[i] = String.valueOf(palavra.charAt(i));
            if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i' || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u')
            {
               String vogal = String.valueOf(palavra.charAt(i));
               vogal = vogal.toUpperCase();
               vogaisMaiusculas[i] = vogal;
            }
        }

        for (String vogaisMaiuscula : vogaisMaiusculas) {
            System.out.print(vogaisMaiuscula);
        }
    }
}
