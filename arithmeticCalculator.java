import java.util.*;
public class arithmeticCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the first value");
        // int a = sc.nextInt();
        // System.out.println("Enter the second value");
        // int b = sc.nextInt();
        // sc.nextLine();
        System.out.println("Enter the operator\n\n1.Add(+)\n2.Sub(-)\n3.Multiply(*)\n4.Divide(/)");

        String operator = sc.nextLine();
        Arithmetic obj = new Arithmetic(10, 5);
        obj.setSecond_value(6);
        switch (operator) {
            case "+":
                System.out.println("Sum of a & b: " + obj.add(obj.getFirst_value(), obj.getSecond_value()));
                break;
            case "-":

                System.out.println("Difference of a & b: " + obj.sub(obj.getFirst_value(), obj.getSecond_value()));
                break;
            case "*":
                System.out.println("Product of a & b: " + obj.mul(obj.getFirst_value(), obj.getSecond_value()));
                break;
            case "/":
                System.out.println("Quotient of a by b: " + obj.div(obj.getFirst_value(), obj.getSecond_value()));
                break;
            default:
                System.out.println("invalid option");
                break;
        }
        sc.close();
    }
}