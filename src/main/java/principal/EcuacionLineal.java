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

    public boolean haySolucion() throws ArithmeticException{
        if (this.a==0){
            if (this.b == 0)
                throw new ArithmeticException("Tiene infinitas soluciones");
            return false;
        }
        return true;
    }

    public int solucion(int a, int b){
            return (b*(-1)/a);
    }
}
