package exemplo2;

public class Caneta {
   public String modelo;
   public String cor;
   private float ponta;
   protected int carga;
   private boolean tampada;

   public void status(){
        System.out.println("Uma caneta Cor " + this.cor);
        System.out.println("Uma caneta modelo " + this.modelo);
        System.out.print(" Esta tampada ? " + this.tampada );
        System.out.print(" Ponta : " + this.ponta);
        System.out.print(" Carga : " + this.carga);
        System.out.print(" Esta tampada : " + this.tampada);
    }

   public void rabiscar(){
        if(this.tampada == true) {
            System.out.print(" Esta tampada !");
        }
        else {
            System.out.print(" Estou rabiscando");
        }
    }

   public void tampar(){
        this.tampada = true;
    }

   public void destampar(){
        this.tampada = false;
    }

}
