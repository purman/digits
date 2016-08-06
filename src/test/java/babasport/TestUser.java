package babasport;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wangc.core.dto.user.User;
import com.wangc.core.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:application-context.xml")
public class TestUser {

	@Autowired
	private UserService userService;
	
	@Test
	public void testName() throws Exception {
		User user  = new User();
		user.setUserName("家家乐");
		user.setPassword("123");
		user.setAge(122);
		userService.addUser(user);
	}
}
