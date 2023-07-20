public class CocheHibrido extends Coche implements Acelerar{

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

    public int  aumentoVelocidad(){
        return  this.velocidad++;
    }

    public int consumoNafta(){
        return capacidadTanque--;
    }

    public String porcentajeBateria(){
        return "Tiene %100 de bateria";
    }
}
