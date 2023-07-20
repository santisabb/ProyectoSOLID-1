public class CocheNafta extends Coche implements Acelerar{


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

    public int aumentoVelocidad(){
        return this.velocidad++;
    }

    public int consumoNafta(){
        return capacidadTanque--;
    }

    public String porcentajeBateria(){
        return "ERROR: Coche nafta no consume bateria para movimiento";
    }
}
