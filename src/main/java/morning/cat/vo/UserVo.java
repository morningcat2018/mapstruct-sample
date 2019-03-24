package morning.cat.vo;

import lombok.*;

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
public class UserVo {

    private Long id;

    private String name;

    private Integer age;
}
