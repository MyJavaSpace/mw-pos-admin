package mw.pos.generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import org.apache.commons.io.FileUtils;
import org.aspectj.weaver.TypeVariable;

import mw.pos.util.ClassUtil;
import mw.pos.util.Common;
import mw.pos.util.ConfigUtil;

public class GeneratorIService implements IGeneratorCode {
	final String tempName = "mw.pos.iservice.txt";
	final String packageName = "com.pos.dao";
	final String methodBodyTemp = "	{returnType} {methodName}({parameterTypes});";

	public static void main(String[] args) throws FileNotFoundException {
		new GeneratorIService().GeneratorCode();
		System.out.println("done!GeneratorIService");
	}

	@Override
	public void GeneratorCode() {
		// TODO Auto-generated method stub
		String tempCode = ReadTemp();

		List<String> lstClass = ClassUtil.getClassName(packageName, false);

		if (tempCode.isEmpty() || lstClass.size() == 0) {
			return;
		}

		for (String string : lstClass) {
			String classCode = tempCode;
			String serviceName = string.replace("com.pos.dao.", "").replace("Mapper", "");
			String ServiceName = Common.toUpperCaseFirstOne(serviceName);
			classCode = classCode.replace("{serviceName}", serviceName).replace("{ServiceName}", ServiceName);
			Class<?> classMw=null;
			try {
				classMw = Class.forName(string);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Type[] temp = ((ParameterizedType) classMw.getGenericInterfaces()[0]).getActualTypeArguments();
			java.lang.reflect.TypeVariable<?>[] typeVariable = classMw.getInterfaces()[0].getTypeParameters();
			for (int i = 0; i < temp.length; i++) {
				classCode=classCode.replace("{"+i+"}", ((Class) temp[i]).getSimpleName() );
			}
			//String strings = GetMethodName(string);

			//classCode = classCode.replace("{MethodName}", strings);

			File file = new File(
					System.getProperty("user.dir") + "/src/main/java/mw/pos/service/I" + ServiceName + "Service.java");
			try {
				FileUtils.writeStringToFile(file, classCode);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private String GetMethodName(String className) {
		// System.out.println(className);
		Method[] methods;
		StringBuffer stringBuffer = new StringBuffer();
		Hashtable<String, String> dictionary = new Hashtable();
		try {
			Class<?> classMw = Class.forName(className);
			Type[] temp = ((ParameterizedType) classMw.getGenericInterfaces()[0]).getActualTypeArguments();
			java.lang.reflect.TypeVariable<?>[] typeVariable = classMw.getInterfaces()[0].getTypeParameters();
			for (int i = 0; i < temp.length; i++) {
				dictionary.put(typeVariable[i].getName(), ((Class) temp[i]).getSimpleName());
			}
			/*for (Entry<String, String> entry : dictionary.entrySet()) {

				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

			}*/
			// System.out.println([0].getName());
			/*
			 * for (Method method :
			 * classMw.getInterfaces()[0].getDeclaredMethods()) { Type type =
			 * method.getGenericReturnType(); if (type instanceof
			 * ParameterizedType) { // 判断获取的类型是否是参数类型 System.out.println(type);
			 * Type[] typesto = ((ParameterizedType)
			 * type).getActualTypeArguments();// 强制转型为带参数的泛型类型， //
			 * getActualTypeArguments()方法获取类型中的实际类型，如map<String,Integer>中的 //
			 * String，integer因为可能是多个，所以使用数组 for (Type type2 : typesto) {
			 * System.out.println("泛型类型" + type2); } } }
			 */

			methods = classMw.getMethods();
			for (Method method : methods) {
				 System.out.println(method);
				String methodBody = methodBodyTemp;
				String methodName = method.getName();
				String returnType = method.getReturnType().getSimpleName();

				Type type1 = method.getGenericReturnType();

				if (type1 instanceof ParameterizedType) { // 判断获取的类型是否是参数类型
					returnType = type1.toString();
					Type[] typesto = ((ParameterizedType) type1).getActualTypeArguments();// 强制转型为带参数的泛型类型，
					for (Type type2 : typesto) {
						returnType = returnType.replace(type2.toString(), dictionary.get(type2.toString()));
					}
				} else if (returnType.equals("Object")) {
					returnType = returnType.replace("Object", dictionary.get("T"));
				}
				methodBody = methodBody.replace("{returnType}", returnType).replace("{methodName}", methodName);

				String parameter = "";
				Type[] types = method.getGenericParameterTypes();
				for (Type type : types) {
					//System.out.println(type);
				}
				Type[] parameterTypes = method.getGenericParameterTypes();
				for (int i = 0; i < parameterTypes.length; i++) {
					Type class1 = parameterTypes[i];
					 if (class1 instanceof Class) {
						 System.out.println(class1);
					}
						else {
						 
						//	 System.out.println("212"+ Class.forName(class1.toString()).getName());
						}
					 
					/*parameter += class1.getSimpleName() + " " + Common.toLowerCaseFirstOne(class1.getSimpleName())
							+ (i == parameterTypes.length - 1 ? "" : ",");*/

				}
				methodBody = methodBody.replace("{parameterTypes}", parameter);
				stringBuffer.append(methodBody);
				stringBuffer.append(ConfigUtil.lineSeparator);

			}
			return stringBuffer.toString();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "";
	}

	private String ReadTemp() {
		try {
			return FileUtils.readFileToString(new File(ClassLoader.getSystemResource(tempName).getPath()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
	}

}
