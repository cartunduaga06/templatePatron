public class MenuInfantil extends Menu{

    private int cantidadJuguetes;

    public MenuInfantil(String nombre, double precio, int cantidadJuguetes) {
        super(nombre, precio);
        this.cantidadJuguetes = cantidadJuguetes;
    }

    public int getCantidadJuguetes() {
        return cantidadJuguetes;
    }

    public void setCantidadJuguetes(int cantidadJuguetes) {
        this.cantidadJuguetes = cantidadJuguetes;
    }

}
