public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

       // Ahorro nvoMovimiento = new Ahorro(4355453, 15000);
       // nvoMovimiento.verSaldo();
        //nvoMovimiento.deposito(20);
        //nvoMovimiento.retiro(10);

        Cuentas nvoMovimiento = new Ahorro(1234, 10000);
        nvoMovimiento.deposito(250);

        Cheque nvoMoviniento = new Cheque(1235, 12000);
        nvoMoviniento.verSaldo();
        nvoMoviniento.deposito(5000);
        nvoMoviniento.retiro(20000);
        nvoMoviniento.retiro(10000);







       

        

        

    }
}
