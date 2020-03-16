package com.ava.indianbowl.resourcecontroller;

import com.ava.indianbowl.dto.ItemDto;
import com.ava.indianbowl.dto.ProductDto;
import com.ava.indianbowl.resource.Filling;
import com.ava.indianbowl.resource.Item;
import com.ava.indianbowl.resource.Product;
import com.ava.indianbowl.service.CartService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ItemController {

    @Autowired
    CartService cartService;

    public List<Item> getItems(){
        return null;
    }

    public List<Item> getItemsById(){
        return null;
    }

    public String createItem(Product product, Filling filling, double totalPrice){

        Item item = new Item.Builder(filling.getFillingId(), product.getProductId(), totalPrice)
                                 .setItemCount(1).setCartId(0).setFillingCount(1).Build();

        ItemDto itemDto = new ItemDto(item);

        ItemDto createdItem = cartService.createItem(itemDto);

        return "item added" + createdItem.getItemId();
    }

    public String updateItemById(){
        return "update Item was called";
    }

    public String deleteItemById(){
        return "delete Item was called";
    }
}
