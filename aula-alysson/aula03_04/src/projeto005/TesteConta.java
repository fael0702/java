package projeto005;

public class TesteConta {
    Conta c = new Conta();
    //c.saldo = 5000; // Não devemos permitir isso 
    c.setLimite(1000);
    System.out.println("Saldo R$: " + c.getSaldo());
    if (c.sacar(990)){
        System.out.println("saque realizado");
        System.out.println("Saldo atual R$: " + c.getSaldo);
    }else{
        System.out.println("Saque não foi permitido");
    }

}
