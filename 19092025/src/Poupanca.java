import java.time.LocalDate;

public class Poupança extends Conta{
    private double taxa_redimento_mes;
    private int mes_aplicacao;
    public Poupança(String nome, double saldo, int mes_aplicacao){
        super(nome, saldo);
        this.taxa_redimento_mes = 0.005;
        this.mes_aplicacao = mes_aplicacao;
    }
    public Poupança(String nome, double saldo){
        this(nome, saldo, 3);
    }

    public void setTaxa_redimento(double taxa_redimento) {
        this.taxa_redimento_mes = taxa_redimento;
    }
    private void updateSaldo(){
        ;
    }
}
