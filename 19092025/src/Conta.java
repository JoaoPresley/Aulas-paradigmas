public class Conta {
    private String nome;
    private double Saldo;
    private double Credito;

    public Conta(String nome, double Saldo){
        this.nome = nome;
        this.Saldo = Saldo;
        this.Credito = 0.0;
    }

    public void sacar(double valor){
        this.Saldo = this.Saldo - valor;
    }

    public void depositar(double valor){
        this.Saldo = this.Saldo + valor;
    }

    public void setCredito(double novoCredito){
        this.Credito = novoCredito;
    }

    public String getNome(){return this.nome;}
    public Double getSaldo(){return this.Saldo;}
    public Double getCredito(){return this.Credito;}
}
