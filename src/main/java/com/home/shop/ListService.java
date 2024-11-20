package com.home.shop;

import com.home.shop.item.Item;
import com.home.shop.item.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ListService {

    private final ItemRepository itemRepository;

    public void listDB(Model model){
    List<Item> result = itemRepository.findAll();
        model.addAttribute("items", result);
    }
}
