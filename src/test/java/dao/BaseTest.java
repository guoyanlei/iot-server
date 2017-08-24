package dao;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by guoyanlei
 * date：2017/8/3
 * time：17:44
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({
        "classpath:applicationContext-dao.xml",
        "classpath:applicationContext-service.xml" })
public class BaseTest {
}
