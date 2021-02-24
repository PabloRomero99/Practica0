package principal;

public class EcuacionLineal {
    private double a, b;

    public EcuacionLineal(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
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
