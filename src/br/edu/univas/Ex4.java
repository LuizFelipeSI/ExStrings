package br.edu.univas;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("digite o CPF:");
        String cpf = scan.next();

        int[] multiplicadores = new int[9];
        int[] multiplicadores2 = new int[10];
        int inicioMultiplicadores = 2;

        int[] numerosCpf = new int[11];
        int[] cpfDezDigitos = new int[10];
        int[] cpfOnzeDigitos = new int[11];

        int qtdMult = multiplicadores.length;
        int qtdMult2 = multiplicadores2.length;
        int somaCpf = 0;
        int dig;
        int dig2;

        //tranformar String em int

        int j = 0;
        for (int i = 0; i < 11; i++) {
            if (String.valueOf(cpf.charAt(j)).equals(".") || String.valueOf(cpf.charAt(j)).equals("-")) {
                j++;
                i--;
            } else {
                numerosCpf[i] = Integer.parseInt((String.valueOf((cpf.charAt(j)))));
                j++;
            }
        }

        //preencher multiplicadores

        for (int i = 0; i < 9; i++) {
            multiplicadores[i] = inicioMultiplicadores;
            inicioMultiplicadores++;
        }
        inicioMultiplicadores = 2;

        //preencher multiplicadores2

        for (int i = 0; i < 10; i++) {
            multiplicadores2[i] = inicioMultiplicadores;

            inicioMultiplicadores++;
        }

        //preencher cpfDezGigitos

        for (int i = 0; i < 9; i++) {
            somaCpf += numerosCpf[i] * multiplicadores[qtdMult-1];
            qtdMult--;
            cpfDezDigitos[i] = numerosCpf[i];
        }
        if (somaCpf % 11 < 2) {
            dig = 0;
        } else {
            dig = 11 - (somaCpf % 11);
        }
        cpfDezDigitos[9] = dig;
        somaCpf = 0;

        //preencher cpfOnzeGigitos

        for (int i = 0; i < 10; i++) {
            somaCpf += cpfDezDigitos[i] * multiplicadores2[qtdMult2-1];
            qtdMult2--;
            cpfOnzeDigitos[i] = cpfDezDigitos[i];
        }
        if (somaCpf % 11 < 2) {
            dig2 = 0;
        } else {
            dig2 = 11 - (somaCpf % 11);
        }
        cpfOnzeDigitos[10] = dig2;

        //dizer se o cpf é válido ou não

        for (int i = 0; i < 11; i++) {
            if (numerosCpf[i] != cpfOnzeDigitos[i]) {
                System.out.println("cpf inválido");
                break;
            } else if (i == 10 && numerosCpf[i] == cpfOnzeDigitos[i]){
                System.out.println("cpf válido");
            }
        }
    }
}
