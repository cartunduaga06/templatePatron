public class PaqueteMenuInfantil extends paquete{
    @Override
    public String ArmarPaquete(Menu menu) {
        MenuInfantil menuInfantil= (MenuInfantil) menu;
        String mensaje =  "su paquete " + menu.getNombre();


        return mensaje;
    }

    @Override
    public String cobroMenu(Menu menu) {
        MenuInfantil menuInfantil= (MenuInfantil) menu;
        double precioJuguetes= menuInfantil.getCantidadJuguetes() * 3;
        String mensaje =  "el valor de su menu infantil es " + menuInfantil.getPrecio()+ precioJuguetes;
        return mensaje;
    }
}
