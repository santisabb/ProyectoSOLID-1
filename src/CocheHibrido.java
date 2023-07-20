public class CocheHibrido extends Coche implements Acelerar {

    public CocheHibrido(){
        this.precio = precio;
        this.marca = marca;
        this.cantidadPuertas = cantidadPuertas;
        this.duracionBateria = duracionBateria;
        this.modoConsumo = modoConsumo;
        this.capacidadTanque = capacidadTanque;
    }

    public double getDuracionBateria() {
        return duracionBateria;
    }

    public String getModoConsumo() {
        return modoConsumo;
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
