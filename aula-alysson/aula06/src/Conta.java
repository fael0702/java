public class Conta {
    private double saldo;
    private double limite;
    public String getSaldo;

    // apenas o metodo de consulta saldo
    public double getSaldo(){
        return this.saldo;
    }

    public double getLimite(){
        return limite;
    }

    public void setLimite(double limite){
        if (limite >= 0){
            this.limite = limite;
        }
    }

    private void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {
        
        if(valor <= this.getLimite()+this.getSaldo()){
            //this.saldo = novoSaldo;
            double novoSaldo = this.getSaldo()-valor;
            this.setSaldo(novoSaldo);// usando o metodo privado
            return true; 
        }
        return false; 
    }

    public boolean depositar(double valor){
        if (valor > 0){
            double saldoAtual = this.getSaldo();
            this.setSaldo(valor);
            return true;
        }else{
            return false; 
        }
    }
}
