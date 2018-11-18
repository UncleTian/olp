package com.bea.olp.ant.common;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.io.input.XmlStreamReader;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.apache.log4j.Logger;



public class ObjectFieldsOperation {
	private static Logger logger = Logger
			.getLogger(ObjectFieldsOperation.class);

	public enum DataOperation {
		insert, update, delete
	};

	private static Map<String, Object> getFieldsList(Object obj,
			Boolean isBaseFields) {
		Map<String, Object> list = objectFieldsToList(obj);
		Map<String, Object> listSuperClass = null;
		if (isBaseFields) {
			Class<?> superClass = obj.getClass().getSuperclass();
			if (BaseObject.class.equals(superClass.getClass())) {
				listSuperClass = objectFieldsToList(superClass);
				if (null != listSuperClass) {
					list.putAll(listSuperClass);
				}
			}
		}
		return list;
	}

	@SuppressWarnings("rawtypes")
	public static <T> String convertObjectToSql(Object obj, DataOperation oper,
			String whereCondition, Boolean isBaseFields) {

		switch (oper) {
		case insert:
			Map<String, Object> list = getFieldsList(obj, isBaseFields);
			String fields = "";
			String values = "";
			Iterator it = list.keySet().iterator();
			while (it.hasNext()) {
				String key = it.next().toString();
				fields += key + ",";
				values += list.get(key) + ",";
			}
			if (list.size() > 0) {
				fields = fields.substring(0, fields.length() - 1);
				values = values.substring(0, values.length() - 1);
			}
			String insertSql = new String().format(
					"insert ignore into %s ( %s ) values (%s);", obj.getClass()
							.getSimpleName().toUpperCase(), fields, values);
			System.out.println(insertSql);
			return insertSql;
		case update:
			Map<String, Object> listUpdate = getFieldsList(obj, isBaseFields);
			String setValues = "";
			Iterator itUpdate = listUpdate.keySet().iterator();
			while (itUpdate.hasNext()) {
				String key = itUpdate.next().toString();
				setValues += key + " = " + listUpdate.get(key) + ",";
			}
			if (listUpdate.size() > 0) {
				setValues = setValues.substring(0, setValues.length() - 1);
			}
			String updateSql = new String().format(
					"update %s set %s where %s $", obj.getClass()
							.getSimpleName().toUpperCase(), setValues,
					whereCondition);
			System.out.println(updateSql);
			return updateSql;
		case delete:
			String delWhere = "";
			String deleteSql = new String().format("delete from %s where %s $",
					obj.getClass().getSimpleName().toUpperCase(),
					whereCondition);
			System.out.println(deleteSql);
			return deleteSql;
		default:
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public static <T> Map<String, Object> objectFieldsToList(Object object) {
		Field[] attributes = object.getClass().getDeclaredFields();
		Map<String, Object> params = new HashMap<String, Object>();
		System.out.println("class name===>" + object.getClass().getSimpleName()
				+ "  ====> Field Size :" + attributes.length);

		for (Field field : attributes) {
			try {
				T t = (T) PropertyUtils.getSimpleProperty(object,
						field.getName());
				// System.out.println("value====> "+field.getName());
				if (null != t) {
					if (String.class.equals(t.getClass())) {
						String str = (String) t;
						if (!str.isEmpty()) {
							// System.out.println("value====> "+str);
							params.put(field.getName().substring(0), "'" + str
									+ "'");
						}
					} else if (Long.class.equals(t.getClass())) {
						if (null != t)
							params.put(field.getName().substring(0),
									t.toString());
					} else if (long.class.equals(t.getClass())) {
						if (null != t)
							params.put(field.getName().substring(0),
									t.toString());
					} else if (Integer.class.equals(t.getClass())) {
						if (null != t)
							params.put(field.getName().substring(0),
									t.toString());
					} else if (int.class.equals(t.getClass())) {
						if (null != t)
							params.put(field.getName().substring(0),
									t.toString());
					} else if (double.class.equals(t.getClass())) {
						if (null != t)
							params.put(field.getName().substring(0),
									t.toString());
					} else if (Double.class.equals(t.getClass())) {
						if (null != t)
							params.put(field.getName().substring(0),
									t.toString());
					}
				}
			} catch (Exception e) {
				logger.error(e.getStackTrace().toString());
				e.printStackTrace();
			
			}
		}
		return params;
	}

	public static Object getObjectFromXML(String xmlPath, Class<?> clazz) {
		Object obj = null;
		try {
			JAXBContext context = JAXBContext.newInstance(clazz);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			obj = unmarshaller.unmarshal(new File(xmlPath));
		} catch (JAXBException e) {
			logger.error(e.getStackTrace().toString());
			e.printStackTrace();
			
		} catch (Exception e) {
			logger.error(e.getStackTrace().toString());
			e.printStackTrace();
			
		}
		return obj;
	}
	
	public static void writeXmlFileFormObject(String path,Object obj) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(obj.getClass());

			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, false);// 是否省略xm头声明信息
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			jaxbMarshaller.marshal(obj, new File(path));
		} catch (JAXBException e) {
			logger.error(e.getStackTrace().toString());
			e.printStackTrace();
			
		} catch (Exception e) {
			logger.error(e.getStackTrace().toString());
			e.printStackTrace();
		}
	}
	
	/**
	 * 从xml对象转化为对象(对象较大的方式)
	 * @param path
	 * @param obj
	 */
	@SuppressWarnings("unchecked")
	public static <T> Object XmlFileToObject(String path, Class<T> c,Unmarshaller.Listener mListener) {
		JAXBContext jc;
		try {
			jc = JAXBContext.newInstance(c);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			unmarshaller.setListener(mListener);
			java.io.InputStream is;
			try {
				is = new FileInputStream(path);
				XmlStreamReader reader = null;
				reader = new XmlStreamReader(is);
				return (T) unmarshaller.unmarshal(reader);
			} catch (UnsupportedEncodingException e1) {
				logger.error(e1.getStackTrace());
				e1.printStackTrace();
				
			} catch (IOException e) {
				logger.error(e.getStackTrace().toString());
				e.printStackTrace();
			}
		} catch (JAXBException e) {
			logger.error(e.getStackTrace().toString());
			e.printStackTrace();
		} catch (Exception e) {
			logger.error(e.getStackTrace().toString());
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 将大量对象写入xml文件(对象较大的方式)
	 * @param path
	 * @param obj
	 */
	 public static void createXmlFileForList(String path, Class c,List lists,String Head)throws JAXBException, XMLStreamException,
	    FileNotFoundException, UnsupportedEncodingException{
	    	
	    	if(lists == null || lists.size() == 0){
	    		return;
	    	}
	    	
	    	// Step 1. 创建JAXB上下文
	        JAXBContext context = JAXBContext.newInstance(c);
	        
	        // Step 2. 创建Marshaller
	        Marshaller marshaller = context.createMarshaller();
	        marshaller.setProperty(Marshaller.JAXB_ENCODING, "utf-8");
	        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
	        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
	        
	        //Step 3. 创建XMLStreamWriter 以流的方式写
	        XMLOutputFactory output = XMLOutputFactory.newInstance();
	        //output.setProperty(XMLOutputFactory.IS_REPAIRING_NAMESPACES, false);
	        File file = new File(path);
	        OutputStream out = new FileOutputStream(file);
	        XMLStreamWriter writer = output.createXMLStreamWriter(out, "UTF-8");
	        
	        //Setp 4.开始写xml头信息
	        writer.writeStartDocument();
	        //writer.setDefaultNamespace("");
	        writer.writeStartElement("", Head);
	        
	        //Step 5. 使用JaXB写入循环的大量记录
	        for (int i = 0; i < lists.size(); i++) {
	            // Step 4.1. 准备需要的JavaBean（比如查询数据库）
	            Object object = lists.get(i);
	            // 计算当前记录转换成XML后的长度（注意:会)
	            StringWriter w = new StringWriter();
	            marshaller.marshal(object, w);
	            int curRecLength = w.getBuffer().length();
	            System.out.println("当前记录的长度为(含xmlns)：" + curRecLength);
	            System.out.println(w);
	            // Step 4. 转换并输出
	            marshaller.marshal(object, writer);
	            writer.flush();
	            System.out.println("XML 文件当前记录长度 (仅根元素含xmlns)= " + file.length());
	        }
	        
	        // 写入结束标签
	        writer.writeEndElement();
	        writer.writeEndDocument();
	        writer.flush();
	}

	@SuppressWarnings("unchecked")
	public static <T> T StringToObject(String value, Class<T> c) {
		JAXBContext jc;
		try {
			jc = JAXBContext.newInstance(c);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			java.io.InputStream is;
			try {
				String getString = value.replace((char) 0x00a0, ' ');// 转换特殊字符
				is = new ByteArrayInputStream(getString.getBytes("UTF-8"));
				XmlStreamReader reader = null;
				reader = new XmlStreamReader(is);
				return (T) unmarshaller.unmarshal(reader);
			} catch (UnsupportedEncodingException e1) {
				logger.error(e1.getStackTrace());
				e1.printStackTrace();
			
			} catch (IOException e) {
				logger.error(e.getStackTrace().toString());
				e.printStackTrace();
			}
		} catch (JAXBException e) {
			logger.error(e.getStackTrace().toString());
			e.printStackTrace();
		} catch (Exception e) {
			logger.error(e.getStackTrace().toString());
			e.printStackTrace();
		}
		return null;
	}

	public static String ConverObjectToString(Object obj) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(obj.getClass());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
//			jaxbMarshaller.marshal(new JAXBElement<InventoryMessage>(new QName("http://www.chinaport.gov.cn/ENT", ""),
//					InventoryMessage.class, InventoryMessage), obj);
			
			java.io.OutputStream os = new ByteArrayOutputStream();
			OutputStreamWriter writer = new OutputStreamWriter(os);
			jaxbMarshaller.marshal(obj, writer);
			return os.toString();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public static <T> Map<String, Object> objectFieldToMapList(Object object) {
		Field[] attributes = object.getClass().getDeclaredFields();
		Map<String, Object> params = new HashMap<String, Object>();
		System.out.println("class name===>" + object.getClass().getSimpleName()
				+ "  ====> Field Size :" + attributes.length);

		for (Field field : attributes) {
			try {
				T t = (T) PropertyUtils.getSimpleProperty(object,
						field.getName());
				if (null != t) {
					if ("String".equals(t.getClass().getSimpleName())) {
						String str = (String) t;
						if (!str.isEmpty()) {
							System.out.println("value====> " + str);
							params.put(field.getName(), str);// URLEncoder.encode(str,"UTF-8")));
						}
					} else {
						params.put(field.getName(), "" + t);
					}
				}
			} catch (IllegalAccessException e) {
				logger.error(e.getStackTrace().toString());
				e.printStackTrace();
				
			} catch (InvocationTargetException e) {
				logger.error(e.getStackTrace().toString());
				e.printStackTrace();
				
			} catch (NoSuchMethodException e) {
				logger.error(e.getStackTrace().toString());
				e.printStackTrace();
				
			} catch (Exception e) {
				logger.error(e.getStackTrace().toString());
				e.printStackTrace();
				
			}
		}
		return params;
	}

	@SuppressWarnings("unchecked")
	public static <T> List<NameValuePair> objectFieldToNameValuePair(
			Object object) {
		Field[] attributes = object.getClass().getDeclaredFields();
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		System.out.println("class name===>" + object.getClass().getSimpleName()
				+ "  ====> Field Size :" + attributes.length);

		for (Field field : attributes) {
			try {
				T t = (T) PropertyUtils.getSimpleProperty(object,
						field.getName());
				if (null != t) {
					if ("String".equals(t.getClass().getSimpleName())) {
						String str = (String) t;
						if (!str.isEmpty()) {
							System.out.println("value====> " + str);
							params.add(new BasicNameValuePair(field.getName(),
									str));// URLEncoder.encode(str,"UTF-8")));
						}
					} else {
						params.add(new BasicNameValuePair(field.getName(), ""
								+ t));
					}
				}
			} catch (IllegalAccessException e) {
				logger.error(e.getStackTrace().toString());
				e.printStackTrace();
				
			} catch (InvocationTargetException e) {
				logger.error(e.getStackTrace().toString());
				e.printStackTrace();
			
			} catch (NoSuchMethodException e) {
				logger.error(e.getStackTrace().toString());
				e.printStackTrace();
			
			} catch (Exception e) {
				logger.error(e.getStackTrace().toString());
				e.printStackTrace();
			
			}
		}
		return params;
		/*
		 * Class<?> superClass = object.getClass().getSuperclass();
		 * if("TerBaseInput".equals(superClass.getSimpleName()) ||
		 * "BaseObject".equals(superClass.getSimpleName())) { Field []
		 * superAttributes = superClass.getDeclaredFields();
		 * 
		 * System.out.println("Super Class Field Size :"+
		 * superAttributes.length); for (Field field : superAttributes) { try {
		 * field.setAccessible(true); T t = (T)field.get(object); params.add(new
		 * BasicNameValuePair(field.getName(), ""+t)); } catch (Exception e) {
		 * e.printStackTrace(); } } }
		 */
	}
	
}
