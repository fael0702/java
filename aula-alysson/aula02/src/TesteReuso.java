import entidades.PessoaFisica;
import util.Reuso;

public class TesteReuso {
    public static void main(String[] args) {
        Reuso.print("ola mundo");
        Reuso.print(4);

        PessoaFisica pf = new PessoaFisica();
        pf.nome = "Alan Turing";
        pf.cpf = "222.222.222-22";
        Reuso.print(pf);
    }   
}
