package banco;
public class TesteConta {
    public static void main(String[] args) {
        // instanciar um objeto do tipo conta 
        Conta contaCebolinha = new Conta();
        // definir os valores da conta do Cebolinha
        contaCebolinha.agencia = "0123-4";
        contaCebolinha.saldo = 2050.07;
        contaCebolinha.nConta = "3333-33";
        contaCebolinha.limite = 500;
        //contaCebolinha.nomeCliente = "Cebolinha";  

        System.out.println("Objeto contaCebolinha" + contaCebolinha);
        System.out.println("Saldo: R$ " + contaCebolinha.saldo);
        Conta aux = contaCebolinha;
        System.out.println("Objeto aux: " + aux);
        aux.saldo += 1000; /* operacao de deposito -> Orientação a Objetos -> DEFINIR RESPONSABILIDADES -> PARA
        A PROPRIA CLASSE */
        System.out.println("Saldo contaCebolinha: " + contaCebolinha.saldo);
        contaCebolinha.deposito(3000);
        contaCebolinha.deposito(-1000); // esse lancamento não vai ter efeito 
        System.out.println("Saldo contaCebolinha: " + contaCebolinha.saldo);

        if(contaCebolinha.sacar(1000)){
            System.out.println("Sucesso no saque. Retire seu dinheiro");
        } else{
            System.out.println("Saldo insuficiente");
        };
        // Teste transferencia
        Conta contaChicoBento = new Conta();
        contaChicoBento.deposito(100);
        System.out.println("antes da tranferencia");
        System.out.println("Conta do Chico Bento: " + contaChicoBento.saldo);
        System.out.println("Conta do Cebolinha: " + contaCebolinha.saldo);
     
        // Transferencia do Cebolinha para Chico Bento
        if(contaCebolinha.transferir(1000, contaChicoBento)){
            System.out.println("Transferencia realizada");
        } else {
            System.out.println("Falha na transferencia");
        }
        System.out.println("depois da tranferencia");
        System.out.println("Conta do Chico Bento: " + contaChicoBento.saldo);
        System.out.println("Conta do Cebolinha: " + contaCebolinha.saldo);
    }
}
