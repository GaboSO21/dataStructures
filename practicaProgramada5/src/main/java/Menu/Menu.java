package Menu;

import Dialogo.Dialogo;
import ListaCircular.Lista;
import ListaCircular.Persona;

public class Menu {
    private int op;
    private Lista lista = new Lista();
    private Persona[] extraidos = new Persona[100];

    public void mostrar() {

        op = Integer.parseInt(Dialogo.Capturar(
                "Menu Principal\n" +
                        "1. Agregar elemento\n" +
                        "2. Eliminar elemento\n" +
                        "3. Extraer elemento\n" +
                        "4. Buscar elemento\n" +
                        "5. Modificar elemento\n" +
                        "6. Mostrar elemento\n" +
                        "7. Mostrar extraidos\n" +
                        "8. Salir\n",
                "Menu principal", 3));
        switch (op) {
            case 1:
                lista.agregar();
                mostrar();
            case 2:
                lista.eliminar(Integer.parseInt(Dialogo.Capturar("Ingrese el Id a eliminar: ", "Eliminar", 3)));
                mostrar();
            case 3:
                for (int i = 0; i < extraidos.length; i++) {
                    if (extraidos[i] == null) {
                        extraidos[i] = lista
                                .extraer(Integer.parseInt(Dialogo.Capturar("Ingrese el Id a extraer: ", "Extraer", 3)));
                        break;
                    }
                }
                mostrar();
            case 4:
                lista.encuentra(Integer.parseInt(Dialogo.Capturar("Ingrese el Id a buscar: ", "Encuentra", 3)));
                mostrar();
            case 5:
                lista.modifica(Integer.parseInt(Dialogo.Capturar("Ingrese el Id a modificar: ", "Modificar", 3)));
                mostrar();
            case 6:
                lista.mostrar();
                mostrar();
            case 7:
                String info = "Datos extraidos:\n";
                for (int i = 0; i < extraidos.length; i++) {
                    if (extraidos[i] != null) {
                        info += extraidos[i].toString() + " || ";
                    }
                }
                Dialogo.Mostrar(info, "Datos extraidos", 1);
                mostrar();
            default:
                Dialogo.Mostrar("Opcion invalida!", "Error", 0);
                mostrar();
        }

    }
}
