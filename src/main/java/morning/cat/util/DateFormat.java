package morning.cat.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/3/24 11:20 AM
 */
public class DateFormat {

    public static String formatDate(Date date) {
        return (new SimpleDateFormat("yyyy--MM--dd")).format(date);
    }
}
