public class CalcularPrecioConIVA {
    public static double calcularPrecioConIVA(double precio, double porcentajeIVA) {
        double precioConIVA = precio * (1 + porcentajeIVA / 100);
        return precioConIVA;
    }
}
