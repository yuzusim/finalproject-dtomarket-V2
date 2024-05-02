package com.example.finalprojectdtomarket.item;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class ItemController {

    private final ItemService itemService;
    private final HttpSession session;

}
