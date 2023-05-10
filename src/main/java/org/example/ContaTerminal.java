package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int conta = 0;
        boolean validacao1 = false;
        int agencia = 0;
        boolean validacao2 = false;
        String nomeCliente;
        double saldo = 0;
        boolean validacao4 = false;

        while(!validacao1){
            System.out.println("numero da conta : ");
            String imput1 = sc.nextLine();
            try{
                conta = Integer.parseInt(imput1);
                validacao1 = true;
            }catch(NumberFormatException e){
                System.out.println(" ");
                System.out.println("******************");
                System.out.println("*FORMATO INVALIDO*");
                System.out.println("******************");
                System.out.println(" ");
            }
        }
        while(!validacao2){
            System.out.println("numero da agencia : ");
            String imput2 = sc.nextLine();
            try{
                agencia = Integer.parseInt(imput2);
                validacao2 = true;
            }catch(NumberFormatException e){
                System.out.println(" ");
                System.out.println("******************");
                System.out.println("*FORMATO INVALIDO*");
                System.out.println("******************");
                System.out.println(" ");
            }
        }
        System.out.println("Seu nome : ");
        String imput3 = sc.nextLine();
        nomeCliente = imput3;

        while(!validacao4){
            System.out.println("Saldo da conta : ");
            System.out.println("*NOTA* troque ( , ) por ( . )");
            String imput4 = sc.nextLine();
            try{
                double d = Double.parseDouble(imput4);
                saldo = d;
                validacao4 = true;
            }catch(NumberFormatException e){
                System.out.println("");
                System.out.println("******************");
                System.out.println("*FORMATO INVALIDO*");
                System.out.println("******************");
                System.out.println("");
            }
        }

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+ conta +" e seu saldo "+saldo+" já está disponível para saque");

        sc.close();
    }
}