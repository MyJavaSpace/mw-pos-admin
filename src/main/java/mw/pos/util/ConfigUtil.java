package mw.pos.util;

public class ConfigUtil {
	public static final String lineSeparator = System.getProperty("line.separator", "\n");

	private static final String success = "操作成功！";
	private static final String faile = "操作失败！";

	public static String getFaile() {
		return faile;
	}

	public static String getSuccess() {
		return success;
	}

}
