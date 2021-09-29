/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author B1-08
 */
public class ParImpar {
    public static void main(String[] args) {
        //Declaração de variáveis
        int num;
        
        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        
        //Apresentação
        System.out.println("\n\t\t\t -- Seu numero é Par? --\n");
        
        //Ler o número informado pelo usuário
        System.out.print("\n\t Informe um número: ");
        num = entrada.nextInt();
        
        
        if((num%2) == 0)
            System.out.println("\n O número digitado (" + num + ") é par!");
        
        else
            System.out.println("\n O número informado não é par");
        
    }
    
}
