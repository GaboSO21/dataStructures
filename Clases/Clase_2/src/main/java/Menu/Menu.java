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
            "2. Extraer elemento\n" +
            "3. Mostrar elemento\n" +
            "4. Salir\n", "Menu principal", JOptionPane.QUESTION_MESSAGE));
            switch(op){
                case 1:
                    p.push();
                    mostrar();
                    break;
                case 2:
                    p.pop();
                    mostrar();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, p.toString(), "Contenido", JOptionPane.INFORMATION_MESSAGE);
                    mostrar();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida!", "Error", JOptionPane.ERROR_MESSAGE);
                    mostrar();
            } 

    }
    
}
