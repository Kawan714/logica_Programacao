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
public class DesafioSwitchCase {
    public static void main(String[] args) {
       
        // variaveis      
        int quantidade, numeroProduto;
        double valorTotal;
        
        Scanner entradaNumero = new Scanner(System.in);
        Scanner entradaTexto = new Scanner (System.in);
        
        //Lanchonete
        
        System.out.println("Ola, seja bem vindo ao estabelecimento, o que deseja?");
        entradaTexto.nextLine();
        System.out.println(+1+" - hamburguer 15,00R$");
        System.out.println(+2+" - Pizza 25,00R$");
        System.out.println(+3+" - cachorro-quente 12,00R$");
        System.out.println(+4+" - refrigerante 6,00R$");
        System.out.println(+5+" - Suco 8,00");
        
        //analisando o produto com Switch case
        
        switch (numeroProduto){
            case 1:
                valorTotal= 15*quantidade;
                System.out.println("=====Pedido====");
                System.out.println("Produto: Hamburguer\nQuantidads:"+quantidade+"\nPreco unitario:R$15,00\n"+"Valor total:"+valorTotal);
                
                break;
                
            case 2:
                valorTotal= 25*quantidade;
                System.out.println("=====Pedido====");
                System.out.println("Produto: Pizza\nQuantidads:"+quantidade+"\nPreco unitario:R$25,00\n"+"Valor total:"+valorTotal);
                
                break;
                
                
              
               
        }
        
        
        
        
        
    }
    
}
