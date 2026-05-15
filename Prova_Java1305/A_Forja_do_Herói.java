/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova_Java1305;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author BERNARDOMACHADODEBOR
 */
public class A_Forja_do_Herói {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        ArrayList<String> inventario = new ArrayList<>();
        int [] numero = new int [5];
        
        int resp ;
        
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("                             CONTEXTO \n       Voçê é um player de um jogo e está arrumando o inventário ");
        System.out.println("-----------------------------------------------------------------------");
        
        System.out.println("1.Ver armadura ");
        System.out.println("2.Ver o Baú");
        System.out.println("3.Sair ");
        
        do{
        System.out.println("Oque voçê faz : ");
        
        resp = sc2.nextInt();
        
        
        switch (resp){
            
            case 1 :
                System.out.println("Voçê escolheu ver sua armadura");
                
            
            
            
        } 
        
        } while (resp != 3);
        
        
        
        
        
    }
}
