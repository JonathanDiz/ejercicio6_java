public class Main {
    public static void main(String[] args) {
        double precio = 10000;
        double porcentajeIVA = 19;
        double precioConIVA = CalcularPrecioConIVA.calcularPrecioConIVA(precio, porcentajeIVA);
        System.out.println("Precio con IVA incluido: " + precioConIVA);
    }
}
