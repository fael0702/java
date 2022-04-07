package banco;

public class TesteContaTitular {
    public static void main(String[] args) {
        Titular cebolinha = new Titular("000.111.111-23");
        cebolinha.nome = "Cebolinha";

        Conta contaCebolinha = new Conta();
        contaCebolinha.agencia = "321-45";
        contaCebolinha.limite = 1000;
        contaCebolinha.nConta = "254-5";
        contaCebolinha.deposito(500);
        contaCebolinha.titular = cebolinha;

        System.out.println(contaCebolinha.titular.nome);
        System.out.println(contaCebolinha.titular.cpf);

        contaCebolinha.extrato();
    }
}
