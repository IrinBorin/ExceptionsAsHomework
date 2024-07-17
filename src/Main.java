import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Uncountable  {
        sumOfNumbers();
        System.out.println("Enter two numbers:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
         compareTwoNumbers(a,b);}
        catch ( TheSecondNumberIsGreaterThanTheSecondOne e) {
            System.out.println("Sorry, something went wrong.");
        }
    }

        public static void sumOfNumbers() throws Uncountable {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an integer:");
            int enteredNumber = scanner.nextInt();
            int sum = 0;
            for (int i = 1; i < enteredNumber; i++) {
                sum = sum + i;
                if (i >= enteredNumber - 1) {
                    System.out.println(sum);
                    if (sum >= 10000) {
                        Uncountable uncountable = new Uncountable();
                        throw uncountable;
                    }
                }
            }
        }


        private static void compareTwoNumbers(int a, int b) throws TheSecondNumberIsGreaterThanTheSecondOne {
        if (b > a){
            TheSecondNumberIsGreaterThanTheSecondOne compare = new TheSecondNumberIsGreaterThanTheSecondOne();
            throw compare;
        }
        }
    }
