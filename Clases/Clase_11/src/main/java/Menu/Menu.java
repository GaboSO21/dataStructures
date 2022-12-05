package Menu;

import java.util.Scanner;

import Grafo.Grafo;

public class Menu {

    public static Scanner sc = new Scanner(System.in);

    public void Mostrar() {
        System.out.println("1. Agregar arista\n" +
                "2. Eliminar arista\n" +
                "3. Mostrar grafo" +
                "4. Mostrar vertices lista\n" +
                "5. Salir");

    }

    public static void agregarArista(Grafo g) {
        System.out.println("Ingrese el valor del v1 y v2: ");
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        System.out.println("Ingrese el peso de la arista:");
        int peso = sc.nextInt();
        g.insertaArista(v1, v2, peso);
    }

    public static void eliminarArista(Grafo g) {
        System.out.println("Ingrese el valor del v1 y v2: ");
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        if (g.existeArista(v1, v2)) {
            g.eliminarArista(v1, v2);
        } else {
            System.out.println("La arista no existe.");
        }
    }

    public static void mostrarGrafo(Grafo g) {
        g.mostrar();
    }

    public static void getListAdy(Grafo g) {
        System.out.println("Ingrese el valor del vertice:");
        int v = sc.nextInt();
        
    }

}
