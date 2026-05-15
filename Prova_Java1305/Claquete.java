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
public class Claquete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        String[][] matriz = new String[3][3];

        System.out.println("Digite os elementos para categorizar seu filme Título, Gênero e Nota, respectivamente ");
       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite aqui [" + i + "] [" + j + "]");
                matriz[i][j] = sc.nextLine();
            }
        }
        
        System.out.println("\nSua claquete:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
         
        
        
    }
}
