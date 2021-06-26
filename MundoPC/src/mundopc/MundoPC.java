package mundopc;

import mx.com.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorhd = new Monitor("SAMSUNG", 22);
        Teclado tecladoHX = new Teclado("USB C", "HyperX");
        Raton raton = new Raton("USB", "Logitech");
        Computadora computadoraRandom = new Computadora("PC", monitorhd, tecladoHX, raton);

        Monitor monitorGamer = new Monitor("LG", 34);
        Teclado tecladoGamer = new Teclado("Bluetooth", "HyperX");
        Raton ratonGamer = new Raton("Bluetooth", "Logitech");
        Computadora computadoraGamer = new Computadora("Gamer", monitorGamer, tecladoGamer, ratonGamer);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraRandom);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();
    }
}
