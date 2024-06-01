public class Aranha extends Animal {

    private int veneno;

    public Aranha(int velocidade, int massa, int forca, int veneno) {
        // Porque estende a classe animal, é necessário fazer o construtor
        super(velocidade, massa, forca);

        this.veneno = veneno;
    }

    @Override
    public void atacar(Animal animal) {
        if (!this.getVivo()) {
            System.out.println("---" + this.getClass().toGenericString() + " está morto, não pode atacar---");
        } else {
            if ((this.getForca() + this.veneno) > animal.getForca()) {
                this.setForca(this.getForca() + animal.getMassa());

                animal.setVivo(false);
                System.out.println(animal.getClass().getName() + " morreu atacado por " + getClass().getName());
            } else {
                System.out.println(getClass().getName() + " morreu ao atacar " + animal.getClass().getName());
                this.setVivo(false);
            }
        }
    }
}
