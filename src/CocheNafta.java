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

    @Override
    public int aumentoVelocidad() {
        return this.velocidad++;
    }

    @Override
    public int disminuyoVelocidad() {
        return this.velocidad--;
    }
}
