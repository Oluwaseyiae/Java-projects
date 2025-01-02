package Exception;

public class throwingException {
    public static void main(String[] args) {

        int balance = 100000;
        int withdrawal = 19000000;

        try {
            if (withdrawal > balance)
                throw new ArithmeticException("You don't have enough money");

            balance = balance - withdrawal;
            System.out.println("Amount withdraw succefully");

        } catch (ArithmeticException e) {
            System.out.println("Program continues");
        }


    }
}
