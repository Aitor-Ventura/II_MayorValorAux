import java.util.Scanner;
import java.io.File;
/** ... */
public class MainClass {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Crea mat leyendo sus elementos
        double[][] mat = Internal.loadDoubleArray2D(input); 

        if ((new File("running")).exists()){
            System.out.print("¿Valor mínimo?: ");
        }
        int min = input.nextInt();

        if ((new File("running")).exists()){
            System.out.print("El número de elementos mayores que " + min + " es: ");
        }
        System.out.println(Excercise.count(mat, min));
    }
}