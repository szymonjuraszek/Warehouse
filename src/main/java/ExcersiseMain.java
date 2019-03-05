import date.Item;
import date.ItemCondition;
import warehouse.FulfillmentCenter;
import warehouse.FullfilmentCenterContainer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ExcersiseMain {

    public static void main(String[] args){

        List<Item> products = new ArrayList<>();

        products.add(new Item("krzeslo",ItemCondition.NEW,5.25,30));
        products.add(new Item("sofa",ItemCondition.NEW,70,5));
        products.add(new Item("szafa",ItemCondition.USED,125,1));
        products.add(new Item("stol",ItemCondition.REFURBISHED,35,10));

        FulfillmentCenter warehouseOne = new FulfillmentCenter("dziewiatka",1000);
        FulfillmentCenter warehouseTwo = new FulfillmentCenter("Debiec",500);

        warehouseOne.addProduct(products.get(2));
        warehouseOne.addProduct(products.get(0));
        warehouseOne.addProduct(products.get(1));
        warehouseOne.addProduct(products.get(1));

        System.out.println(warehouseOne.toString());
        System.out.println(warehouseOne.max());
        System.out.println(warehouseOne.sortByAmount());
        System.out.println(warehouseOne.sortByName());
        System.out.println(warehouseOne.countByCondition(ItemCondition.USED));
        System.out.println(warehouseOne.searchPartial("sz"));
        System.out.println(warehouseOne.search("szafa"));
        System.out.println(warehouseOne.removeProduct(products.get(0)));

        warehouseOne.summary();
        System.out.println(warehouseOne.toString());


        FullfilmentCenterContainer warehouses = new FullfilmentCenterContainer();
        System.out.println(warehouses.addCenter(warehouseOne));
        System.out.println(warehouses.addCenter(warehouseTwo));
        System.out.println(warehouses.removeCenter("Debiec"));
        System.out.println(warehouses.addCenter(warehouseTwo));
        System.out.println(warehouses.findEmpty());
        warehouses.summary();




    }
}
