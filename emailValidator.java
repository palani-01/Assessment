import java.util.Scanner;

public class emailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        String[] emailList = { "palani@zaggle.in", "prasanna@zaggle.in", "sreesh@zaggle.in", "benny@zaggle.in",
                "abijeeth@zaggle.in" };

        System.out.println("Enter email to verify:");
        String usermail = sc.nextLine();

        for (String s : emailList) {
            if (s.equals(usermail)) {
                flag = 1;
                System.out.println("The mail is present in the list");
                break;
            }
        }
        if (flag == 0) {
            System.out.println("The mail isn't present in the list");
        }
        sc.close();
    }
}
