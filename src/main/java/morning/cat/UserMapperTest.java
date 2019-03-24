package morning.cat;

import morning.cat.entity.User;
import morning.cat.mapstruct.UserMapper;
import morning.cat.vo.UserVo;
import morning.cat.vo.UserVo2;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Date;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/3/24 2:21 AM
 */
public class UserMapperTest {

    @Test
    public void test1() {
        User user = User.builder().id(100L).name("gozi").age(19).birthday(new Date()).build();
        UserVo vo = UserMapper.INSTANCE.toUserVo(user);
        System.out.println(vo);
    }

    @Test
    public void test2() {
        User user = User.builder().id(100L).name("gozi").age(19).birthday(new Date()).localDate(LocalDate.now()).build();
        UserVo2 vo = UserMapper.INSTANCE.toUserVo2(user);
        System.out.println(vo);
    }

    @Test
    public void test3() {
        User user = User.builder().id(100L).name("gozi").age(19).birthday(new Date()).localDate(LocalDate.now()).build();
        UserVo2 vo_2 = UserMapper.INSTANCE.toUserVo2_2(user);
        System.out.println(vo_2);
    }

}
