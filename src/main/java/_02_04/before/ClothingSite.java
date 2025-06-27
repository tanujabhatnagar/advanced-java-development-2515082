package _02_04.before;

public class ClothingSite {

    public static void main(String[] args)
    {
        ShirtItem shirtItem=new ShirtItem();
        checkoutItem(shirtItem);

        JacketItem jacketItem=new JacketItem();
        checkoutItem(jacketItem);
    }
    static void checkoutItem(ClothingItem item) {
        System.out.println("Item purchased: " + item.getName() + ", price: " + item.getPrice());
    }




}
