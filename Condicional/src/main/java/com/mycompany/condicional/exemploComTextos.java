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
public class exemploComTextos {
    public static void main(String[] args){
        // DESAFIO - BARRADO DA FESTA
        
        String nome;
        
        Scanner entradaTexto= new Scanner(System.in);
        
        System.out.println("Ola, me diga seu nome para eu ver se esta na lista:");
        nome = entradaTexto.nextLine();
        
        //para avaliar igualdade usamos a função equals
        if(nome.equals("Enzo")){
            System.out.println("Desculpe, seu nome não esta na lista");
        }else if(nome.equals("Antonio")){
            System.out.println("Saia ja daqui seu penetra!");
        }else if(nome.equals("Jordana")){
            System.out.println("Bem vinda Chefona!");
        }else if(!nome.equals("Enzo")&& !nome.equals("Maria")){
            System.out.println("Seja bem vindo!");
    }
}
}