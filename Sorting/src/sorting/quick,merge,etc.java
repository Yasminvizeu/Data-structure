/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avaliação.pkg01;

/**
 *
 * @author yasmi
 */
public class Avaliação01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] tamanhos = {1000, 5000, 10000, 30000};

        for (int tamanho : tamanhos) {
            int N = tamanho;
            int[] vet = new int[N];
            for (int i = 0; i < N; i++) {
                // vetor aleatorio
                // vet[i] = (int) (Math.random() * (N * 2));

                // vetor totalmente ordenado
                // vet[i] = i;
                // vetor totalmente desordenado
                vet[i] = N - i;
            }
        long inicio, fim;
        inicio = System.currentTimeMillis();
        bubble_sort(vet.clone(), N);
        fim = System.currentTimeMillis();
        System.out.println("Tempo algoritimo bubble sort:" + (fim - inicio) + "ms, usando o tamnho" + tamanho);

        inicio = System.currentTimeMillis();
        selection_sort(vet.clone(), N);
        fim = System.currentTimeMillis();
        System.out.println("Tempo algoritimo bubble sort:" + (fim - inicio) + "ms, usando o tamnho" + tamanho);

        inicio = System.currentTimeMillis();
        insertion_sort(vet.clone(),N);
        fim = System.currentTimeMillis();
        System.out.println("Tempo algoritimo bubble sort:"+(fim-inicio)+"ms, usando o tamnho"+tamanho);
        
        inicio = System.currentTimeMillis();
        merge_sort(vet.clone(),N);
        fim = System.currentTimeMillis();
        System.out.println("Tempo algoritimo bubble sort:"+(fim-inicio)+"ms, usando o tamnho"+tamanho);
        
        inicio = System.currentTimeMillis();
        heap_sort(vet.clone(),N);
        fim = System.currentTimeMillis();
        System.out.println("Tempo algoritimo bubble sort:"+(fim-inicio)+"ms, usando o tamnho"+tamanho);
        
        inicio = System.currentTimeMillis();
        counting_sort(vet.clone(),N);
        fim = System.currentTimeMillis();
        System.out.println("Tempo algoritimo bubble sort:"+(fim-inicio)+"ms, usando o tamnho"+tamanho);
        
        inicio = System.currentTimeMillis();
        quick_sort(vet.clone(),N);
        fim = System.currentTimeMillis();
        System.out.println("Tempo algoritimo bubble sort:"+(fim-inicio)+"ms, usando o tamnho"+tamanho);
     }   
    }
    public static void bubble_sort(int[]vet,int N){
        boolean trocou = false;
        int i = 0;
        do {
            trocou = false;
            for (int j = 0; j < (N - 1 - i); j++) {
                if (vet[j] > vet[j + 1]) {
                    troca(vet, j, j + 1);
                    trocou = true;
                }
            }
            i++;
        } while (trocou);
    }
    public static void selection_sort(int[]vet,int N){
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
    public static void insertion_sort(int[]vet,int N){
         for (int i = 1; i < N; i++) {
            int aux = vet[i];
            int j = i;

            while ((j > 0) && (vet[j - 1] > aux)) {
                vet[j] = vet[j - 1];
                j -= 1;
            }
            vet[j]=aux;
    }
    }
    
    public static void merge_sort(int[]vet,int N){
         if (N < 2) {
            return;
        }
        int mid = N / 2;
        int[] l = new int[mid];
        int[] r = new int[N - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = vet[i];
        }
        for (int i = mid; i < N; i++) {
            r[i - mid] = vet[i];
        }
        merge_sort(l, mid);
        merge_sort(r, N - mid);

        merge(vet, l, r, mid, N - mid);
        }
    public static void merge(int[]a, int[]r, int[]l, int left, int right){
         int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
    }
    }
    
    public static void heap_sort(int[]vet,int N){
          int i = N / 2, pai, filho, t;
        while (true) {
            if (i > 0) {
                i--;
                t = vet[i];
            } else {
                N--;
                if (N <= 0) {
                    return;
                }
                t = vet[N];
                vet[N] = vet[0];
            }
            pai = i;
            filho = ((i * 2) + 1);
            while (filho < N) {
                if ((filho + 1 < N) && (vet[filho + 1] > vet[filho])) {
                    filho++;
                }
                if (vet[filho] > t) {
                    vet[pai] = vet[filho];
                    pai = filho;
                    filho = pai * 2 + 1;
                } else {
                    break;
                }
            }
            vet[pai] = t;
        }
    }
    public static void counting_sort(int[]vet,int N){
        
    }
    public static void quick_sort(int[]vet,int N){
        
    }
    private static void troca(int[] vet, int a, int b) {
        int aux = vet[a];
        vet[a] = vet[b];
        vet[b] = aux;
    }
}

