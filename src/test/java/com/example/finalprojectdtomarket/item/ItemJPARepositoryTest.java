package com.example.finalprojectdtomarket.item;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class ItemJPARepositoryTest {
    @Autowired
    private ItemJPARepository applyJPARepository;
    @Autowired
    private EntityManager em;
}
