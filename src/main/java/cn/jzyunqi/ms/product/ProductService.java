package cn.jzyunqi.ms.product;

import cn.jzyunqi.common.model.PageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private IProductDao ProductDao;

    private ProductDto entityToDto(Product Product) {
        ProductDto ProductDto = new ProductDto();
        ProductDto.setTitle(Product.getTitle());
        ProductDto.setDescription(Product.getDescription());
        return ProductDto;
    }

    public PageDto<ProductDto> query(Pageable pageable) {
        Page<Product> Products = ProductDao.findAll(pageable);
        List<ProductDto> ProductDtos = Products.stream().map(this::entityToDto).collect(Collectors.toList());
        return new PageDto<ProductDto>(ProductDtos, Products.getTotalElements());
    }

    @Transactional
    public Product create(ProductDto ProductDto) {
        Product Product = new Product();
        Product.setTitle(ProductDto.getTitle());
        Product.setDescription(ProductDto.getDescription());
        return ProductDao.save(Product);
    }

    @Transactional
    public Product update(ProductDto ProductDto) {
        Product Product = ProductDao.findById(ProductDto.getId()).orElse(new Product());
        Product.setTitle(ProductDto.getTitle());
        Product.setDescription(ProductDto.getDescription());
        return ProductDao.save(Product);
    }

    @Transactional
    public void deleteById(Long id) {
        ProductDao.deleteById(id);
    }
}
