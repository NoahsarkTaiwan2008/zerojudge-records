import java.util.Scanner;

public class h280 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        System.out.println(str1 + str2);
        scanner.close();
    }
}