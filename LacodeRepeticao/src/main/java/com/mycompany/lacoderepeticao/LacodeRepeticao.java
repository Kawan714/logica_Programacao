/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lacoderepeticao;

import java.util.Scanner;

/**
 *
 * @author KawanDantas
 */
public class LacodeRepeticao {

    public static void main(String[] args) {
        // programa para preencher lista de convidados
        
        String [] listaConvidados = new String[20];
        
        Scanner entradaTexto = new Scanner(System.in);
        
        //SOLICITAR QUE A DONA DA LISTA PREENCHA A LISTA
        
        for(int cont=0;cont<=19;cont++){
            System.out.println("Digite o nome do convidado:");
            listaConvidados[cont]=entradaTexto.nextLine();
            
        }
        
        //IMPRIMIR A LISTA DE CONVIDADOS
        for(int cont=0;cont<19;cont++){
            System.out.println("Convidado"+cont+":"+listaConvidados[cont])
        }
    }
}
