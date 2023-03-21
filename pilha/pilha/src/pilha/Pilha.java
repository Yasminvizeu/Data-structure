/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilha;

/**
 *
 * @author cg3010279
 */
public class Pilha {

    static int topo = -1;
    static int N = 4;
    static int vet[] = new int[N];
    
    
    public static void main(String[] args) {
        
        empilhar(7);
       // empilhar(9);
       // empilhar(3);
      //  desempilhar();
      //  System.out.println("topo: "+topo());
      //  System.out.println("tamanho: "+tamanho());
       
       
       
        
    }
    
    public static void empilhar(int x){
        if(!cheia()){
            topo++;
            vet[topo]=x;
        }else
        System.out.println("pilha cheia");
    }
    
    public static void desempilhar(){
        if(!vazia()){
            topo--;
        }else
        System.out.println("pilha vazia");
    }
    
    public static int topo(){
        try{
            return vet[topo];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("pilha vazia");
        }return -1;
    }
    
    public static boolean cheia(){
        if (topo == (N-1))
            return true;
        return false;
    }
    
    public static boolean vazia(){
        if (topo<0){  
            return true;
        }else
        return false;
    }
    
    public static int tamanho(){
        return (topo+1);
    }
    
}
