package com.ava.indianbowl.serviceImpl;

import com.ava.indianbowl.CartRepository;
import com.ava.indianbowl.dto.ItemDto;
import com.ava.indianbowl.dto.ProductDto;
import com.ava.indianbowl.entity.ItemEntity;
import com.ava.indianbowl.entity.ProductEntity;
import com.ava.indianbowl.resource.Item;
import com.ava.indianbowl.service.CartService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartRepository cartRepository;

    @Override
    public ItemDto createItem(ItemDto item) {

        ItemEntity itemEntity = new ItemEntity();
        BeanUtils.copyProperties(item, itemEntity);

        ItemEntity storedItemEntity = cartRepository.save(itemEntity);
        Item storedItem = new Item.Builder(storedItemEntity.getFillingId(), storedItemEntity.getProductId(), storedItemEntity.getTotalPrice())
                .setItemCount(storedItemEntity.getItemCount())
                .setCartId(storedItemEntity.getCartId())
                .setFillingCount(storedItemEntity.getFillingCount())
                .Build();

        ItemDto returnValue = new ItemDto(storedItem);
        BeanUtils.copyProperties(storedItemEntity, returnValue);

        return returnValue;
    }
}
