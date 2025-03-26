package exemplo1;

public class Luminaria {
    String modelo;
    String cor;
    boolean acessa;
    String corLuz;
    boolean ligadaTomada;


    void ilumina() {
        if(ligadaTomada == true && acessa == true) {
            System.out.print(" Esta Iluminando ");
        } else {
            System.out.print(" Nao esta iluminando");
        }
    }
}
