package mw.pos.handler;

/**
 * 
 * 系统抛出异常结果类
 * 
 * @author mrt
 *
 * 
 * 
 */

public class ExceptionResultInfo extends Exception {
	/**
	 * 
	 * 系统提示信息
	 * 
	 */
	private ResultInfo resultInfo;

	public ExceptionResultInfo(ResultInfo resultInfo) {
		this.resultInfo = resultInfo;
	}

	// get方法在转json时使用

	public ResultInfo getResultInfo() {
		return resultInfo;
	}

	public void setResultInfo(ResultInfo resultInfo) {
		this.resultInfo = resultInfo;
	}

}