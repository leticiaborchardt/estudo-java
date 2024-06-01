abstract class Animal implements SerVivo {

    private Boolean vivo;
    private int massa;
    private int posicaoX;
    private int posicaoY;
    private int velocidade;
    private int forca;

    public Boolean getVivo() {
        return vivo;
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public Animal(int velocidade, int massa, int forca) {
        this.vivo = true;
        this.posicaoX = 0;
        this.posicaoY = 0;
        this.velocidade = velocidade;
        this.massa = massa;
        this.forca = forca;
    }

    public void atacar(Animal animal) {
        if (!this.vivo) {
            System.out.println("---" + this.getClass().toGenericString() + " está morto, não pode atacar---");
        } else {
            if (this.forca > animal.forca) {
                this.forca += animal.getMassa();

                animal.setVivo(false);
                System.out.println(animal.getClass().getName() + " morreu atacado por " + getClass().getName());
            } else {
                System.out.println(getClass().getName() + " morreu ao atacar " + animal.getClass().getName());
                this.vivo = false;
            }
        }
    }

    public void mover() {
        if (this.vivo) {
            this.posicaoX += this.velocidade;
            this.posicaoY += this.velocidade;
        } else {
            System.out.println("---" + this.getClass().getName() + " está morto, não pode mover---");
        }
    }

    public void comer(int massa) {
        if (this.vivo) {
            this.forca += massa;
        } else {
            System.out.println("---" + this.getClass().getName() + " está morto, não pode comer---");
        }
    }

    public void info() {
        System.out.println("----------------------------------");
        System.out.println("Tipo: " + getClass().getName());
        System.out.println("Vivo: " + (this.vivo ? "Sim" : "Não"));
        System.out.println("Massa: " + this.massa);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Força: " + this.forca);
        System.out.println("----------------------------------");
    }
}
