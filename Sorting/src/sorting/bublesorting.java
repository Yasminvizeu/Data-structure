/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edd.sorting;

/**
 *
 * @author yasmi
 */
public class bublesorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    public void main(){
        
        int N = 10;
        int vet[] = new int[N];
        for (int i = 0; i < N; i++) {
            //vetor aleatorio
            vet[i] = (int) (Math.random() * (N * 2));
            
            //vetor totalmente ordenado
            //vet[i] = i;

            //vetor totalmente desordenado
            //vet[i] = N-i;
        }
        
        
         long inicio, fim;
        inicio = System.currentTimeMillis();
        ordenacao_simples(vet.clone(), N);
        fim = System.currentTimeMillis();
        System.out.println("Tempo algoritmo basico: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        ordenacao_melhorada1(vet.clone(), N);
        fim = System.currentTimeMillis();
        System.out.println("Tempo algoritmo melhorado 1: " + (fim - inicio) + "ms");
        
        inicio = System.currentTimeMillis();
        ordenacao_melhorada2(vet.clone(), N);
        fim = System.currentTimeMillis();
        System.out.println("Tempo algoritmo melhorado 2: " + (fim - inicio) + "ms");  
        
        
    }
    
    static void selection(int[] vet, int N) {
        for (int fixo = 0; fixo < (N - 1); fixo++) {
            int menor = fixo;
            for (int i = menor + 1; i < N; i++) {
                if (vet[i] < vet[menor]) {
                    menor = i;
                }
            }
            if (menor != fixo) {
                int t = vet[fixo];
                vet[fixo] = vet[menor];
                vet[menor] = t;
            }
        }
    }
    
    
    
     private static void ordenacao_simples(int[] vet, int N) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < (N - 1); j++) {
                if (vet[j] > vet[j + 1]) {
                    troca(vet, j, j + 1);
                }
            }
        }

    }

    private static void ordenacao_melhorada1(int[] vet, int N) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < (N - 1 - i); j++) {
                if (vet[j] > vet[j + 1]) {
                    troca(vet, j, j + 1);
                }
            }
        }

    }
     
    private static void ordenacao_melhorada2(int[] vet, int N) {
        boolean trocou = false;
        int i = 0;
        do{
            trocou = false;
            for (int j = 0; j < (N - 1 - i); j++) {
                if (vet[j] > vet[j + 1]) {
                    troca(vet, j, j + 1);
                    trocou = true;
                }
            }
            i++;
        }while(trocou);

    }

    private static void troca(int[] vet, int a, int b) {
        int aux = vet[a];
        vet[a] = vet[b];
        vet[b] = aux;
    }
    }
    

