import java.util.Scanner;

public class BookingFilm{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = "admin12";
        String password = "pass23";
        boolean loggeIn = false;
        System.out.println("Welcome to the Login System");

        while (!loggeIn) {
            System.out.print("Enter your username: ");
            String enteredUsername = scan.nextLine();


            System.out.print("Enter password: ");
            String enteredPassword = scan.nextLine();

            if (enteredUsername.equals(username) && enteredPassword.equals(password) ) {
                System.out.println("Login Successful");
            }
            else{
                System.out.println("Login failed. Please try again.");}
            }
        }
    }
