package Arbol;

import javax.swing.JOptionPane;

public class Arbol {
    private Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }

    public boolean isEmpty() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void crearNodo(Nodo raiz, Nodo nuevo) {
        if (nuevo.getElemento().getNum() <= raiz.getElemento().getNum()) {
            if (raiz.getHijoIzq() == null) {
                raiz.setHijoIzq(nuevo);
            } else {
                crearNodo(raiz.getHijoIzq(), nuevo);
            }
        } else {
            if (raiz.getHijoDer() == null) {
                raiz.setHijoDer(nuevo);
            } else {
                crearNodo(raiz.getHijoDer(), nuevo);
            }
        }
    }

    private void imprimeMenor(Nodo raiz) {
        if (raiz.getHijoIzq() == null) {
            System.out.println(raiz.getElemento().getNum() + "");
        } else {
            imprimeMenor(raiz.getHijoIzq());
        }
    }

    public void imprimirMenor() {
        this.imprimeMenor(raiz);
    }

    private void imprimeHojas(Nodo raiz) {
        if (raiz.getHijoIzq() != null && raiz.getHijoDer() != null) {
            imprimeHojas(raiz.getHijoIzq());
            imprimeHojas(raiz.getHijoDer());
        } else if (raiz.getHijoIzq() == null && raiz.getHijoDer() != null) {
            imprimeHojas(raiz.getHijoDer());
        } else if (raiz.getHijoIzq() != null && raiz.getHijoDer() == null) {
            imprimeHojas(raiz.getHijoIzq());
        } else {
            System.out.println(raiz.getElemento().getNum() + " ");
        }
    }

    public void imprimeHojas() {
        this.imprimeHojas(raiz);
    }

    private void imprimeNivel(Nodo raiz, int num, int cont) {
        if (num == cont) {
            System.out.println(raiz.getElemento().getNum() + " ");
        } else {
            try {
                if (raiz.getHijoIzq() == null && raiz.getHijoDer() != null) {
                    imprimeNivel(raiz.getHijoDer(), num, cont + 1);
                } else if (raiz.getHijoIzq() != null && raiz.getHijoDer() == null) {
                    imprimeNivel(raiz.getHijoIzq(), num, cont + 1);
                } else {
                    imprimeNivel(raiz.getHijoDer(), num, cont + 1);
                    imprimeNivel(raiz.getHijoIzq(), num, cont + 1);
                }
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void imprimeNivel(int num) {
        this.imprimeNivel(raiz, num, 0);
    }

    private int getAltura(Nodo raiz) {
        if (raiz == null) {
            return 0;
        } else {
            int izq = getAltura(raiz.getHijoIzq());
            int der = getAltura(raiz.getHijoDer());

            if (izq > der) {
                return izq + 1;
            } else {
                return der + 1;
            }
        }
    }

    public int getAltura() {
        return this.getAltura(raiz);
    }

    private int contarNodos(Nodo raiz) {
        if (raiz == null) {
            return 0;
        } else {
            return 1 + contarNodos(raiz.getHijoIzq()) + contarNodos(raiz.getHijoDer());
        }
    }

    public int contarNodos() {
        return contarNodos(raiz);
    }

    public void crearRaiz() {
        Dato d = new Dato();
        d.setNum(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero:", "Insertar", 1)));
        Nodo nuevo = new Nodo();
        nuevo.setElemento(d);

        if (isEmpty()) {
            raiz = nuevo;
        } else {
            crearNodo(raiz, nuevo);
        }
    }

    public void mostrarNodo(Nodo n) {
        if (n != null) {
            mostrarNodo(n.getHijoIzq());
            System.out.print(n.getElemento().getNum() + " ");
            mostrarNodo(n.getHijoDer());
        }
    }

    public void mostrarRaiz() {
        if (!isEmpty()) {
            mostrarNodo(raiz);
        } else {
            System.out.println("Arbol vacio");
        }
    }

    private void compararNodo(Nodo raiz, int num, int cont) {
        if (raiz.getHijoIzq() == null && raiz.getHijoDer() == null) {
            System.out.println("El numero " + num + " se encuentra " + cont + "veces");
        } else {
            try {
                if (raiz.getHijoIzq() == null && raiz.getHijoDer() != null) {
                    if (raiz.getHijoDer().getElemento().getNum() == num) {
                        imprimeNivel(raiz.getHijoDer(), num, cont + 1);
                    } else {
                        imprimeNivel(raiz.getHijoDer(), num, cont);
                    }
                } else if (raiz.getHijoIzq() != null && raiz.getHijoDer() == null) {
                    if (raiz.getHijoIzq().getElemento().getNum() == num) {
                        imprimeNivel(raiz.getHijoIzq(), num, cont + 1);
                    } else {
                        imprimeNivel(raiz.getHijoIzq(), num, cont);
                    }
                } else {
                    if (raiz.getHijoDer().getElemento().getNum() == num
                            && raiz.getHijoIzq().getElemento().getNum() == num) {
                        imprimeNivel(raiz.getHijoDer(), num, cont + 1);
                        imprimeNivel(raiz.getHijoIzq(), num, cont + 1);
                    }
                    if (raiz.getHijoIzq().getElemento().getNum() == num
                            && raiz.getHijoDer().getElemento().getNum() != num) {
                        imprimeNivel(raiz.getHijoIzq(), num, cont + 1);
                        imprimeNivel(raiz.getHijoDer(), num, cont);
                    } else if (raiz.getHijoDer().getElemento().getNum() == num &&
                            raiz.getHijoIzq().getElemento().getNum() == num) {
                        imprimeNivel(raiz.getHijoDer(), num, cont + 1);
                        imprimeNivel(raiz.getHijoIzq(), num, cont);
                    }
                }
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void compararNodo(int num) {
        this.compararNodo(raiz, num, 0);
    }

    private int countDuplicates(Nodo root, Nodo prev) {
        // Basic edge case .. root==null
        if (root == null){
            return 0;
        }
        // else
        int count = 0;
        if (root.getElemento().getNum() == prev.getElemento().getNum()){
            count++;
        }
        return count + countDuplicates(root.getHijoIzq(), root) + countDuplicates(root.getHijoDer(), root);
    }

    public int countDuplicates(){
        return this.countDuplicates(raiz, raiz);
    }

}
