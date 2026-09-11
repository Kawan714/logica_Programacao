/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicional;

import java.util.Scanner;

/**
 *
 * @author KawanDantas
 */
public class AprendendoSwitchCase {
    public static void main(String[] args) {
        
        
        
        // Sistema de agendamento de serviços Pet
        String nomePet, racaPet;
        int idadePet, opcaoServico;
                
        Scanner entradaTexto = new Scanner(System.in);
        Scanner entradaNumero = new Scanner(System.in);
        
        // solicitar os dados
        
        System.out.println("Ola, para iniciarmos digite o nome do pet");
        nomePet = entradaTexto.nextLine();
        System.out.println("Bem vindo(a)"+nomePet+", qual a sua raca?");
        racaPet = entradaTexto.nextLine();
        System.out.println("Agora que sabemos a sua raca, "+ "nos diga a sua idade");
        idadePet = entradaNumero.nextInt();
        System.out.println("Escolha um de nosso servicos:");
        System.out.println("1-Tosa\n2-Banho\n3-Banho e Tosa\n4-Veterinario");
        opcaoServico = entradaNumero.nextInt();
        
        // analisando o serviço com Switch Case
        
        switch (opcaoServico){
            case 1:
                System.out.println(nomePet+" voce possui"+idadePet+" anos de idade, e da raca "+racaPet+" e escolheu o servico Tosa");
                
                break;
            case 2:
                System.out.println(nomePet+" voce possui "+idadePet+" anos de idade, e da raca "+racaPet+" e escolheu o servico Banho");
                
                break;
            case 3:
                System.out.println(nomePet+" voce possui "+idadePet+" anos de idade, e da raca "+racaPet+" e escolheu o servico Banho e tosa");
                
                break;
            case 4:
                System.out.println(nomePet+" voce possui  "+idadePet+" anos de idade, e da raca "+racaPet+" e escolheu o servico Veterinario");
                
                break;
            default:
                System.out.println("A opcao escolhida e invalida!");
            
        }// fim do switch case
    }
    
}
