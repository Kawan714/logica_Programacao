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
public class Exemplo1 {
    public static void main(String[] args) {
        //váriaveis
        double altura, peso, imc;
        String nome;
        
        // scanner
        Scanner entradaNumero= new Scanner (System.in);
        Scanner entradaTexto= new Scanner(System.in);
        
        // solicitar os dados ao usuário
        System.out.println("Digite o seu nome");
        nome = entradaTexto.nextLine();
        System.out.println("Digite seu peso:");
        peso = entradaNumero.nextDouble();
         System.out.println("Digite seu altura:");
        altura = entradaNumero.nextDouble();
        
        // CALCULAR O IMC
        imc = peso / (altura*altura);
        
        // analisando o imc
        
        if (imc<=16.9){
            System.out.println("Muito abaixo do peso!");
        }if(imc>=17 && imc<=18.4){
        System.out.println("Abaixo do peso!");
        }if(imc>=35 && imc<=24.9){
            System.out.println("peso Normal!");
        }if(imc>=25 && imc<= 29.9){
            System.out.println("Acima do Peso!");
        }if(imc>=30 && imc<=34.9){
            System.out.println("Obesidade Grau I");
        } if(imc>=35 && imc<=40){
            System.out.println("Obesidade Grau II");
        }else{
            System.out.println("Obesidade Grau III");
        }
        
    
        
        
    }
 
}
