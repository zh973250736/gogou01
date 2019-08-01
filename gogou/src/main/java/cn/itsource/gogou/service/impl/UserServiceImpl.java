package cn.itsource.gogou.service.impl;

import cn.itsource.gogou.domain.User;
import cn.itsource.gogou.mapper.UserMapper;
import cn.itsource.gogou.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService {
}