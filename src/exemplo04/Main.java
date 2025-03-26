package exemplo04;

public class Main {
    public static void main (String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(111);
        p1.setDono("Alberto");
        p1.abrirConta("CC");
        p1.depositar(300);



        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(222);
        p2.setDono("Creusa");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);

    p1.estadoAtual();
    p2.estadoAtual();

    }
}
