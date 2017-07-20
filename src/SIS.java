import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by marcking2 on 7/19/17.
 */

public class SIS {
    public static void main(String[] args) {


        Scanner scnr = new Scanner(System.in);

        String[] names = { "Martin", "Thurgood", "Jessie", "Lionel", " Andrew", " Duke", "Bill", "Tom", "Medgar",
                "Fannie", "Robert", "Sam", "Alice", "Coretta", "Harriet", "Joan", "Mai-Lan", "Pam", "Sue", "Ming",};
        String[] homeTown = { "Ferndale", "Detroit", "Ferndale", "Detroit", " Ferndale", " Detroit", "Ferndale", "Detroit", "Ferndale",
                "Detroit", "Ferndale", "Detroit", "Ferndale", "Detroit", "Ferndale", "Detroit", "Ferndale", "Detroit", "Ferndale", "Detroit",};
        String[] favoriteFood = { "Burger", "Fair", "Burger", "Fair", " Burger", " Fair", "Burger", "Fair", "Burger",
                "Burger", "Fair", "Burger", "Fair", "Burger", "Fair", "Burger", "Fair", "Burger", "Fair", "Burger",};

        int stuNum = 1;
        boolean test = false;
        boolean test2 = false;
        System.out.println("\n\n\nWelcome to The Scholarly School For The Learned Student Information System.");
        do {
            try {
                System.out.print("\n\nPlease enter a student number: ");
                stuNum = scnr.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid entry. Please enter a number from 1 to 20.");
                return;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("\nData does not exist.");
            } catch (Exception e) {

                System.out.println("\nUser error");
                return;
            } finally {

                System.out.println("\n\nProgram terminated. End of line. MCP");
            }test = true;
        }while(test = false);

        System.out.println("\n\nGetting info for student number: " + stuNum + "...");

        System.out.printf("\nStudent number %s is %s.", stuNum, names[stuNum -1] );



        do {
            try {
                System.out.print("\n\nPlease enter a student number: ");
                stuNum = scnr.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid entry. Please enter a number from 1 to 20.");
                return;
            } catch (Exception e) {

                System.out.println("\nI don't know what happened");
                return;
            } finally {

                System.out.println("\n\nProgram terminated. End of line. MCP");
            }test = true;
        }while(test2 = false);


        System.out.println("\n\n\nEnd of line. MCP");


    }
}





