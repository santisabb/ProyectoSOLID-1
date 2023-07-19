public class CocheNafta extends Coche{
    int capacidadTanque;
    boolean ruedaAuxilio;

    public CocheNafta(){
        this.precio = precio;
        this.marca = marca;
        this.cantidadPuertas = cantidadPuertas;
        this.capacidadTanque = capacidadTanque;
        this.ruedaAuxilio = ruedaAuxilio;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public boolean isRuedaAuxilio() {
        return ruedaAuxilio;
    }
}
