import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int celsius = 0;
        double fahren = 0;
        String trash = "";

        System.out.print("Please enter a degree in celsius: ");

        if (in.hasNextInt())
        {
            celsius = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Please enter a valid number for celsius. The inputted integer was: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);
        }
        fahren = 1.8 * celsius + 32;
        System.out.println("The degree " + celsius + "C " + "is " + fahren + " fahrenheit.");

    }
}
