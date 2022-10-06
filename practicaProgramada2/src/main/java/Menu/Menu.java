package Menu;

import javax.swing.JOptionPane;

import Pila.Pila;

public class Menu {
    
    private int op;
    private Pila p = new Pila();
    
    public void mostrar(){
       
        
            op = Integer.parseInt(JOptionPane.showInputDialog(null, 
            "Menu Principal\n" +
            "1. Agregar elemento\n" +
            "2. Buscar elemento\n" +
            "3. Extraer elemento\n" +
            "4. Mostrar elementos\n" +
            "5. Ordenar elementos ascendentemente\n" +
            "6. Ordenar elementos descendentemente\n"+
            "7. Salir\n", "Menu principal", JOptionPane.QUESTION_MESSAGE));
            switch(op){
                case 1:
                    op = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero:", "Push", JOptionPane.INFORMATION_MESSAGE));
                    p.push(op);
                    mostrar();
                    break;
                case 2:
                    op = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero a buscar en la pila:"));
                    boolean encontrar = p.encuentra(op);
                    if(encontrar){
                        JOptionPane.showMessageDialog(null, "Elemento encontrado!", "Encontrar", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Elemento no encontrado!", "Encontrar", JOptionPane.ERROR_MESSAGE);
                    }
                    mostrar();
                    break;
                case 3:
                    op = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero a buscar en la pila:"));
                    p.extraer(op);
                    mostrar();
                    break;
                case 4:
                    if(p.toString() != null){
                        JOptionPane.showMessageDialog(null, p.toString(), "Contenido", JOptionPane.INFORMATION_MESSAGE);         
                    }
                    mostrar();
                    break;
                case 5:
                    p.ordenarAscendente();
                    mostrar();
                    break;
                case 6:
                    p.ordenarDescendente();
                    mostrar();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida!", "Error", JOptionPane.ERROR_MESSAGE);
                    mostrar();
            } 
    }

}
