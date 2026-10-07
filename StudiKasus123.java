import java.util.Scanner;

public class StudiKasus123 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pricePerCup = 18000;
        int numOfCup, amountPaid;
        int totalPrice, discount, totalPayment;
        int change, balanceDue = 0;
         
        System.out.print("Input Number of Cup: ");
        numOfCup = input.nextInt();
        System.out.print("Input Amount Paid: ");
        amountPaid = input.nextInt();

         totalPrice = numOfCup * pricePerCup;
        discount = 0;

        if (totalPrice >= 100000) {
            discount = totalPrice * 10 / 100;
        }
        
        totalPayment = totalPrice - discount;
        System.out.println("Total Price: Rp" + totalPrice);
        System.out.println("Discount: " + discount);
        System.out.println("Total Payment: Rp" + totalPayment);

        if (amountPaid >= totalPayment) {
            change = amountPaid - totalPayment;
            System.out.println("Change: " + change);
        } else {
            balanceDue = totalPayment - amountPaid;
            System.out.println("Not enough money, short by Rp" + balanceDue);
        }
            
    input.close();
    }
}

