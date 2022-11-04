package Menu;

import Dialogo.Dialogo;
import ListaDobleCircular.Lista;

public class Menu {
    private int op;
    private Lista lista = new Lista();

    public void mostrar() {

        op = Integer.parseInt(Dialogo.Capturar(
                "Menu Principal\n" +
                        "1. Agregar elemento\n" +
                        "2. Extraer elemento\n" +
                        "3. Extraer especifico\n" +
                        "4. Mostrar elemento\n" +
                        "5. Salir\n",
                "Menu principal", 3));
        switch (op) {
            case 1:
                lista.agregar();
                mostrar();
            case 2:
                lista.extraer();
                mostrar();
            case 3:
                lista.extraerEspecifico();
                mostrar();
            case 4:
                lista.mostrar();
                mostrar();
            case 5:
                System.exit(0);
                break;
            default:
                Dialogo.Mostrar("Opcion invalida!", "Error", 0);
                mostrar();
        }

    }
}
