package morning.cat.mapstruct;

import morning.cat.entity.User;
import morning.cat.vo.UserVo;
import morning.cat.vo.UserVo2;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/3/24 2:13 AM
 */
@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserVo toUserVo(User user);

    List<UserVo> toUserVos(List<User> user);

    @Mapping(source = "name", target = "nameFor")
    @Mapping(source = "birthday", target = "birthday", dateFormat = "yyyy.MM.dd")
    @Mapping(source = "localDate", target = "localDate", dateFormat = "yyyy.MM.dd")
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "day", expression = "java(morning.cat.util.DateFormat.formatDate(user.getBirthday()))")
    @Mapping(target = "day2", expression = "java(org.apache.commons.lang3.time.DateFormatUtils.format(user.getBirthday(),\"yyyy-MM-dd HH:mm:ss\"))")
    UserVo2 toUserVo2(User user);

    /**
     * 和上面同等效果
     */
    @Mappings({
            @Mapping(source = "name", target = "nameFor"),
            @Mapping(source = "birthday", target = "birthday", dateFormat = "yyyy.MM.dd"),
            @Mapping(source = "localDate", target = "localDate", dateFormat = "yyyy.MM.dd"),
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "day", expression = "java(morning.cat.util.DateFormat.formatDate(user.getBirthday()))"),
            @Mapping(target = "day2", expression = "java(org.apache.commons.lang3.time.DateFormatUtils.format(user.getBirthday(),\"yyyy-MM-dd HH:mm:ss\"))")
    })
    UserVo2 toUserVo2_2(User user);


    default UserVo2 toUserVo3(User user) {
        return UserVo2.builder().id(user.getId()).birthday(new SimpleDateFormat("yyyy-MM-dd").format(user.getBirthday())).build();
    }
}
