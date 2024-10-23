public class Cheque extends Cuentas {

    public Cheque(int numeroDeCuenta, double saldo){
        super(numeroDeCuenta, saldo);
       }
    
    @Override
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


    
}
