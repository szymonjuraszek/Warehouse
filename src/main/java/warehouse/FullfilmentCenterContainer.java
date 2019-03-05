package warehouse;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FullfilmentCenterContainer {

    Map<String,FulfillmentCenter> warehouses = new HashMap<>();

    public boolean addCenter(FulfillmentCenter tmpWarehouse){

        String magazineName = tmpWarehouse.getName();
        /*for(Map.Entry<String, FulfillmentCenter> entry : warehouses.entrySet()) {
            String key = entry.getKey();
            //FulfillmentCenter value = entry.getValue();
            if(key.equals(magazineName)){

            }
            //System.out.println(key + ": " + value);
        }*/

        if(!warehouses.containsKey(magazineName)){

            warehouses.put(magazineName,tmpWarehouse);
            return true;
        }else{
            return false;
        }
    }


    public boolean removeCenter(String magazineName){
        if(warehouses.containsKey(magazineName)){

            warehouses.remove(magazineName);
            return true;
        }else{
            return false;
        }

    }

    public List<FulfillmentCenter> findEmpty(){
        List<FulfillmentCenter> emptyWarehoses = new LinkedList<>();

        for(Map.Entry<String, FulfillmentCenter> entry : warehouses.entrySet()) {
            //String key = entry.getKey();
            FulfillmentCenter magazine = entry.getValue();
            if(magazine.getCurrentCapacity() == 0){
                emptyWarehoses.add(magazine);
            }
            //System.out.println(key + ": " + value);
        }

        return emptyWarehoses;
    }

    public void summary(){

        for(Map.Entry<String,FulfillmentCenter> entry: warehouses.entrySet()){
            String key = entry.getKey();
            FulfillmentCenter magazine = entry.getValue();
            System.out.println("Magazyn " + key + " jest zapelniony w " + magazine.getCurrentCapacity()*100 / magazine.getMaxCapacity() + " %");
        }
    }
}
