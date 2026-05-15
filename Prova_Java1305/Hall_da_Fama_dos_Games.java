/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova_Java1305;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author BERNARDOMACHADODEBOR
 */
public class Hall_da_Fama_dos_Games {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        HashSet<String> lista = new HashSet<>();

        int resp;

        do {
            System.out.println("===================");
            System.out.println("  THE GAME AWARDS  ");
            System.out.println("===================");

            System.out.println("Voçê gostaria de : ");
            System.out.println("                   ");
            System.out.println("1. Indicar um Jogo ");
            System.out.println("2. Ver Lista ");
            System.out.println("0. Encerrar ");

            resp = sc2.nextInt();

            switch (resp) {

                case 1:
                    System.out.println("Quantos jogos voçê gostaria de indicar ?");
                    int quant = sc2.nextInt();

                    for (int i = 0; i < quant; i++) {
                        System.out.println("Indique o seu " + (i + 1) + " jogo: ");
                        String jogo = sc.nextLine();
                        //sc.nextLine();
                        lista.add(jogo);

                    }

                    System.out.println("Jogos adicionados com sucesso !!!");
                    break;

                case 2:

                    System.out.println("Qual jogo voçê gostaria de ver se tem adicionado na lista");
                    String jogoconf = sc.nextLine();
                    //sc2.nextLine();
                    boolean tem;
                    
                    if (lista.contains(jogoconf)) {
                        tem = true;

                    } else {
                        tem = false;
                    }
                    System.out.println("O jogo foi adicionado? " + tem);

                    break;
                case 0:
                    System.out.println("VoçÊ escolheu sair ");
                    return;

            }

        } while (resp != 0);

    }
}
