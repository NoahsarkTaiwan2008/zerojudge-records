import java.util.Scanner;

public class a009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            System.out.print((char)(input.charAt(i) - 7));
        }

        scanner.close();
    }
}