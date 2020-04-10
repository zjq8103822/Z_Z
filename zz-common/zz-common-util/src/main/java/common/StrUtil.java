package common;

import org.springframework.util.StringUtils;

/**
 * 字符串处理工具类
 * @auther Zhang_Jiaqi
 * @create_date 2020-04-10 15:59
 */
public class StrUtil {

	/**
	 * @author Zhang_Jiaqi
	 * @Description 判断字符串是否为空
	 * @Date 2020/4/10 16:17
	 * @Param [str]
	 * @Return boolean
	 */
	public static boolean isNotEmpty(String str) {
		return !StringUtils.isEmpty(str);
	}
	
	/**
	 * @author Zhang_Jiaqi
	 * @Description 判断字符串是否不为空
	 * @Date 2020/4/10 16:17
	 * @Param [str]
	 * @Return boolean
	 */
	public static boolean isEmpty(String str) {
		return StringUtils.isEmpty(str);
	}
}
