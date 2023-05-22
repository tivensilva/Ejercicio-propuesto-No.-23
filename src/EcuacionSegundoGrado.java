public class EcuacionSegundoGrado {
    private double a;
    private double b;
    private double c;

    public EcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String calcularSoluciones() {
        double discriminante = b * b - 4 * a * c;
        if (discriminante < 0) {
            return "La ecuación no tiene soluciones reales";
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return "Las soluciones de la ecuación son: x1 = " + x1 + ", x2 = " + x2;
        }
    }
}
