package com.lxf.springcloudalibabanacos;


/**
 * 接口数据返回主体
 * 
 * @author isotope
 * @version 0.1
 * @since 0.2.0.0
 */

public class RESTResultBean {

	protected String token = null;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	protected String jobId = null;

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	/**
	 * 返回结果(0成功1失败)
	 */
	protected String code = "0";// 对接返回代码 -1:无数据 0:正确 其他：对应对接方错误码

	/**
	 * 提示信息
	 */
	protected String message = "";// 对接返回信息 空:正确 其他：对应对接方错误描述

	/**
	 * 返回结果
	 */
	protected Object data = null;

	public String getCode() {
		return code;
	}

	public void setCode(String resultCode) {
		this.code = resultCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String resultMsg) {
		this.message = resultMsg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * @param args
	 */

}
