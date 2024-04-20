package ebac01;

//Classe concreta PessoaJuridica
public class PessoaJuridica extends Pessoa {
 private String cnpj;

 public PessoaJuridica(String nome, String endereco, String telefone, String cnpj) {
     super(nome, endereco, telefone);
     this.cnpj = cnpj;
 }

 @Override
 public void exibirDados() {
     System.out.println("Nome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone + "\nCNPJ: " + cnpj);
 }
}