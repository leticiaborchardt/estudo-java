public class Vegetal {
    private int massa;

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public Vegetal(int massa) {
        this.massa = massa;
    }

    public void info() {
        System.out.println("----------------------------------");
        System.out.println("Tipo: " + getClass().toString());
        System.out.println("Massa: " + this.massa);
        System.out.println("----------------------------------");
    }
}
