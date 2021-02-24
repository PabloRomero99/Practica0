package principal;


public class EcuacionCuadratica {
    private double a, b,c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() { return c; }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) { this.c = c; }

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
