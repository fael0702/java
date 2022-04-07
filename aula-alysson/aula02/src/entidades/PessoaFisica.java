package entidades;

public class PessoaFisica {
    // atributos 
    public String cpf;
    public String nome;

    @Override // Serve para explicar que este metodo existe na super classe de PessoaFisica
    public String toString(){
        return "CPF" + this.cpf + " Nome: " + this.nome;
    }
}
