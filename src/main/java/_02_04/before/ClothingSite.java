package _02_04.before;

import java.util.ArrayList;
import java.util.List;

public class ClothingSite {

    public static void main(String[] args)
    {
        ShirtItem shirtItem=new ShirtItem();
      //  checkoutItem(shirtItem);

        JacketItem jacketItem=new JacketItem();
      //  checkoutItem(jacketItem);

        List<ClothingItem> clothingItemList=new ArrayList<>();
        clothingItemList.add(shirtItem);
        clothingItemList.add(jacketItem);
        checkoutAllItems(clothingItemList);
    }
    static void checkoutItem(ClothingItem item) {
        System.out.println("Item purchased: " + item.getName() + ", price: " + item.getPrice());
    }

    static void checkoutAllItems(List<ClothingItem> clothingItems){
        for(ClothingItem clothingItem:clothingItems){
            checkoutItem(clothingItem);
        }

    }




}
