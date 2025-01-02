package Exception;

public class exceptionHandling {
    public static void main(String[] args) {
        try{
            System.out.println(15/0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException" + e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}
