package dao;

import com.iot.dao.UserDao;
import com.iot.entity.User;
import org.junit.Test;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * Created by guoyanlei
 * date：2017/7/27
 * time：11:54
 */
public class UserDaoTest extends BaseTest{

    @Resource
    private UserDao userDao;

    @Test
    public void findUserById() throws IOException {
        User user = userDao.queryById(1);
        System.out.println(user);
    }

    @Test
    public void findAll() throws IOException {
        List<User> users = userDao.queryAll(0,1);
        System.out.println(users);
    }

    @Test
    public void updateName() throws IOException {
        int res = userDao.updateName("guoyanlei",1);
        System.out.println(res);
    }
}
