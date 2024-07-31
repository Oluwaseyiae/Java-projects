import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();


        System.out.println("Welcome to THRIVELINK Currency Converter");
        System.out.println("We have limited currency here but the top 15 currencies are available. The default currency is NGN");
        System.out.println("Available currencies: USD, AUD, CAD, EUR, GBP, JPY, INR, KRW");

        System.out.print("Enter the currency you want to convert: ");
        String currency = sc.nextLine().toLowerCase(Locale.ROOT);
        System.out.print("Enter the amount you want to convert: ");
        double amount = sc.nextDouble();

        switch (currency) {
            case "aud":
                System.out.println("Rate: 1 AUD is 1,084.78 NGN");
                amount = amount * 1084.78;
                System.out.println("Your money is " + nf.format(amount));
                break;
            case "cad":
                System.out.println("Rate: 1 CAD is 1,202.58 NGN");
                amount = amount * 1202.58 ;
                System.out.println("Your money is " + nf.format(amount));
                break;
            case "usd":
                System.out.println("Rate: 1 USD is 1,658.11 NGN");
                amount = amount * 1658.11;
                System.out.println("Your money is " + nf.format(amount));
                break;
            case "eur":
                System.out.println("Rate: 1 EUR is 1,800.35 NGN");
                amount = amount * 1800.35;
                System.out.println("Your money is " + nf.format(amount));
                break;
            case "gbp":
                System.out.println("Rate: 1 GBP is 2,131.06 NGN");
                amount = amount * 2131.06;
                System.out.println("Your money is " + nf.format(amount));
                break;
            case "jpy":
                System.out.println("Rate: 1 JPY is 11.0643 NGN");
                amount = amount * 11.0643;
                System.out.println("Your money is " + nf.format(amount));
                break;
            case "inr":
                System.out.println("Rate: 1 INR is 19.8449 NGN");
                amount = amount * 19.8449;
                System.out.println("Your money is " + nf.format(amount));
                break;
            case "krw":
                System.out.println("Rate: 1 KRW is 1.21193 NGN");
                amount = amount * 1.21193;
                System.out.println("Your money is " + nf.format(amount));
                break;

            default:
                System.out.println("Invalid currency entered.");
                break;
        }
        sc.close();

    }
}
