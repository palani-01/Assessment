import java.util.*;

public class arithmeticCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value");
        int a = sc.nextInt();
        System.out.println("Enter the second value");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the operator\n\n1.Add(+)\n2.Sub(-)\n3.Multiply(*)\n4.Divide(/)");

        

        String operator = sc.nextLine();
        Arithmetic obj = new Arithmetic();
        switch (operator) {
            case "+":
                System.out.println("Sum of a & b: "+ obj.add(a,b));
                break;
            case "-":

                System.out.println("Difference of a & b: " + obj.sub(a,b));
                break;
            case "*":
                System.out.println("Product of a & b: " + obj.mul(a,b));
                break;
            case "/":
                System.out.println("Quotient of a by b: " + obj.div(a,b));
                break;
            default:
                System.out.println("invalid option");
                break;
        }
        sc.close();
    }
}