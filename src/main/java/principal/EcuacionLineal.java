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
            if(b==0)
                return true;
            else
                return false;
        }

        if(b*(-1)/a == 0)
            return true;
        return false;
    }

    public int solucion(int a, int b){
        return a;
    }
}
