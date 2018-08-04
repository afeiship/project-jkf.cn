package cn.jzyunqi.ms.product;

import cn.jzyunqi.common.model.RestResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/products/create")
    public RestResultDto create(ProductDto productDto) {
        return RestResultDto.success(productService.create(productDto));
    }

    @PostMapping("/products/update")
    public RestResultDto update(ProductDto productDto) {
        return RestResultDto.success(productService.update(productDto));
    }

    @PostMapping("/products/query")
    public RestResultDto query(Pageable pageable) {
        return RestResultDto.success(productService.query(pageable));
    }

    @PostMapping("/products/delete")
    public RestResultDto deleteById(Long id) {
        productService.deleteById(id);
        return RestResultDto.success();
    }
}
