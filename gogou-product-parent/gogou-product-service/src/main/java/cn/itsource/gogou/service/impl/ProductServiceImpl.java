package cn.itsource.gogou.service.impl;

import cn.itsource.gogou.domain.Product;
import cn.itsource.gogou.mapper.ProductMapper;
import cn.itsource.gogou.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author Alan
 * @since 2019-07-31
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
