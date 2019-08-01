package cn.itsource.gogou.service.impl;

import cn.itsource.gogou.domain.ProductType;
import cn.itsource.gogou.mapper.ProductTypeMapper;
import cn.itsource.gogou.service.IProductTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品目录 服务实现类
 * </p>
 *
 * @author Alan
 * @since 2019-07-31
 */
@Service
public class ProductTypeServiceImpl extends ServiceImpl<ProductTypeMapper, ProductType> implements IProductTypeService {

}
