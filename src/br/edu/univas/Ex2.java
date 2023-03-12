package br.edu.univas;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] unidade = new String[10];
        String[] dezena = new String[10];
        String[] dezenaespecial = new String[10];
        String[] meses = new String[12];
        String conexao = " e ";
        String conexao2 = " de ";

        unidade[0] = "";
        unidade[1] = "um";
        unidade[2] = "dois";
        unidade[3] = "três";
        unidade[4] = "quatro";
        unidade[5] = "cinco";
        unidade[6] = "seis";
        unidade[7] = "sete";
        unidade[8] = "oito";
        unidade[9] = "nove";

        dezena[0] = "";
        dezena[1] = "dez";
        dezena[2] = "vinte";
        dezena[3] = "trinta";

        dezenaespecial[0] = "dez";
        dezenaespecial[1] = "onze";
        dezenaespecial[2] = "doze";
        dezenaespecial[3] = "treze";
        dezenaespecial[4] = "quatorze";
        dezenaespecial[5] = "quinze";
        dezenaespecial[6] = "dezesseis";
        dezenaespecial[7] = "dezessete";
        dezenaespecial[8] = "dezoito";
        dezenaespecial[9] = "dezenove";

        meses[0] = "janeiro";
        meses[1] = "fevereiro";
        meses[2] = "março";
        meses[3] = "abril";
        meses[4] = "maio";
        meses[5] = "junho";
        meses[6] = "julho";
        meses[7] = "agosto";
        meses[8] = "setembro";
        meses[9] = "outubro";
        meses[10] = "novembro";
        meses[11] = "dezembro";

        System.out.println("digite o dia:");
        int dia = scan.nextInt();
        int dia2;
        String diaPorExtenso = "";

        if (dia > 0 && dia < 10) {
            diaPorExtenso = unidade[dia];
        }
        else if (dia > 9 && dia < 20) {
            dia = dia % 10;
            diaPorExtenso = dezenaespecial[dia];
        } else if (dia > 19 && dia < 32) {
            dia2 = dia % 10;
            dia = dia / 10;
            if (dia2 == 0) {
                diaPorExtenso = dezena[dia];
            } else {
                diaPorExtenso = dezena[dia] + conexao + unidade[dia2];
            }
        }

        System.out.println("digite o mês:");
        int mes = scan.nextInt();

        System.out.println("digite o ano:");
        int ano = scan.nextInt();

        System.out.println(diaPorExtenso + conexao2 + meses[mes-1] + conexao2 + ano);
    }
}
