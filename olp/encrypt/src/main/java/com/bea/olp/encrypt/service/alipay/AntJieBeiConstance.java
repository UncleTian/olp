/**  
 * @Title: AntJieBeiConstance.java
 * @Package: com.yusys.service.handler.jiebei
 * @Description: 蚂蚁借呗接口处理包
 * @Author:huangwb
 * @CreateDate:2018年6月4日 下午1:41:14
 * @Version:0.1
 * @ModifyLog:2018年6月4日 下午1:41:14
 */
package com.bea.olp.encrypt.service.alipay;

/**
 * @ClassName: AntJieBeiConstance
 * @Description: 蚂蚁借呗相关常量类
 * @Author:huangwb
 * @CreateDate:2018年6月5日 下午1:56:26
 * @Version:0.1
 * @ModifyLog:2018年6月5日 下午1:56:26
 */
public class AntJieBeiConstance {
	/** 请求方式 */
	public static final String	HTTP							= "01";					// http请求
	public static final String	HTTPS							= "03";					// https请求

	/** 规则结果 */
	public static final String	RULE_RESULT_0					= "0";						// 通过
	public static final String	RULE_RESULT_1					= "1";						// 不通过

	/** 业务审核，是否通过 */
	public static final String	SECOND_GEN_REASON_00			= "J000";					// 审批成功
	public static final String	SECOND_GEN_REASON_01			= "J001";					// 队列审批异常，请稍后再试
	public static final String	SECOND_GEN_REASON_02			= "J002";					// 准入规则拒绝
	public static final String	SECOND_GEN_REASON_03			= "J003";					// 审批规则拒绝

	/** 本次审批结果，是否通过 */
	public static final String	PLATFORM_ACCESS_Y				= "Y";						// 通过
	public static final String	PLATFORM_ACCESS_N				= "N";						// 不通过

	/** 是否之前就有借呗额度 */
	public static final String	HAS_JBADMIT_Y					= "Y";						// 表示之前有借呗额度
	public static final String	HAS_JBADMIT_N					= "N";						// 表示之前没有借呗额度

	/** 申请类型 8-联合贷款申请 */
	public static final String	APP_TYPE_8						= "8";

	/** 证件类型 */
	public static final String	CERT_TYPE_1						= "10100";					// 身份证,本地版本
	public static final String	CERT_TYPE_01					= "01";					// 身份证
	public static final String	CERT_TYPE_02					= "02";					// 护照
	public static final String	CERT_TYPE_03					= "03";					// 军官证
	public static final String	CERT_TYPE_04					= "04";					// 士兵证
	public static final String	CERT_TYPE_05					= "05";					// 户口本
	public static final String	CERT_TYPE_06					= "06";					// 警官证
	public static final String	CERT_TYPE_07					= "07";					// 台湾居民来往大陆通行证（简称“台胞证”）
	public static final String	CERT_TYPE_08					= "08";					// 港澳居民来往内地通行证（简称“回乡证”）
	public static final String	CERT_TYPE_09					= "09";					// 临时身份证
	public static final String	CERT_TYPE_10					= "10";					// 港澳通行证
	public static final String	CERT_TYPE_11					= "11";					// 营业执照
	public static final String	CERT_TYPE_12					= "12";					// 外国人居留证
	public static final String	CERT_TYPE_13					= "13";					// 香港身份证
	public static final String	CERT_TYPE_14					= "14";					// 武警证
	public static final String	CERT_TYPE_15					= "15";					// 组织机构代码证
	public static final String	CERT_TYPE_16					= "16";					// 行政机关
	public static final String	CERT_TYPE_17					= "17";					// 社会团体
	public static final String	CERT_TYPE_18					= "18";					// 军队
	public static final String	CERT_TYPE_19					= "19";					// 武警
	public static final String	CERT_TYPE_20					= "20";					// 下属机构(具有主管单位批文号)
	public static final String	CERT_TYPE_21					= "21";					// 基金会
	public static final String	CERT_TYPE_99					= "99";					// 其它

	/** 初审申请状态 :001-审批中、002-初审审批失败、003-初审审批通过、004-初审审批异常 */
	public static final String	FIRST_APP_STATUS_001			= "001";
	public static final String	FIRST_APP_STATUS_002			= "002";
	public static final String	FIRST_APP_STATUS_003			= "003";
	public static final String	FIRST_APP_STATUS_004			= "004";

	/** 终审申请状态 001-待审批 002-审批失败 003-审批成功 004-审批异常 */
	public static final String	SECOND_APP_STATUS_001			= "001";					// 001-待审批
	public static final String	SECOND_APP_STATUS_002			= "002";					// 002-审批失败
	public static final String	SECOND_APP_STATUS_003			= "003";					// 003-审批成功
	public static final String	SECOND_APP_STATUS_004			= "004";					// 004-审批异常

	/** 蚂蚁借呗执行状态开始 **/
	public static final String	EXEC_STATUS_F					= "F";						// F 失败
	public static final String	EXEC_STATUS_S					= "S";						// S 成功
	/** 蚂蚁借呗执行状态结束 **/

	/**
	 * CHANNEL_TYPE : 渠道来源
	 */
	public static String		JieBeiChannelType				= "98";

	/**
	 * PRD_CODE : 产品代码
	 */
	public static final String	JIEBEI_PRD_CODE					= "1001100001";

	/**
	 * CHANNEL_TYPE : 渠道来源
	 */
	public static final String	JIEBEI_CHANNEL_TYPE				= "98";

	/**
	 * appId : 应用ID号，用于标记报文来源方
	 */
	public static final String	APP_ID							= "HKBEA99";

	/**
	 * FUNCTION : 授信申请
	 */
	public static final String	FUNCTION_APPLY					= "apply";

	public static final String	CREDIT_DYADIC_ARRAY				= "ANT_JIEBEI_MATRIX";
	/**
	 * FUNCTION : 审批结果返回
	 */
	public static final String	FUNCTION_RESULT_ACK				= "resultAck";

	/**
	 * RESULTCODE : 执行成功或者幂等返回。不需重试
	 */
	public static final String	RESULT_CODE_SUCCESS				= "0000";

	/**
	 * RESULTCODE : 系统异常。可重试
	 */
	public static final String	RESULT_CODE_SYSTEM_EXCEPTION	= "9000";

	/**
	 * RESULTMSG : 系统异常。可重试
	 */
	public static final String	RESULT_MSG_SYSTEM_EXCEPTION		= "系统异常。可重试";

	/**
	 * RESULTCODE : 来报参数有误（为空，或者类型有误），不需重试
	 */
	public static final String	RESULT_CODE_PARAM_EXCEPTION		= "0011";

	/**
	 * RESULTMSG :来报参数有误（为空，或者类型有误），不需重试
	 */
	public static final String	RESULT_MSG_PARAM_EXCEPTION		= "来报参数有误（为空，或者类型有误），不需重试";

	/**
	 * RESULTCODE :申请单不存在
	 */
	public static final String	RESULT_CODE_APPLYNO_EXCEPTION	= "0004";

	/**
	 * RESULTMSG :申请单不存在
	 */
	public static final String	RESULT_MSG_APPLYNO_EXCEPTION	= "申请单不存在";

	/**
	 * RESULTMSG : 执行成功
	 */
	public static final String	RESULT_MSG_SUCCESS				= "成功";
	/**
	 * RETRY : 可重试
	 */
	public static final String	RETRY_YES						= "Y";

	/**
	 * RETRY : 不需重试
	 */
	public static final String	RETRY_NO						= "N";

	/**
	 * REASON_CODE : 逾期风险类黑名单
	 */
	public static final String	REASON_CODE_01					= "reason_code_01";
	/**
	 * REASON_CODE : 欺诈风险类黑名单
	 */
	public static final String	REASON_CODE_02					= "reason_code_02";
	/**
	 * REASON_CODE : 公检法风险类黑名单
	 */
	public static final String	REASON_CODE_03					= "reason_code_03";
	/**
	 * REASON_CODE : 历史征信不良
	 */
	public static final String	REASON_CODE_04					= "reason_code_04";
	/**
	 * REASON_CODE : 多头借贷客户
	 */
	public static final String	REASON_CODE_05					= "reason_code_05";
	/**
	 * REASON_CODE : 年龄或地区不符合
	 */
	public static final String	REASON_CODE_06					= "reason_code_06";
	/**
	 * REASON_CODE : 信息存在异常
	 */
	public static final String	REASON_CODE_07					= "reason_code_07";
	/**
	 * REASON_CODE : 已有额度客户
	 */
	public static final String	REASON_CODE_08					= "reason_code_08";
	/**
	 * REASON_CODE : 申请曾拒绝客户
	 */
	public static final String	REASON_CODE_09					= "reason_code_09";
	/**
	 * REASON_CODE : 综合评分高
	 */
	public static final String	REASON_CODE_10					= "reason_code_10";
	/**
	 * REASON_CODE : 其他
	 */
	public static final String	REASON_CODE_11					= "reason_code_11";

	/**
	 * REASON_MSG : 逾期风险类黑名单
	 */
	public static final String	REASON_MSG_01					= "逾期风险类黑名单";
	/**
	 * REASON_MSG : 欺诈风险类黑名单
	 */
	public static final String	REASON_MSG_02					= "欺诈风险类黑名单";
	/**
	 * REASON_MSG : 公检法风险类黑名单
	 */
	public static final String	REASON_MSG_03					= "公检法风险类黑名单";
	/**
	 * REASON_MSG : 历史征信不良
	 */
	public static final String	REASON_MSG_04					= "历史征信不良";
	/**
	 * REASON_MSG : 多头借贷客户
	 */
	public static final String	REASON_MSG_05					= "多头借贷客户";
	/**
	 * REASON_MSG : 年龄或地区不符合
	 */
	public static final String	REASON_MSG_06					= "年龄或地区不符合";
	/**
	 * REASON_MSG : 信息存在异常
	 */
	public static final String	REASON_MSG_07					= "信息存在异常";
	/**
	 * REASON_MSG : 已有额度客户
	 */
	public static final String	REASON_MSG_08					= "已有额度客户";
	/**
	 * REASON_MSG : 申请曾拒绝客户
	 */
	public static final String	REASON_MSG_09					= "申请曾拒绝客户";
	/**
	 * REASON_MSG : 综合评分高
	 */
	public static final String	REASON_MSG_10					= "综合评分高";
	/**
	 * REASON_MSG : 其他
	 */
	public static final String	REASON_MSG_11					= "其他";
}
