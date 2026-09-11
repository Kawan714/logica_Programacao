/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicional;

import java.util.Scanner;

/**
 *
 * @author KawanDantas
 */
public class Condicional {

    public static void main(String[] args) {
        /*Condicional é o codigo utilizado para
        avaliar dados, e se for vedadeiro realiza uma
        ação, e se for falso realiza outra ação.
        SE - IF
        SENÃO -ELSE
        
        TABELA LOGICA:
        > MAIOR QUE
        < MENOR QUE 
        >= MAIOR OU IGUAL
        <= MENOR OU IGUAL
        == IGUAL
        =! DIFERENTE
        */
        
        // váriavel
        int idade;
        
        Scanner entradaNumero = new Scanner (System.in);
        
        //solicitação para o usuário
        System.out.println("Digite a sua idade");
        idade = entradaNumero.nextInt();
        
        //análise da idade
        if(idade>=18){
            System.out.println("você é maior de idade");
        
    }else{
            System.out.println("Você é menor de idade");
}// fim do else 
        
    }
} 
