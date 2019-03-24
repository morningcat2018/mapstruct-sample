package morning.cat.entity;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/3/24 2:12 AM
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;

    private String name;

    private Integer age;

    private Date birthday;

    private LocalDate localDate;
}
