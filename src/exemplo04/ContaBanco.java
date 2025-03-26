package exemplo04;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    //Metodo Construtor
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    //Metodo Personalizado

    public void estadoAtual(){
        System.out.println("------------------------------");
        System.out.println("Conta "+ this.getNumConta());
        System.out.println("Tipo " + this.getTipo());
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status " + this.getStatus());
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if("CC".equals(t)) {
            this.setSaldo(50);
        }else if("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!! ");
    }

    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta nao pode ser fechada pois ainda tem saldo");
        } else if (this.getSaldo() <0) {
            System.out.println("Conta nao pode ser fechada pois possue debitos");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(float v){
        if (this.getStatus()) {
            //this.saldo = thiis.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de "+ this.getDono());
        } else {
            System.out.println("Impossivel realizar em uma conta fechada");
        }
    }

    public void sacar(float v){
        if (this.getStatus()){
            if(this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado na conta de "+ this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }

    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if(this.getTipo() == "CP"){
            v = 10;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossiivel pagar uma conta fechada ");
        }
    }


    // Metodos Acessores e Modificadores
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int n) {
        this.numConta = n;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
}
