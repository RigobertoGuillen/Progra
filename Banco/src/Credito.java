public class Credito extends Cuentas implements CalcularIntereses {

    private double limiteDeCredito;

    private double interesDeDeuda;

    public Credito(int numeroDeCuenta, double saldo, double limiteDeCredito, double interesDeDeuda) {
        super(numeroDeCuenta, saldo);
        this.limiteDeCredito = limiteDeCredito;
        this.interesDeDeuda = interesDeDeuda;
    }

    public double getLimiteDeCredito() {
        return limiteDeCredito;
    }

    public void setLimiteDeCredito(double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }

    public double getInteresDeDeuda() {
        return interesDeDeuda;
    }

    public void setInteresDeDeuda(double interesDeDeuda) {
        this.interesDeDeuda = interesDeDeuda;
    }

    public void verSaldo() {
        System.out.println("Cuenta:" + numeroDeCuenta + "\n" +
                              "Su saldo es:" + saldo);
    }
    
    @Override
    public void deposito(double monto ) {
       if (monto > 0) {
          saldo += monto;
          System.out.println("Se ha depositado: " + monto + "\n" + "Su saldo nuevo saldo es: " + saldo);
       }else {
          System.out.println("error. ingresa cantidad positiva");
       }
           
    }
    
    @Override
    public void retiro(double monto) {

        if (monto < saldo) {
            saldo -= monto;
            System.out.println("Se ha retirado: " + monto + "\n" + "Su saldo nuevo saldo es: " + saldo);
            
        } else {
            System.out.println("Su saldo no es suficiente para retirar esa cantidad.");
        }
        

    
}

    @Override
    public void ObtenerInteres() {
       return 0;
    }
