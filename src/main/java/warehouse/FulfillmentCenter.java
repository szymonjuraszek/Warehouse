package warehouse;

import date.Item;
import date.ItemCondition;

import java.util.*;

public class FulfillmentCenter {

    private String name;
    private List<Item> products = new LinkedList<>();
    private double maxCapacity;
    private double currentCapacity = 0;

    public FulfillmentCenter() {
    }

    public FulfillmentCenter(String name,  double maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
    }

    public boolean addProduct(Item product){
        double tmpMass = product.getMass()*product.getValue()+ currentCapacity;
        String tmpName = product.getName();

        if(tmpMass <= maxCapacity){
            currentCapacity = tmpMass;
            /*Iterator<Item> itemIterator = products.iterator();*/
            for (Item item: products){
                if(product.compareTo(item) == 0){
                    item.increaseValueOfProduct(product.getValue());
                    return true;
                }
            }
            /*while(itemIterator.hasNext()) {
                if (product.compareTo(itemIterator.next()) == 0) {
                    itemIterator.next().increaseValueOfProduct(product.getValue());
                    return true;
                }
            }*/

            products.add(product);

        }else{
            System.err.println("Magazyn przepelniony!");
            return false;
        }

        return true;
    }

    public boolean getProduct(Item product){
        String tmpName = product.getName();
        for(Item item: products){
            if(tmpName.compareTo(item.getName())==0){
                int tmpValue = item.getValue();
                tmpValue--;
                if(tmpValue == 0){
                    products.remove(item);
                }

                return true;
            }
        }

        return false;

    }


    public boolean removeProduct(Item product){
        String tmpName = product.getName();

        for(Item item: products){
            System.out.println(item.getName());
            System.out.println(tmpName);
            if(tmpName.compareTo(item.getName())==0){
                products.remove(item);
                System.out.println("dupa");
                return true;
            }
        }


        return false;
    }


    public Item search(String productName){
        for(Item item: products){
            if(productName.compareTo(item.getName())==0){
                Item tmpItem = item;
                products.remove(item);
                return tmpItem;
            }
        }

        return null;
    }


    public List<Item> searchPartial(String namePartial){
        List<Item> searchedProducts = new LinkedList<>();

        for(Item item: products){
            if(item.getName().contains(namePartial)){
                searchedProducts.add(item);
            }
        }

        return searchedProducts;
    }



    public int countByCondition(ItemCondition condition){
        int sumProducts = 0;
        for(Item item: products){
            if(item.getCondition() == condition){
                sumProducts += item.getValue();
            }
        }


        return sumProducts;
    }



    public void summary(){
        for(Item item: products){
            System.out.println(item.toString());
        }
    }



    public List<Item> sortByName(){
        Collections.sort(products);

        return products;
    }


    public List<Item> sortByAmount(){

        products.sort(Comparator.comparingInt(Item::getValue));
        Collections.reverse(products);

        return products;
    }


    public Item max(){

        Item tmpProduct = Collections.max(products, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return Integer.compare(o1.getValue(),o2.getValue());
            }
        });

        return tmpProduct;
    }


    public double getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(double currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getProducts() {
        return products;
    }

    public void setProducts(List<Item> products) {
        this.products = products;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return "FulfillmentCenter{" +
                "name='" + name + '\'' +
                ", products=" + products +
                ", maxCapacity=" + maxCapacity +
                '}';
    }
}
