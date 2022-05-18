public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MenuClasico primerMenu =  new MenuClasico("Clasico", 1000);
       paquete procesoClasico = new PaqueteMenuClasico();

        System.out.println(procesoClasico.cobroMenu(primerMenu));
        System.out.println(procesoClasico.ArmarPaquete(primerMenu));

        MenuInfantil primerMenuInfantil =  new MenuInfantil("Payasin", 500, 5);
        paquete procesoInfantil  = new PaqueteMenuInfantil();
        System.out.println(procesoInfantil.cobroMenu(primerMenuInfantil));
    }
}