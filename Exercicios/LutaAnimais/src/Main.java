public class Main {
    public static void main(String[] args) {
        Sapo sapo = new Sapo(10, 10, 2);
        Aranha aranha = new Aranha(12, 10, 5, 3);
        Formiga formiga = new Formiga(8, 1, 1);

        Vegetal brocolis = new Vegetal(4);
        Vegetal cenoura = new Vegetal(10);
        Vegetal batata = new Vegetal(2);

        sapo.info();
        aranha.atacar(sapo);

        sapo.comer(brocolis.getMassa());

        formiga.info();
        formiga.comer(batata.getMassa());
        formiga.comer(cenoura.getMassa());
        formiga.comer(brocolis.getMassa());
        formiga.info();

        aranha.info();

        formiga.atacar(aranha);
    }
}