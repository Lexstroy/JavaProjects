package mx.com.ventas;

public class Orden {
    private final int idOrden;
    private final Producto[] productos;
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];//Se inicializa el arreglo con el objeto Producto
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {//Comparacion con el contador y el arreglo
            this.productos[this.contadorProductos++] = producto;//añadimos el producto a nuestro arreglo
        } else {
            System.out.println("Se ha superado el máximo de productos" + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int a = 0; a < this.contadorProductos; a++) {
            total += this.productos[a].getPrecio();//Simplficado en una linea de código
//            Forma extensa
//            Producto producto = this.productos[a];
//            total += productos[a].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Id Orden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la Orden: $" + totalOrden);
        System.out.println("Productos de la orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }
}
