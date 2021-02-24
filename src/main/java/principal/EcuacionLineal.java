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

    public boolean haySolucion(int a, int b){
        if (a==0){
            return false;
        }
        return true;
    }

    public int solucion(int a, int b){
            return (b*(-1)/a);
    }
}
