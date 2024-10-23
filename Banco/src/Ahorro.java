public class Ahorro extends Cuentas {

   public Ahorro(int numeroDeCuenta, double saldo){
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
    
System.out.println("Su cuenta es de ahorro no puede retirar.");      
    
} 

   
    
    





    
}
