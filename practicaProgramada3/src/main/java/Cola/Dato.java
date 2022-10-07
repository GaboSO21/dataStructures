package Cola;

public class Dato {

    private int num;

    public Dato() {
        this.num = 0;
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dato{");
        sb.append("num=").append(num);
        sb.append('}');
        return sb.toString();
    }

}
