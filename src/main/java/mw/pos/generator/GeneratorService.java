package mw.pos.generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import org.apache.commons.io.FileUtils;

import mw.pos.util.ClassUtil;
import mw.pos.util.Common;
import mw.pos.util.ConfigUtil;

public class GeneratorService implements IGeneratorCode {
	final String tempName = "mw.pos.service.impl.txt";
	final String packageName = "com.pos.dao";

	private String getMethodBodyTemp() {
		return "	public {returnType} {methodName}({parameterTypes}){" + ConfigUtil.lineSeparator
				+ "		return {serviceName}Mapper.{methodName}({parameterNames});" + ConfigUtil.lineSeparator + "	}";
	}

	public static void main(String[] args) throws FileNotFoundException {
		new GeneratorService().GeneratorCode();
		System.out.println("done!GeneratorService");
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

			String strings = GetMethodName(string, serviceName);

			classCode = classCode.replace("{MethodName}", strings);
			/*
			 * System.out.println(classCode); break;
			 */

			File file = new File(
					System.getProperty("user.dir") + "/src/main/java/mw/pos/service/impl/" + ServiceName + "Service.java");
			try {
				FileUtils.writeStringToFile(file, classCode);
			} catch (IOException e) { // TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	private String GetMethodName(String className, String serviceName) {
		Method[] methods;
		StringBuffer stringBuffer = new StringBuffer();
		try {
			Class<?> classMw = Class.forName(className);
			methods = classMw.getDeclaredMethods();
			for (Method method : methods) {
				String methodBody = getMethodBodyTemp();
				String methodName = method.getName();
				String returnType = method.getReturnType().getSimpleName();

				methodBody = methodBody.replace("{returnType}", returnType).replace("{methodName}", methodName)
						.replace("{serviceName}", serviceName);

				String parameter = "";
				String parameterName = "";
				Class<?>[] parameterTypes = method.getParameterTypes();
				for (int i = 0; i < parameterTypes.length; i++) {
					Class<?> class1 = parameterTypes[i];
					parameter += class1.getSimpleName() + " " + Common.toLowerCaseFirstOne(class1.getSimpleName())
							+ (i == parameterTypes.length - 1 ? "" : ",");
					parameterName += Common.toLowerCaseFirstOne(class1.getSimpleName())
							+ (i == parameterTypes.length - 1 ? "" : ",");

				}
				methodBody = methodBody.replace("{parameterTypes}", parameter).replace("{parameterNames}",
						parameterName);
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
