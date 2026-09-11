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
public class Desafio {
    public static void main(String[] args) {       
        //variaveis
        String nome, tipoingresso;
        int idade;
        boolean autorizacao = false;
         
         Scanner entradaTexto= new Scanner(System.in);
         Scanner entradaNumero= new Scanner(System.in);
         Scanner entradaLogica= new Scanner(System.in);

        System.out.println("Digite o seu nome");
        nome = entradaTexto.nextLine();
        
        System.out.println("Digite a sua idade");
        idade =  entradaNumero.nextInt();
        
        System.out.println("Digite o tipo de ingresso VIP, COMUM, PROFESSOR ou FUNCIONARIO?");
        tipoingresso = entradaTexto.nextLine();
        
        System.out.println("Voce possui autorizacao true para sim e false para não");
        autorizacao = entradaLogica.nextBoolean();
        
        // VALIDAÇÕES COM IF ELSE
        System.out.println("Ola "+nome+", você possui "+idade+" anos e");
       
        if(idade >= 18 && tipoingresso.equals("Vip")) {
            System.out.println("Acesso Vip liberado!");
        } else if(idade >= 18 && tipoingresso.equals("Comum")) {
            System.out.println("Acesso comum liberado!");
        } else if((idade==16 || idade==17) && autorizacao==true){
            System.out.println("Acesso liberado com autorizacao!");
        } else if(tipoingresso.equals("Professor") || tipoingresso.equals("Funcionario")) {
            System.out.println("Acesso especial liberado!");
        } else{
            System.out.println("Acesso negado!");
                 
    }
    
}}
