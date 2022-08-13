package Examples;
import java.util.Scanner;
public class timeconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter days to converter into seconds:");
        int days = scanner.nextInt();

        int hrs = days*24;
        int mins = hrs*60;
        int secs = mins*60;

        System.out.println(days +" days are converterd into "+secs);

    }
}
