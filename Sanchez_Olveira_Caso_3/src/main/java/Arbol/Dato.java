package Arbol;

public class Dato {

    private int num;

    public Dato() {
        this.num = 0;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Dato [num=" + num + "]";
    }

}
