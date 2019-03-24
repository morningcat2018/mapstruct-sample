package morning.cat.vo;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/3/24 2:15 AM
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserVo2 {

    private Long id;

    private String nameFor;

    private Integer age;

    private String birthday;

    private String localDate;

    private String day;

    private String day2;
}
