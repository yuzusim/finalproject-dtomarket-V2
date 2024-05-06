package com.example.finalprojectdtomarket.product;

import com.example.finalprojectdtomarket._core.common.ImgSaveUtil;
import com.example.finalprojectdtomarket.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductJPARepository productJPARepository;


    // 상품 등록하기
    @Transactional
    public void save(ProductRequest.SaveDTO reqDTO) {
        productJPARepository.save(reqDTO.toEntity());
    }

    //상품 목록보기
    public List<Product> findAll() {
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        return productJPARepository.findAll(sort); // return에 sort 객체 안 넣어주면 DESC 안 됨
    }

}
