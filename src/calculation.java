import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calculation {

    public static void main(String[] args) throws IOException {
        float heightPaul , weightPaul ,BMI;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your height in  meters : ");
        heightPaul = Float.parseFloat(reader.readLine());

        System.out.print("Enter your weight in kg : ");
        weightPaul = Float.parseFloat(reader.readLine());
        heightPaul = heightPaul*heightPaul;

        BMI = weightPaul/heightPaul;
        System.out.println("Your BMI is: " + BMI);

        if (BMI <16.00)
            System.out.println("starvation");

            // condition 2
        else if (16.00>BMI & BMI<16.99)
            System.out.println("emaciation");

            // condition 3
        else if (17.00>BMI & BMI<18.49)
            System.out.println("underweight");

            // condition 4
        else if (18.50>BMI & BMI<22.99)
            System.out.println("normal, low range");

            // condition 5
        else if (23.00>BMI & BMI<24.99)
            System.out.println("normal, high range");

            // condition 6
        else if (25.00>BMI & BMI<27.49)
            System.out.println("overweight, low range");

            // condition 7
        else if (27.50>BMI & BMI<29.99)
            System.out.println("overweight, high range");

            // condition 8
        else if (30>BMI & BMI<34.9)
            System.out.println("1st degree obesity");

            // condition 9
        else if (35>BMI & BMI<39.9)
            System.out.println("2nd degree obesity");

            // condition 10
        else if (BMI>40)
            System.out.println("3rd degree obesity");
    }
}
