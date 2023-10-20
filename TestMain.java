import java.util.Stack;

public class TestMain {
   public static void main(String[] args) {
        CoulombExercisesGenerator generator = new CoulombExercisesGenerator();
        Stack<Exercise> stackOfExercises = generator.generateExercises(1, 10);
        System.out.println(stackOfExercises);
   } 
}
