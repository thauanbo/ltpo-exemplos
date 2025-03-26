package exemplo1;

public class Main {
    public static void main(String[] args) {
        Luminaria l1 = new Luminaria();
        l1.ligadaTomada = false;
        l1.acessa = true;
        l1.cor = "branco";
        l1.ilumina();

    }
}
