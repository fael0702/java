public class Conta {
    String nConta;
    String agencia;
    String nomeCliente;
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
}