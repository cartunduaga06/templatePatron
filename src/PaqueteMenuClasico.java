public class PaqueteMenuClasico extends paquete{


    @Override
    public String ArmarPaquete(Menu menu) {

        MenuClasico menuClasico = (MenuClasico) menu;
        String mensaje =  "su paquete " + menu.getNombre();


        return mensaje;
    }

    @Override
    public String cobroMenu(Menu menu) {

        MenuClasico cobromenuClasico =  (MenuClasico) menu;
        double preciocobro = menu.getPrecio();
        String mensaje = "el prcio de cobro de su menu"+ ArmarPaquete(menu) + "es igual a " + preciocobro;
        return mensaje;
    }
}
