package ebac01;

//Classe abstrata Pessoa

public abstract class Pessoa {
 protected String nome;
 protected String endereco;
 protected String telefone;

 public Pessoa(String nome, String endereco, String telefone) {
     this.nome = nome;
     this.endereco = endereco;
     this.telefone = telefone;
 }

 public abstract void exibirDados();
}