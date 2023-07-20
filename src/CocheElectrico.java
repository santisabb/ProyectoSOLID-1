public class CocheElectrico extends Coche implements Acelerar{

    public CocheElectrico(){
        this.precio = precio;
        this.marca = marca;
        this.cantidadPuertas = cantidadPuertas;
        this.autonomia = autonomia;
        this.maxVelocidad = maxVelocidad;
    }

    public String getAutonomia() {
        return autonomia;
    }

    public int getMaxVelocidad() {
        return maxVelocidad;
    }

    public int  aumentoVelocidad(){
        return this.velocidad--;
    }

    public int consumoNafta(){
        return this.capacidadTanque = 0;
    }

    public String porcentajeBateria(){
        return "%80 de bateria";
    }
}
