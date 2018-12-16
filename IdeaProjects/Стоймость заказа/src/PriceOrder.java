import java.util.Scanner;

public class PriceOrder {
    private static double getPriceOrder(int productTypeOne, int productTypeTwo, double priceProductTypeOne, double priceProductTypeTwo) {
        double discount = 0.05;
        double discount2 = 0.1;
        int discountQuantity = 10;
        int discountPrice = 1000;

        double priceWithoutDiscount = productTypeOne * priceProductTypeOne + productTypeTwo * priceProductTypeTwo;

        if (productTypeOne + productTypeTwo >= discountQuantity && priceWithoutDiscount >= discountPrice) {
            return priceWithoutDiscount - priceWithoutDiscount * discount2;
        } else if (productTypeOne + productTypeTwo >= discountQuantity || priceWithoutDiscount >= discountPrice) {
            return priceWithoutDiscount - priceWithoutDiscount * discount;
        } else {
            return priceWithoutDiscount;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите количество товаров первого типа: ");
        int productTypeOne = scanner.nextInt();

        System.out.println("Укажите количество товаров второго типа: ");
        int productTypeTwo = scanner.nextInt();

        System.out.println("Укажите стоимость товаров первого типа: ");
        double priceProductTypeOne = scanner.nextInt();

        System.out.println("Укажите стоимость товаров второго типа: ");
        double priceProductTypeTwo = scanner.nextInt();

        double price = getPriceOrder(productTypeOne, productTypeTwo, priceProductTypeOne, priceProductTypeTwo);
        System.out.println("Стоимость заказа " + price + " рублей");
    }
}
