package ebac01;

//Classe concreta PessoaFisica
public class PessoaFisica extends Pessoa {
 private String cpf;

 public PessoaFisica(String nome, String endereco, String telefone, String cpf) {
     super(nome, endereco, telefone);
     this.cpf = cpf;
 }

 @Override
 public void exibirDados() {
     System.out.println("Nome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone + "\nCPF: " + cpf);
 }
}