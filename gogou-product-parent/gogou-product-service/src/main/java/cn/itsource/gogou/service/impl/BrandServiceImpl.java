package cn.itsource.gogou.service.impl;

import cn.itsource.gogou.domain.Brand;
import cn.itsource.gogou.mapper.BrandMapper;
import cn.itsource.gogou.service.IBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌信息 服务实现类
 * </p>
 *
 * @author Alan
 * @since 2019-07-31
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
