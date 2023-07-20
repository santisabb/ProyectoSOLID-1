public class CocheElectrico extends Coche implements Acelerar {

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

    @Override
    public int aumentoVelocidad() {
        return this.velocidad++;
    }

    @Override
    public int disminuyoVelocidad() {
        return this.velocidad--;
    }

    @Override
    public int getCantidadPuertas() {
        return super.getCantidadPuertas();
    }
}
