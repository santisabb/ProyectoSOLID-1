public class Main {
    public static void main(String[] args) {
        //Aplicar el principio S de S.O.L.I.D.
        //Se trata del principio de responsibalidad unica.
        //Cada clase realizara una unica tarea.
        CocheElectrico coche1 = new CocheElectrico();
        CochesBD listaCoches1 = new CochesBD();
        CocheNafta coche2 = new CocheNafta();
        CocheHibrido coche3 = new CocheHibrido();


        coche1.precio = 50000;
        coche1.setMarca("Renault");
        coche1.setModelo("Zoe");
        coche1.setCantidadPuertas(3);
        coche1.ruedaAuxilio = true;
        coche1.setAutonomia("580 kilometros");
        coche1.setCapacidadBateria(39.22);
        listaCoches1.agregarCoche(coche1);

        coche2.setPrecio(50000);
        coche2.setMarca("Renault");
        coche2.setModelo("Zoe");
        coche2.setCantidadPuertas(3);
        coche2.setRuedaAuxilio(false);
        coche2.setCapacidadTanque(500);
        coche2.setTipoNafta("Super Infinia");
        listaCoches1.agregarCoche(coche2);

        coche3.setPrecio(50000);
        coche3.setMarca("Renault");
        coche3.setModelo("Zoe");
        coche3.setCantidadPuertas(3);
        coche3.setRuedaAuxilio(false);
        coche3.setDuracionBateria(86.12);
        coche3.setModoElectrico(true);
        listaCoches1.agregarCoche(coche3);

        listaCoches1.mostrarLista();
    }
}