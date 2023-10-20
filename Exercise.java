public class Exercise {
    /*
     * Clase Ejercicio contiene los atributos de las cargas, la distancia y además calcula el resultado dentro del
     * constructor.
     */
    double q1;
    double q2;
    double r;
    final double k = 8.98 * Math.pow(10, 9);
    double result;

    public Exercise(double q1, double q2, double r) {
        this.q1 = q1;
        this.q2 = q2;
        this.r = r;
        result = Math.abs(Math.round((k * q1 * q2 / Math.pow(r, 2)) * 100.0) / 100.0);
    }

    @Override
    public String toString() {
        return "q1 = " + q1 + "\nq2 = " + q2 + "\nr = " + r + "\nResultado = " + result + "\n";
    }
}