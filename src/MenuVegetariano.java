public class MenuVegetariano extends Menu  {

    private int cantidadEspecias;
    private int salsaVegetariana;

    public MenuVegetariano(String nombre, double precio, int cantidadEspecias, int salsaVegetariana) {
        super(nombre, precio);
        this.cantidadEspecias = cantidadEspecias;
        this.salsaVegetariana = salsaVegetariana;
    }

    public int getCantidadEspecias() {
        return cantidadEspecias;
    }

    public void setCantidadEspecias(int cantidadEspecias) {
        this.cantidadEspecias = cantidadEspecias;
    }

    public int getSalsaVegetariana() {
        return salsaVegetariana;
    }

    public void setSalsaVegetariana(int salsaVegetariana) {
        this.salsaVegetariana = salsaVegetariana;
    }
}
