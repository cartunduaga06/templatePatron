public abstract class paquete {

    public abstract String ArmarPaquete(Menu menu); //metodo plantilla


    //metodo concreto
    public String cobroMenu(Menu menu){
        return "Su  menu es "  + menu.getNombre();

    }
}
