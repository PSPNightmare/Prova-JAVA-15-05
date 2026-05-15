/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova_Java1305;

import java.util.Scanner;

/**
 *
 * @author BERNARDOMACHADODEBOR
 */
public class Fuga_do_Assassino {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resp;

        System.out.println("==================");
        System.out.println("     CONTEXTO     ");
        System.out.println("==================");

        System.out.println(" Voçê como jogador se encontra de frente de "
                + "um gerador de energia quebrado no escuro e começa a ouvir passos se aproximando");

        do {
            System.out.println("                    ");
            System.out.println("Oque voçê faz?");
            System.out.println("--------------");
            System.out.println("1. Consertar fios (+25% de progresso),");
            System.out.println("2. Esconder-se no armário (pausa)");
            System.out.println("0. Correr para a floresta (desistir)");

            resp = sc.nextInt();

            switch (resp) {

                case 1:

                    int porcentagem = 0;

                    int resultado = concertar(porcentagem);

                    if (resultado >= 100) {
                        System.out.println("Voçê terminou o gerador e ganhou o jogo, PARABENS!!!");
                        return;
                    }
                    break;

                case 2:
                    System.out.println("Voçê se escondeu no armário, nada acontece");
                    break;

                case 0:
                    System.out.println("Voçê correu para o floresta e morreu");
                    System.out.println("=====================================");
                    System.out.println("               GAME OVER             ");
                    System.out.println("=====================================");
                    return;
            }

        } while (resp != 0);
    }

    public static int concertar(int porcentagem) {
        Scanner sc = new Scanner(System.in);
        int resp;

      
        do {

            porcentagem += 25;
            
            System.out.println("o gerador está com " +porcentagem+ "% de carga total (MAX.100%)");
            
            System.out.println("Gostaria de reparar denovo \n 1-sim \n 2-não ?");
            resp = sc.nextInt();

            if (porcentagem >= 100) {
                return porcentagem;
            }
            
        } while (resp != 2);

        return porcentagem;
    }

}
