package cn.itsource.gogou.service.impl;

import cn.itsource.gogou.domain.Product;
import cn.itsource.gogou.mapper.ProductMapper;
import cn.itsource.gogou.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author solargen
 * @since 2019-07-29
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
