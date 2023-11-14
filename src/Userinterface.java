import java.text.DecimalFormat;
import java.util.Scanner;

public class Userinterface {

    private double taxRate;
    private double discount;
    private Scanner scanner;

    public Userinterface() {
        scanner = new Scanner(System.in);
        System.out.println("How many items?");
        int numberOfItems = scanner.nextInt();
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        System.out.println("Price of item?");
        double priceOfItem = scanner.nextDouble();

        System.out.println("Which state do you live in? \n Utah(1) \n " +
                "Nevada (2) \n Texas(3) \n Alamaba (4) \n California (5)  \n" +
                "Type the number corresponding to your state ");

        int userState = scanner.nextInt();

        switch (userState) {
            case 1:
                taxRate = 6.85 / 100;
                break;
            case 2:
                taxRate = 8.0 / 100;
                break;
            case 3:
                taxRate = 6.25 / 100;
                break;
            case 4:
                taxRate = 4.0 / 100;
                break;
            case 5:
                taxRate = 8.25 / 100;
                break;


        }


        double priceNoTax = numberOfItems * priceOfItem;

        if (priceNoTax >= 1000 && priceNoTax < 5000) {
            discount = 3.0 / 100;
        } else if (priceNoTax >= 5000 && priceNoTax < 7000) {
            discount = 5.0 / 100;
        } else if (priceNoTax >= 7000 && priceNoTax < 10000) {
            discount = 7.0 / 100;
        } else if (priceNoTax >= 10000 && priceNoTax < 50000) {
            discount = 10.0 / 100;
        } else if (priceNoTax >= 50000) {
            discount = 15.0 / 100;
        }


        double priceWithDiscount = priceNoTax - (priceNoTax * discount);

        double priceInclTaxAndDiscount = priceWithDiscount +
                (priceWithDiscount * taxRate);


        System.out.println("Price without tax and discount: " + " $" + priceNoTax);
        System.out.println("Total Price inc. discount & tax: " + " $" +
                decimalFormat.format(priceInclTaxAndDiscount));

    }

    public void startProgram() {
    }
}
