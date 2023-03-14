package br.edu.univas;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("digite o CPF:");
        String cpf = scan.next();

        int[] multiplicadores = new int[10];
        int[] numerosCpf = new int[11];
        int inicioMultiplicadores = 2;
        int qtdMult = multiplicadores.length;
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

        for (int i = 0; i < 10; i++) {
            multiplicadores[i] = inicioMultiplicadores;
            inicioMultiplicadores++;
        }

        //descobrir o primeiro digito

        for (int i = 0; i < 9; i++) {
            somaCpf += numerosCpf[i] * multiplicadores[qtdMult-2];
            qtdMult--;
        }
        qtdMult = multiplicadores.length;

        if (somaCpf % 11 < 2) {
            dig = 0;
        } else {
            dig = 11 - (somaCpf % 11);
        }
        somaCpf = 0;

        //descobrir o segundo digito

        for (int i = 0; i < 10; i++) {
            somaCpf += numerosCpf[i] * multiplicadores[qtdMult-1];
            qtdMult--;
        }

        if (somaCpf % 11 < 2) {
            dig2 = 0;
        } else {
            dig2 = 11 - (somaCpf % 11);
        }

        //dizer se é válido

        if (dig != numerosCpf[9] || dig2 != numerosCpf[10]) {
            System.out.println("cpf inválido");
        } else {
            System.out.println("cpf válido");
        }
    }
}
