public class Problem1 {
    public static void main(String[] args) {
        double CostPrice= 8546;
        double SellingPrice= 8546;

        if (CostPrice < SellingPrice){
            System.out.println("The Seller is in PROFIT with a profit of "+(SellingPrice-CostPrice)+".");
        }else if (CostPrice == SellingPrice){
            System.out.println("The Seller is neither in Profit nor Loss.");
        }else{
            System.out.println("The Seller is in LOSS with a profit of "+(CostPrice-SellingPrice)+".");
        }
    }
}
