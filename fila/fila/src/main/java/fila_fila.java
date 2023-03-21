/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cg3010279
 */
public class fila_fila {

    /**
     * @param args the command line arguments
     */
    
    static int N = 4;
    static int cabeca;
    static int cauda;
    static public int[]vet = new int [N];
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        tamanho();
        
    }
    public static void enfileirar(int valor_vetor){
        for(int i=0; i<vetor.lengh;i++){
            cabeca++;
        vet[cabeca] = valor_vetor;
        }
        
        
    }
    public static void desenfileirar(int valor_vetor){
        
    }
    
    public static int cabeca(){
        try{
            return vet[cabeca];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Fila vazia, nao tem cabeça"); 
        }
        return -1;
         
    }
    
    public static int cauda(){
        try{
            return vet[cauda];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Fila vazia, nao tem cabeça"); 
        }
        return -1;
    }
    
    public static boolean vazia(){
        if ((cabeca==-1)&&(cauda==-1)){
            return true;
        } else       
        return false;
    }
    
    public static boolean cheia(){
        if(tamanho()==N){
            return true;
        }
        return false;
    }
    
    public static int tamanho(){
        if((cabeca == -1)&&(cauda== -1)){
            return 0;
        } else
            if(cauda ==cabeca){
                return 1;
            } else
                if (cauda>cabeca){
                    return cauda-cabeca+1;
                } else
                    return N-cabeca+cauda+1;
    }
}
