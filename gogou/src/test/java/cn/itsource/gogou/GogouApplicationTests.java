package cn.itsource.gogou;

import cn.itsource.gogou.domain.User;
import cn.itsource.gogou.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GogouApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void contextLoads() {
		List<User> users = userMapper.selectList(null);
		for (User user : users) {
			System.out.println(user);
		}

	}
	@Test
	public  void  testQuery(){
			userMapper.selectList(
					new QueryWrapper<User>()
							.le("age",21)
							//.like("name","a")
							.orderByDesc("age")
			).forEach(e-> System.out.println(e));

		}


}
