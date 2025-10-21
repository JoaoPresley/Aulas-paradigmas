import java.util.ArrayList;
import java.util.List;

public class Gerente {
    private List<Conta> contas = new ArrayList<>();

    public void addConta(String nome, double SaldoInicial){
        Conta novaConta = new Conta(nome, SaldoInicial);
        this.contas.add(novaConta);
    }

    private Conta buscarConta(String nome){
        for (Conta c: contas){
            if (c.getNome().equalsIgnoreCase(nome)){
                return c;
            }
        }
        return null;
    }

    public void updateCredito(String nome_conta, double novo_credito){
        Conta conta = buscarConta(nome_conta);
        if (conta != null){
            conta.setCredito(novo_credito);
        }else {
            System.out.print("Conta não encontrada");
        }
    }

    public double getSaldo_conta(String nome){
        Conta conta = buscarConta(nome);
        if (conta != null) {
            return conta.getSaldo();
        }
        return -1.0;
    }

    public double getCredito_conta(String nome){
        Conta conta = buscarConta(nome);
        if (conta != null) {
            return conta.getCredito();
        }
        return  -1.0;
    }
}
