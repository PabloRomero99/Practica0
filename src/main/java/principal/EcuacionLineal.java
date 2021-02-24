package principal;

public class EcuacionLineal {
    private int a, b;

    public EcuacionLineal(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public boolean haySolucion(){
        if (this.a==0)
            return this.b == 0;
        return true;
    }

    public double solucion(){
        if (this.a == 0 && this.b == 0) {
            return Double.POSITIVE_INFINITY;
        }

        return (this.b*(-1.0)/this.a);
    }
}
