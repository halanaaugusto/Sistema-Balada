package br.senai.sp.balada;

import java.util.Scanner;

public class Balada {

    public static void main(String[] args) {

        String nome, nomeAcompanhante;
        long CPF, cpfAcompanhante;
        long RG, rgAcompanhante;
        int idade = 0, idadeAcompanhante = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("---------------------------------");
        System.out.println("Bem vindo!! Identifique-se:");
        System.out.print("Informe seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Informe seu CPF: ");
        CPF = teclado.nextLong();
        System.out.print("Informe seu RG: ");
        RG = teclado.nextLong();
        System.out.print("Informe sua idade: ");

        while(idade == 0){
            if(teclado.hasNextInt()){
                idade = teclado.nextInt();
            } else {
                System.out.println("Erro!! Digite um número inteiro!");
                teclado.next();
            }
        }

        if (idade >= 18 && idade % 2 == 0) {
            System.out.println("Liberado");
        } else if (idade >= 18 && idade %2 != 0) {
            System.out.print("Informe seu nome (Acompanhante): ");
            nomeAcompanhante = teclado.next();
            System.out.print("Informe seu CPF (Acompanhante): ");
            cpfAcompanhante = teclado.nextLong();
            System.out.print("Informe seu RG (Acompanhante): ");
            rgAcompanhante = teclado.nextLong();
            System.out.print("Informe sua idade (Acompanhante): ");
            idadeAcompanhante = teclado.nextInt();
        } else {
            System.out.println("Proibido a entrada de Menor de Idade!");
        }
        if ((idade+idadeAcompanhante)%2==0 && idadeAcompanhante >= 18){
            System.out.println("Entrem!!");
        } else {
            System.out.println("Vão embora!");
        }

        /** Dados do Cliente */
        System.out.println("---------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("RG: " + RG);
        System.out.println("Idade: " + idade);
        System.out.println("---------------------------------");
    }


}
