/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova_Java1305;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author BERNARDOMACHADODEBOR
 */
public class Catraca_Vip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int resp;
        HashSet<String> lista = new HashSet<>();
        HashSet<String> listaVip = new HashSet<>();
        do {
            System.out.println("=======================");
            System.out.println("                       ");
            System.out.println(" CINEMA DIVERSÃO PLUS ");
            System.out.println("                       ");
            System.out.println("=======================");

            System.out.println("Voçê gostaria de fazer de : \n");
            System.out.println("1.Criar cadastro");
            System.out.println("2.Adicionar na lista VIP");
            System.out.println("3.Ver cadastro");
            System.out.println("4.ir embora");

            resp = sc2.nextInt();

            switch (resp) {
                case 1:
                    System.out.println("Quantos CPF(s) voçê deseja adicionar");
                    int quant = sc2.nextInt();

                    for (int i = 0; i < quant; i++) {
                        System.out.println("Digite o " + (i + 1) + "° CPF");
                        String cpf = sc.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("DIGITE O CPF : ");
                    String cpf = sc.nextLine();

                    lista.add(cpf);
                    listaVIP(listaVip, cpf);
                    break;

                case 3:

                    System.out.println("Qual CPF voçê gostaria de ver se já está cadastrado");
                    String cpfV = sc.nextLine();

                    if (lista.contains(cpfV) && listaVip.contains(cpfV)) {
                        boolean jatem = true;
                        System.out.println("ESTE CPF JÁ FOI ADICIONADO? \n " + jatem);
                    } else {
                        System.out.println("O CPF NÃO FOI ADICIONADO AINDA");
                    }
                    break;
                case 4:
                    System.out.println("Voçê foi embora");
                    return;

                default:
                    System.out.println("Apenas de 1 a 4");
            }

        } while (resp != 3);

    }

    public static void listaVIP(HashSet<String> listaVip, String cpf) {

        System.out.println("CPF ADICIONADO COM SUCESSO NA LISTA VIP");
        listaVip.add(cpf);
    }

}
