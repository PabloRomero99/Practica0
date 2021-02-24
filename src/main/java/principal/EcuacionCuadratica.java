package principal;


public class EcuacionCuadratica {
    private double a, b, c;

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
            return false;
        if ((this.a * this.c * 4) > Math.pow(b,2)){
            return false; //throw new ArithmeticException("No tiene solución ");
        }
        return true;
    }

    public double[] solucion(){
        double[] sol = new double[2];

        sol[0] = (-this.b + Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / (2 * this.a);
        sol[1] = (-this.b - Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / (2 * this.a);

        return sol;

    }
}
