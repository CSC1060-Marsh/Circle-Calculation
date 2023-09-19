import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //This adds a new scanner system to the program.
        Scanner sc = new Scanner(System.in);
        //This asks the user to input the radius of their circle.
        System.out.println("What is the radius of your circle?");
        //This defines the double "radius" as their input.
        double radius = Double.parseDouble(sc.nextLine());
        //This uses the program "diametercalculation" to print out the calculated diameter of their circle.
        System.out.println("The diameter of your circle is " + diametercalculation(radius));
        //This uses the program "areacalculation" to print out the calculated area of their circle.
        System.out.println("The area of your circle is " + areacalculation(radius));
        //This uses the program "circumferencecalculation" to print out the calculated circumference of their circle.
        System.out.println("The circumference of your circle is " + circumferencecalculation(radius));
    }

    //This adds a new program "diametercalculation" using the previous double "radius" to do the calculations.
    public static double diametercalculation(double radius) {
        //This defines the double "diameter" as the input radius times two.
        double diameter = radius * 2;
        //This returns the calculated diameter to the main program as the output of the "diametercalculation" program.
        return diameter;
    }

    //This adds a new program "areacalculation" using the previous double "radius" to do the calculations.
    public static double areacalculation(double radius) {
        //This defines the double "area" as the radius squared times pi.
        double area = radius * radius * Math.PI;
        //This returns the calculated area as the output of this program.
        return area;
    }

    //This adds a new program "circumferencecalculation" using the previous double "radius" to do the calculations.
    public static double circumferencecalculation(double radius) {
        //This defines the double "circumference" as the radius times two times pi.
        double circumference = radius * 2 * Math.PI;
        //This returns the calculated circumference as the output of the "circumferencecalculation" program.
        return circumference;
    }

}
    
