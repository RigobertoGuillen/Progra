public abstract class Cuentas {
    
    public int numeroDeCuenta;

    public double saldo;


    public Cuentas(int numeroDeCuenta, double saldo ) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
       
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void verSaldo();

    public abstract void deposito(double monto);

    public abstract void retiro(double monto);

    




}
