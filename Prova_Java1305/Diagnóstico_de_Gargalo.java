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
public class Diagnóstico_de_Gargalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a qualidade da sua CPU ( 1 A 100 )");
        int n1 = sc.nextInt();
        
        System.out.println("Digite a qualidade da sua GPU ( 1 A 100 )");
        int n2 = sc.nextInt();
        
        if (n1 >100 && n2 > 100){
            System.out.println("Numero invalidom, pane no sistema!!!");
            return;
        }
        int resultado = diferenca (n1,n2);
        
        //System.out.println("A diferença foi de " +resultado+ " %");
        
        return;
        
    }
    
    public static int diferenca(int n1, int n2){
        
        n1 = n1 - n2;
        
         if (n1 <= 15 ) {
          
             System.out.println("o sistema é equilibrado, parabens!!!");
             System.out.println("A diferença foi menor que 15");
             
         } else {
             System.out.println("O sistema é desequilibrado troque suas peças!!!");
              System.out.println("A diferença foi maior que 15");
         }
        return n1;
    }
    
}

