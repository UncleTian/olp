package com.bea.olp.encrypt.common;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.Priority;
import org.apache.log4j.RollingFileAppender;

/**
 * @ClassName: LogUtils
 * @Description:<p>该类用于获取日志写入器,以及相关操作</p>
 * @Author: wudi
 * @CreateDate:2014-11-20 上午10:00:00
 * @Version:0.1
 * @ModifyLog:2014-11-20 上午10:00:00
 */
public class LogUtils {
	private static final int	MAX_BACKUP_INDEX	= 30;		// log文件备份数量
	private static final String	MAX_FILE_SIZE		= "50MB";	// log文件大小
	private static final String	ENCODING			= "UTF-8";	// log的文字码
	private static final int	LENGTH				= 3;		// 随机数长度

	/**
	 * @Title: getLogger
	 * @Description:用于获取一个以当前线程名前4位命名的logger
	 * @Parmaters: @return
	 * @Return: Logger
	 * @Throws:
	 * @Author:wudi
	 * @CreateDate:2014-11-20 上午10:00:00
	 * @Version:0.1
	 * @ModifyLog:2014-11-20 上午10:00:00
	 */
	public static Logger getLogger() {
		// 取当前线程名前4位作为logger名称
		//String code = Thread.currentThread().getName();
		String code = Thread.currentThread().getName().substring(0,4);
		/**
		 * 判断logger是否已经存在，logger存在且该logger已配有code命名appender则直接返回
		 */
		if (null != LogManager.exists(code)) {
			Logger logger = LogManager.getLogger(code);
			if (null != logger.getAppender(code)) {
				return logger;
			}
		}

		// 生成logger,传入参数code为logger名
		Logger logger = LogManager.getLogger(code);

		// 移除该logger下所有appender
		// logger.removeAllAppenders();

		// 不继承父logger 的appender
		logger.setAdditivity(true);

		// 日志级别为INFO
		//logger.setLevel(Level.DEBUG);
		logger.setLevel(Level.INFO);

		// 生成新的Appender
		RollingFileAppender appender = new RollingFileAppender();

		// 根据传入参数code命名appender
		appender.setName(code);

		// log的输出形式
		PatternLayout layout = new PatternLayout();
		//String conversionPattern = "%d{yyyy-MM-dd HH:mm:ss,SSS} %11t [%C:%3L] -> %m%n"; // [%d] %p %t %c - %m%n
		String conversionPattern = "%d{yyyy-MM-dd HH:mm:ss,SSS} %11t [%30F:%3L] -> %m%n"; 
		layout.setConversionPattern(conversionPattern);
		appender.setLayout(layout);

		// log输出路径

		String cmislogsPath = "";
		//String date = DateUtils.getCurrDate();
		//appender.setFile(cmislogsPath + code + "_" + date + ".log");
		appender.setFile(cmislogsPath+code+".log");
		// log文件备份数量
		appender.setMaxBackupIndex(MAX_BACKUP_INDEX);

		// log文件大小
		appender.setMaxFileSize(MAX_FILE_SIZE);

		// log的文字码
		appender.setEncoding(ENCODING);

		// 设置日志信息的最低输出级别，默认为DEBUG
		appender.setThreshold(Priority.DEBUG);

		// true:在已存在log文件后面追加 false:新log覆盖以前的log
		appender.setAppend(true);

		// 适用当前配置
		appender.activateOptions();

		/**
		 * 将新的Appende设置到Logger中 利用同步代码块防止多线程环境下,同一个logger下加入两个同名appender,导致日志重复打印...
		 */
		synchronized (LogUtils.class) {
			if (null == logger.getAppender(code)) {
				logger.addAppender(appender);
			}
		}
		return logger;
	}

	/**
	 * @Title: reThreadName
	 * @Description: 根据交易码重命名当前线程名，命名规则为：交易码+当前时间(MMddHHmmssSSS)+3位随机数
	 * @Parmaters: @param code 交易码
	 * @Return: void
	 * @Throws:
	 * @Author:wudi
	 * @CreateDate:2014-11-20 上午10:00:00
	 * @Version:0.1
	 * @ModifyLog:2014-11-20 上午10:00:00
	 */
	public static void reThreadName(String code) {
		//Thread.currentThread().setName(code);
		SimpleDateFormat sdf=new SimpleDateFormat("MMddHHmmssSSS");
		String time =sdf.format(new Date());
		Thread.currentThread().setName(code+Thread.currentThread().getId()+time);
	}

	/**
	 * @Title: getFixedLenString
	 * @Description:根据LENGTH常量格式字符串 如原字符串长度大于LENGTH，则从后往前截取该字符串LENGTH长度 如原字符串长度小于LENGTH，则在该字符串前+"0"，直到该字符串长度为LENGTH
	 * @Parmaters: @param s
	 * @Parmaters: @return
	 * @Return: String
	 * @Throws:
	 * @Author:wudi
	 * @CreateDate:2014-11-20 上午10:00:00
	 * @Version:0.1
	 * @ModifyLog:2014-11-20 上午10:00:00
	 */
	public static String getFixedLenString(String s) {
		if (s != null) {
			if (s.length() > LENGTH) {
				s = s.substring(s.length() - LENGTH);
			} else if (s.length() < LENGTH) {
				while (s.length() < LENGTH) {
					s = "0" + s;
				}
			}
		}
		return s;
	}

	/**
	 * @Title: tmInfo
	 * @Description: 打印用于监控的日志(TransMonitor)
	 * @Parmaters: @param str
	 * @Return: void
	 * @Throws:
	 * @Author:jiangck
	 * @CreateDate:2015-07-29 上午10:00:00
	 * @Version:0.1
	 * @ModifyLog:2015-07-29 上午10:00:00
	 */
	public static void tmInfo(String str) {
		Logger logger = LogManager.getLogger("TRANSMONITOR");
		logger.info(str);
	}
}