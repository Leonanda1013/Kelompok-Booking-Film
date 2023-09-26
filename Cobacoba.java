import java.util.Scanner;

public class Cobacoba {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] duduk = {"A1", "A2", "A3", "A4"};
        boolean sekaliPilih = false;

        System.out.println("A1 A2 A3 A4");
        
       

        
            System.out.println("Tempat yang dipesan: ");
            String kursi = scan.nextLine();
             System.out.println(kursi + " tersedia" );
        
        
        System.out.println("Tempat yang dipesan: ");
        String kursi2 = scan.nextLine();
        if (kursi.equals(kursi2)) {
            System.out.println(kursi + "Tidak tersedia");
        } else {
            System.out.println(kursi2 + "Tersedia");
            
        };
        }





    }

