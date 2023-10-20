import java.util.Stack;

public class CoulombExercisesGenerator {
    /*
     * Esta clase lo que logra es generar y retornar ejercicios de la Ley de Coulomb
     * para después recibir una entrada
     * y retornar si el resultado es correcto o incorrecto.
     */

    // Número de ejercicios a ser generados
    private int noExercises;

    public CoulombExercisesGenerator() {
        noExercises = 10;
    }

    // Para no. de ejercicios personalizado
    public CoulombExercisesGenerator(int noExercises) {
        this.noExercises = noExercises;
    }

    
    // Genera los ejercicios y da un stack que contiene objetos Exercise
    public Stack<Exercise> generateExercises(double minR, double maxR) {
        Stack<Exercise> stackOfExercises = new Stack<Exercise>();
        for (int i = 0; i < noExercises; i++) {
            double q1 = Math.round((Math.random() * 20 - 10) * 100.0) / 100.0;
            double q2 = Math.round((Math.random() * 20 - 10) * 100.0) / 100.0;
            double r = Math.round((Math.random() * (maxR - minR) + minR) * 100.0) / 100.0;
            Exercise exercise = new Exercise(q1, q2, r);
            stackOfExercises.push(exercise);
        }

        return stackOfExercises;
    }

}