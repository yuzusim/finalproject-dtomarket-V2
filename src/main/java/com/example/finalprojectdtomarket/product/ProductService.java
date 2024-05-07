package com.example.finalprojectdtomarket.product;

import com.example.finalprojectdtomarket._core.common.ImgSaveUtil;
import com.example.finalprojectdtomarket._core.errors.exception.Exception404;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductJPARepository productJPARepository;

    //상품 목록보기
    public List<Product> findAll() {
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        return productJPARepository.findAll(sort); // return에 sort 객체 안 넣어주면 DESC 안 됨
    }

    // 상품 정보 수정
    @Transactional
    public ProductResponse.UpdateDTO updateProduct(Integer productId, ProductRequest.UpdateDTO reqDTO) {
        Product product = productJPARepository.findById(productId)
                .orElseThrow(() -> new Exception404("상품을 찾을 수 없습니다."));

        String imgName = ImgSaveUtil.save(reqDTO.getImg());
        product.setImg(imgName);
        product.setName(reqDTO.getName());
        product.setPrice(reqDTO.getPrice());
        product.setQty(reqDTO.getQty());
        productJPARepository.save(product);
        return new ProductResponse.UpdateDTO(product);
    }

    public Product findByProductId(Integer productId) {
        return productJPARepository.findById(productId)
                .orElseThrow(() -> new Exception404("상품을 찾을 수 없습니다."));
    }
}
