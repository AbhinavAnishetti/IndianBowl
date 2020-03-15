package com.ava.indianbowl.resourcecontroller;

import com.ava.indianbowl.resource.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemController {

    List<Item> itemList = new ArrayList<Item>();

    public List<Item> getItems(){
        return itemList;
    }

    public List<Item> getItemsById(){
        return itemList;
    }

    public long createItem(Item item){
        itemList.add(item);
        return item.getItemId();
    }

    public String updateItemById(){
        return "update Item was called";
    }

    public String deleteItemById(){
        return "delete Item was called";
    }
}
