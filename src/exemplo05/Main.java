package exemplo05;

public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.abrirMenu();
        c.ligarMudo();
        c.fecharMenu();
        c.pause();
    }
}
