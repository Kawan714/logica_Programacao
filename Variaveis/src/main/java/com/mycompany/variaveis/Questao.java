/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

/**
 *
 * @author KawanDantas
 */
import java.util.Scanner;
public class Questao {
    public static void main(String[] args) {
        String nome;
        
        
        Scanner entradaTexto= new
            Scanner (System.in);
        //solicitar que o usuário digite seu nome
        System.out.println("Digite o seu nome:");
        nome=entradaTexto.nextLine();
        
        //imprimir a mensagem
        System.out.println("Olá,"+nome+"!Seja bem-vindo (a) ao java.");
        
        
    }
    
    
}
