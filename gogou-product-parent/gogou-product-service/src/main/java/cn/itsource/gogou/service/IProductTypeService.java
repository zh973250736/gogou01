package cn.itsource.gogou.service;

import cn.itsource.gogou.domain.ProductType;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 商品目录 服务类
 * </p>
 *
 * @author Alan
 * @since 2019-07-31
 */
public interface IProductTypeService extends IService<ProductType> {
    /**
     * 加载类型树
     * @return
     */
    List<ProductType> loadTypeTree();

    void genHomePage();
}
