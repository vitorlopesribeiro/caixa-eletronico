public class Conta {
    private double saldo;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double consulta(){
        System.out.println("\n Saldo: R$ " + saldo);
        return saldo;
    }

    void deposita(double valor){
        saldo += valor;
        System.out.println("\n Valor depositado: R$ " + valor + "\nNovo saldo: R$ " + saldo);
    }

    void saca(double valor){
        if(valor < saldo){
            saldo -= valor;
            System.err.println("\n Valor sacado: R$ " + valor + "\nNovo saldo: R$ " + saldo);
        }else{
            System.out.println("\n Saldo insuficiente");
        }
    }
}
