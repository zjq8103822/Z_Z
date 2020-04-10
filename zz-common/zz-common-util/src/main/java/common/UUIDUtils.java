package common;

import java.util.UUID;

/**
 * UUID生成工具类
 * @auther Zhang_Jiaqi
 * @create_date 2020-04-10 16:10
 */
public class UUIDUtils {

	/**
	 * @author Zhang_Jiaqi
	 * @Description 生成uuid
	 * @Date 2020/4/10/010 16:19
	 * @Param []
	 * @Return java.lang.String
	 */
	public static String getUUID() {
		UUID uuid=UUID.randomUUID();
		return uuid.toString().replaceAll("-", "");
	}
}
