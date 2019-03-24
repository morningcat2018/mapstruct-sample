package morning.cat.mapstruct;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import morning.cat.entity.User;
import morning.cat.vo.UserVo;
import morning.cat.vo.UserVo.UserVoBuilder;
import morning.cat.vo.UserVo2;
import morning.cat.vo.UserVo2.UserVo2Builder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-03-24T14:17:03+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_181 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserVo toUserVo(User user) {
        if ( user == null ) {
            return null;
        }

        UserVoBuilder userVo = UserVo.builder();

        userVo.id( user.getId() );
        userVo.name( user.getName() );
        userVo.age( user.getAge() );

        return userVo.build();
    }

    @Override
    public List<UserVo> toUserVos(List<User> user) {
        if ( user == null ) {
            return null;
        }

        List<UserVo> list = new ArrayList<UserVo>( user.size() );
        for ( User user1 : user ) {
            list.add( toUserVo( user1 ) );
        }

        return list;
    }

    @Override
    public UserVo2 toUserVo2(User user) {
        if ( user == null ) {
            return null;
        }

        UserVo2Builder userVo2 = UserVo2.builder();

        if ( user.getBirthday() != null ) {
            userVo2.birthday( new SimpleDateFormat( "yyyy.MM.dd" ).format( user.getBirthday() ) );
        }
        if ( user.getLocalDate() != null ) {
            userVo2.localDate( DateTimeFormatter.ofPattern( "yyyy.MM.dd" ).format( user.getLocalDate() ) );
        }
        userVo2.nameFor( user.getName() );
        userVo2.age( user.getAge() );

        userVo2.day2( org.apache.commons.lang3.time.DateFormatUtils.format(user.getBirthday(),"yyyy-MM-dd HH:mm:ss") );
        userVo2.day( morning.cat.util.DateFormat.formatDate(user.getBirthday()) );

        return userVo2.build();
    }

    @Override
    public UserVo2 toUserVo2_2(User user) {
        if ( user == null ) {
            return null;
        }

        UserVo2Builder userVo2 = UserVo2.builder();

        if ( user.getBirthday() != null ) {
            userVo2.birthday( new SimpleDateFormat( "yyyy.MM.dd" ).format( user.getBirthday() ) );
        }
        if ( user.getLocalDate() != null ) {
            userVo2.localDate( DateTimeFormatter.ofPattern( "yyyy.MM.dd" ).format( user.getLocalDate() ) );
        }
        userVo2.nameFor( user.getName() );
        userVo2.age( user.getAge() );

        userVo2.day2( org.apache.commons.lang3.time.DateFormatUtils.format(user.getBirthday(),"yyyy-MM-dd HH:mm:ss") );
        userVo2.day( morning.cat.util.DateFormat.formatDate(user.getBirthday()) );

        return userVo2.build();
    }
}
