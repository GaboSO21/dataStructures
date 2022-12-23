package Grafo;

public class Grafo {
    private int n;
    private int matriz[][];

    public Grafo(int n) {
        this.n = n;
        matriz = new int[this.n][this.n];
        // se inicializa en 0 la matriz
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matriz[i][j] = 0;
            }
        }
    }
    
    public void Agregar(int i, int j){
        matriz[i][j]+=1;
    }
    
    public void Remover(int i, int j){
        if(matriz[i][j]>0){
            matriz[i][j]-=1;
        }
    }
    
    public void Imprimir(){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
