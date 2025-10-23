public class Aluno extends Pessoa{
    public String curso;

    public Aluno(String nome, int idade, String curso){
        super(nome, idade);
        this.curso = curso;
    }

    @Override
    public void apresentar(){
        System.out.println("Olá, meu nome é " + this.nome + ", tenho " + this.idade + " anos e faço " + this.curso + " .");;
    }
}
