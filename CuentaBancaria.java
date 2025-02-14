public class CuentaBancaria {
    int nroCuenta;
    int saldo;
    String tipoCuenta;

    public CuentaBancaria (){
        nroCuenta = 38193443;
        saldo = 3000000;
        tipoCuenta = "Cuenta de ahorros";

    }

    public CuentaBancaria(int nroCuenta, int saldo, String tipoCuenta) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString(){
        return "numero cuenta: " + nroCuenta + " ,saldo: " + saldo + " ,Tipo cuenta: " + tipoCuenta;
    }

    

    

    
}
