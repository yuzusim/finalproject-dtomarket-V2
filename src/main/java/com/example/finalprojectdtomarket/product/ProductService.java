package com.example.finalprojectdtomarket.product;

import com.example.finalprojectdtomarket._core.errors.exception.Exception404;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductJPARepository productJPARepository;

    //상품 상세보기
    public ProductResponse.DetailDTO getDetail(Integer id) {
        Product product = productJPARepository.findById(id)
                .orElseThrow(() -> new Exception404("상품이 존재하지 않습니다."));

//        System.out.println("dto확인 " + product);
        return new ProductResponse.DetailDTO(product);

    }


    //상품 목록보기
    public List<Product> findAll() {
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        return productJPARepository.findAll(sort); // return에 sort 객체 안 넣어주면 DESC 안 됨
    }

}
