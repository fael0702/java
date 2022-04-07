package banco;
/**
 * Conta
 */
public class Conta {
    //atributos
    String nConta;
    String agencia;
    Titular titular;
    double saldo;
    double limite;
    
    // operações -> metodos

    /**
     * Metodo para depositar valor em uma Conta
     * @param valor - valor real, correspondente ao deposito a ser realizado
     */
    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor; // saldo = saldo + valor
        }
    }
         
    /**
     * Metodo para sacar valor em uma Conta
     * @param valor - valor real, correspondente ao saque a ser realizada 
     * @return true se foi possivel sacar valor, false caso contrario 
     */
    public boolean sacar(double valor) {
        if ((valor <= saldo + limite)&&(valor>0)) {
            saldo -= valor; 
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, Conta destino) {
        if(this.sacar(valor)){
            destino.deposito(valor);
            return true;
        }else{
            return false;
        }
    }

    public void extrato(){
        System.out.println("---Extrato---");
        System.out.println("Titular: " + titular.nome);
        System.out.println("CPF: " + titular.cpf);
        System.out.println("-----------------------------");
        System.out.println("Ag: " + agencia + " Conta: " + nConta);
        System.out.println("Limite R$: " + limite);
        System.out.println("Disponivel R$: " + (saldo+limite));
    }
}