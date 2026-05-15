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
public class A_Lanterna_no_Escuro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int resp;
        int bateria = 100;

        System.out.println(" Voçe está em um corredor escuro e sua única fonte de luz é uma lanterna que começa com"
                + " 100% de bateria. \n Gerenciar recursos é vital");
        do {
            System.out.println("=================");
            System.out.println("      ESCOLHA    ");
            System.out.println("=================");

            System.out.println("1. Caminhar (-20%)");
            System.out.println("2. Trocar pilhas (+40%, máximo 100%)");

            resp = sc.nextInt();

            

            switch (resp) {
                case 1:

                    System.out.println("Voçê decidiu caminhar -20% de bateria");
                    bateria -= 20;
                    break;

                case 2:
                    System.out.println("Voçê decidiu recarregar a sua lanterna +40%");
                    bateria += 40;
                    if (bateria > 100) {
                        System.out.println("Carga maxima atingida ( 100% )");
                        bateria = 100;
                    }
                    break;

                default:
                    System.out.println("Apenas 1 e 2 ");
                    break;
            }

        } while (bateria != 0);

        System.out.println("SUA BATERIA ACABOU É VOCE MORREU PELOS MONSTROS");

    }

}
