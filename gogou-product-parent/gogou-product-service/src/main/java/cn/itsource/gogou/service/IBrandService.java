package cn.itsource.gogou.service;

import cn.itsource.basic.util.PageList;
import cn.itsource.gogou.domain.Brand;
import cn.itsource.gogou.query.BrandQuery;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 品牌信息 服务类
 * </p>
 *
 * @author Alan
 * @since 2019-07-31
 */
public interface IBrandService extends IService<Brand> {

    /**
     * 分页查询
     * @param query
     * @return
     */
    PageList<Brand> queryPage(BrandQuery query);
}
