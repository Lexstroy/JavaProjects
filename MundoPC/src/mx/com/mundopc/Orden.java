package mx.com.mundopc;

public class Orden {
    private final int idOrden;
    private final Computadora[] computadoras;
    private static int contadorOrdenes;
    private final static int MAX_COMPUTADORAS = 10;
    private int contadorComputadoras;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        }
        else {
            System.out.println("Se ha ingresado el máximo de computadoras: " + Orden.MAX_COMPUTADORAS);
        }
    }

    public void mostrarOrden() {
        System.out.println("ID orden: " + this.idOrden);
        System.out.println("Computadoras de la orden: " + this.idOrden);
        for (int a = 0; a < this.contadorComputadoras; a++) {
            System.out.println(this.computadoras[a]);
        }
    }
}
