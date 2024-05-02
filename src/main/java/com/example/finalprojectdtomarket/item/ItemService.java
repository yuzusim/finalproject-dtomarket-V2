package com.example.finalprojectdtomarket.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ItemService {
    private final ItemJPARepository itemJPARepository;

}
