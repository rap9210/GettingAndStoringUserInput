import java.util.Scanner;

public class GettingAndStoringUserInput {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first name initial");
        String firstInitial = scn.next();
        System.out.println("Enter last name");
        String lastName = scn.next();
        System.out.println("Enter house number");
        int houseNumber = scn.nextInt();
        System.out.println("Enter street name");
        String streetName = scn.next();
        System.out.println("Enter street type");
        String streetType = scn.next();
        System.out.println("Enter city");
        String city = scn.next();

        System.out.println(firstInitial+" "+lastName);
        System.out.println(houseNumber+" "+streetName+" "+streetType+" "+city);
    }
}
