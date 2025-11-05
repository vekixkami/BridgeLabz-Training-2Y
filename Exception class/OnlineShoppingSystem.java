public class OnlineShoppingSystem {
    public void placeOrder() {
        Random random = new Random();
        int failureChance = random.nextInt(100);

        try {
            if (failureChance < 50) {
                throw new OutOfStockException("Product is out of stock!");
            } else if (failureChance < 75) {
                throw new PaymentFailedException("Payment failed!");
            }

            // Place order successfully
            System.out.println("Order placed successfully!");
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println(e.getMessage());
        }
    }
}
