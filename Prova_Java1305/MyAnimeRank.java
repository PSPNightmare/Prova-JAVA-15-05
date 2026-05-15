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
public class MyAnimeRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        ArrayList<String> lista = new ArrayList<>();
        
        System.out.println("Digite os animes que voçê assistiu('FIM' para sair): ");
        
        String animes = "start";
        
        while (!animes.equalsIgnoreCase("fim")){
                
        animes = sc.nextLine();
        
        lista.add(animes);
        
        lista.remove("fim");
        lista.remove("FIM");
        lista.remove("FIm");
        lista.remove("fIm");
                
        }
        
        listanimes(lista);
        
        
    }
    
    public static void listanimes (ArrayList <String> lista){
        
        for (String lista2 : lista);
    
        
        System.out.println("Sua Lista\n " +lista);
    
    
}
    
    
}
