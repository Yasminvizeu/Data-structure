/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edd;

/**
 *
 * @author yasmi
 */
public class EDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //printaDecrescente(5);
        //printaCrescente(5);
        System.out.println(pot(5,2));
    }   
    
    //Faça uma função recursiva que receba um número inteiro positivo N e exiba todos os números de N até 0 em ordem decrescente
    private static void printaDecrescente(int n){
            if(n == 0){
                System.out.println("0");
            }else{
                System.out.println(n);
                printaDecrescente(n-1);
            }
    }
    
    //apaga
    private static int soma2(int x, int y){
        printaCrescente(x);
        return x+y;
    }
    
    //Faça uma função recursiva que receba um número inteiro positivo N e exiba todos os números de 0 até N em ordem crescente
    private static void printaCrescente(int n){
        if(n==0){
            System.out.println(n);
        }else{
            printaCrescente(n-1);
            System.out.println(n);
        }
    }
    
    // Faça uma função recursiva que receba dois numeros, um final e um "passo"
    private static void printaCrescentePasso(int n, int p){
        if(n==0){
            System.out.println(n);
        
            
        }else{
            printaCrescentePasso(n-1,p);
            if (n%p==0){
                System.out.println(n);
            }
            
        }
    }
    
    //Crie uma função recursiva int soma(int) que receba um número inteiro positivo N e calcule o somatório dos números de 1 a N
    private static int soma(int n){
        if(n==1){
            return 1;
        }else{
            // n=4
            // 4 + soma(3)
            // soma(3)
            // 3 + soma(2)
            // soma(2)
            // 2 + soma(1)
            // soma 1
            // retorna 1
            // 2+ 1
            // retorna 3
            // 3 + 3
            // retorna 6
            //4 + soma(3) 
            // 4 + 6
            // retorna 10
            return n+soma(n-1);
        }
        
        
        
    }
    //Implemente, de forma recursiva, uma função int pot(int x, int n) que, dados dois números inteiros x e n, calcula o valor de x^n

    private static int pot(int x, int n){
        //5*5*5
        //125
        // 5,2
        // 5 * pot(5,1)
        // pot(5,1)
        // 5* pot(5,0)
        // retorna 5
        // 5* 5
        // retorna 25
        // 5* 25
        // retorna 125
 
        if (n==1){
           return x;
        }else {
//            System.out.println(x);
            return x*pot(x,n-1);
        }
        
  
        
    }
    
}
