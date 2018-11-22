package com.weal.component.base.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @Description: 字符串处理工具类
 * @author: guogchao
 * @date: 2011-6-6上午10:28:09
 */
public class ToolEx {
	/**
	 * 字符串首字母小写
	 * 
	 * @param str
	 * @return
	 */
	public static String toLowerCaseFirstOne(String str) {
		if (str == null || "".equals(str))
			return str;
		if (Character.isLowerCase(str.charAt(0)))
			return str;
		else
			return (new StringBuilder())
					.append(Character.toLowerCase(str.charAt(0)))
					.append(str.substring(1)).toString();
	}

	/**
	 * 字符串首字母大写
	 * 
	 * @param str
	 * @return
	 */
	public static String toUpperCaseFirstOne(String str) {
		if (str == null || "".equals(str))
			return str;
		if (Character.isUpperCase(str.charAt(0)))
			return str;
		else
			return (new StringBuilder())
					.append(Character.toUpperCase(str.charAt(0)))
					.append(str.substring(1)).toString();
	}

	/**
	 * 随机生成字符串
	 * 
	 * @param length
	 * @return
	 */
	public static String getRandomString(int length) {
		String base = "abcdefghijklmnopqrstuvwxyzABCDEFJHIGKLMNOPQRSTUVWSYZ0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
	}

	/**
	 * 随机生成数字
	 * 
	 * @param length
	 * @return
	 */
	public static String getRandomInteger(int length) {
		String base = "0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
	}
	

	/**
	 * 判断字符串是否为null
	 * 
	 * @param str
	 * @return 不为null返回true 如果为null返回false
	 */
	public static boolean isNotEmpty(Object str) {
		if (str == null) {
			return false;
		}
		else if(str instanceof Map){
			if(((Map)str).size()==0){
				return false;
			}
		}
		else if(str instanceof List){
			if(((List)str).size()==0){
				return false;
			}
		}
		else if(str instanceof Set){
			if(((Set)str).size()==0){
				return false;
			}
		}
		else if(str instanceof Object[]){
			if(((Object[])str).length==0){
				return false;
			}
		}
		else if(str instanceof String[]){
			if(((String[])str).length==0){
				return false;
			}
		}
		else if(str instanceof Integer[]){
			if(((Integer[])str).length==0){
				return false;
			}
		}
		else if(str instanceof Double[]){
			if(((Double[])str).length==0){
				return false;
			}
		}
		else if(str.toString().trim().equals("")){
			return false;
		}
		return true;
	}
	
	/**
	 * 判断是否为中文
	 * @param str
	 * @return
	 */
	public static boolean isChinese(String str){
        java.util.regex.Pattern p= java.util.regex.Pattern.compile("[\u4e00-\u9fa5]"); 
        Matcher m=p.matcher(str); 
        return m.find();
    }
	/**
	 * 验证是否是Ip
	 * @date 2017年5月12日 下午5:07:23
	 */
	public static boolean isIp(String str){
		Pattern pattern = Pattern.compile("\\b((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\b");
		Matcher matcher = pattern.matcher(str); //以验证127.400.600.2为例
		return matcher.matches();
	}
	
	/**
	 * 判断是否是数字
	 * 
	 * */
	public static boolean isNumeric(String str){
		   for(int i=str.length();--i>=0;){
		      int chr=str.charAt(i);
		      if(chr<48 || chr>57)
		         return false;
		   }
		   return true;
		}
	
	/**
	 * 转换int类型
	 * 
	 * @param str
	 * @return
	 */
	public static int strToInteger(Object str) {
		int tmp=0;
		if (str == null || "".equals(str)) {
			return tmp;
		}
		try {
			tmp=Integer.parseInt(str.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return tmp;
				
	}
	
	/**
	 * 转换double类型
	 * 
	 * @param str
	 * @return
	 */
	public static double strToDouble(Object str) {
		double tmp=0.0;
		if (str == null || "".equals(str)) {
			return tmp;
		}
		try {
			tmp=Double.parseDouble(str.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return tmp;
				
	}
	
	/**
	 * 转换类型
	 * 
	 * @param str
	 * @return
	 */
	public static Object ObjectToClass(Object str,Class<?> clas) {
		Object val=null;
		if (str == null) {
			return val;
		}
		try {
			if(clas==Integer.class || clas==int.class){
				val=Integer.parseInt(str.toString());
			}else if(clas==Character.class || clas==char.class){
				val=(Character)str;
			}else if(clas==String.class || clas==StringBuffer.class){
				if(str instanceof Date){
					String date=ToolDate.getFormatDate((Date)str);
					date=ToolDate.formatSubDate(date);
					val=date;
				}else{
					val=str.toString();
				}
			}else if(clas==Double.class || clas==double.class){
				val=Double.parseDouble(str.toString());
			}else if(clas==Boolean.class || clas==boolean.class ){
				val=(Boolean)str;
			}else if(clas==Float.class || clas==float.class){
				val=(Float)str;
			}else if(clas==Long.class || clas==long.class){
				val=(Long)str;
			}else if(clas==Byte.class || clas==byte.class){
				val=(Byte)str;
			}else if(clas==Short.class || clas==short.class){
				val=(Short)str;
			}else if(clas==BigDecimal.class){
				val=(BigDecimal)str;
			}else if(clas==List.class){
				val=(List)str;
			}else if(clas==Map.class){
				val=(Map)str;
			}else if(clas==Set.class){
				val=(Set)str;
			}else if(clas==Object[].class){
				val=(Object[])str;
			}else if(clas==String[].class){
				val=(String[])str;
			}else if(clas==Integer[].class || clas==int[].class){
				val=(Integer[])str;
			}else if(clas==Long[].class || clas==long[].class){
				val=(Long[])str;
			}else if(clas==Double[].class || clas==double[].class){
				val=(Double[])str;
			}else if(clas==Date.class){
				if(str instanceof Long){
					val=new Date(Long.parseLong(ToolEx.toString(str)));
				}else if(str instanceof String){
					val=ToolDate.getFormatDate(ToolEx.toString(str));
				}else{
					val=str;
				}
			}else{
				val=str;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(str);
			val=null;
		}
		return val;
				
	}
	
	public static Long strToLong(Object str) {
		Long tmp=0L;
		if (str == null || "".equals(str)) {
			return tmp;
		}
		try {
			tmp=Long.parseLong(str.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tmp;
				
	}
	
	public static Integer strToIntegerNull(Object str) {
		if (str == null || "".equals(str)) {
			return null;
		}
		int tmp=0;
		try {
			tmp=Integer.parseInt(str.toString());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return tmp;
	}
	
	/**
	 * 比较
	 * @param obj1
	 * @param obj2
	 * @return
	 */
	public static boolean equals(Object obj1,Object obj2){
		if(obj1==null && obj2==null){
			return true;
		}
		if(obj1==null || obj2==null){
			return false;
		}
		if(obj1.toString().trim().equals(obj2.toString().trim())){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * 比较 obj1>obj2 1 
	   obj1<obj2 -1 
	   obj1=obj2 0
	 * @param obj1
	 * @param obj2
	 * @return
	 */
	public static int equalsInt(Object obj1,Object obj2){
		if(obj1==null && obj2==null){
			return 0;
		}
		return Integer.compare(strToInteger(obj1), strToInteger(obj2));
	}
	
	/**
	 * 转为字符串
	 * 
	 * @param str
	 * @return
	 */
	public static String toString(Object str) {
		if (str == null) {
			return "";
		}
		return str.toString().trim();
	}
	
	
	/**
	 * 判断是否为url
	 * @param str
	 * @return
	 */
	public static boolean isStrToUrl(String str){
		String regex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]" ;
		Pattern patt = Pattern.compile(regex );
		Matcher matcher = patt.matcher(str);
		boolean isMatch = matcher.matches();
		return isMatch;
	}
	
	/**
	 * 判断是否为null
	 * @param objects
	 * @return
	 */
	public static boolean checkIsNull(Object...objects ){
		if(objects==null){
			return false;
		}
		for (Object object : objects) {
			if(object==null){
				return false;
			}
			if(!isNotEmpty(object)){
				return false;
			}
		}
		return true;
	}
	
		
	/**
	 * 字符串split
	 * @param str
	 * @return
	 */
	public static String[] split(String key,String bs) {
		if(!isNotEmpty(key)){
			return null;
		}
		return key.split(bs);
	}
	
	/**
	 * 去除空格
	 * @param obj
	 * @return
	 */
	public static String trimAll(Object obj){
		if(!isNotEmpty(obj)){
			return "";
		}
		String tmp=obj.toString();
		return tmp.replace(" ", ""); 
	}
	/**
	 * 手机号去重
	 * @param yourStr
	 * @return
	 */
	public static String strHeavy(Object yourStr){
		if(!isNotEmpty(yourStr)){
			return "";
		}
		List<String> lis=new ArrayList<String>();
		for (String string : yourStr.toString().split(",")) {
			if(!lis.contains(string)){
				lis.add(string);
			}
		}
		StringBuilder result=new StringBuilder();
        boolean flag=false;
        for (String string : lis) {
            if (flag) {
                result.append(",");
            }else {
                flag=true;
            }
            result.append(string);
        }
        return result.toString();
	}
	
	// 不能全是相同的数字或者字母（如：000000、111111、aaaaaa） 全部相同返回true
	public static boolean equalStr(String numOrStr) {
			boolean flag = true;
			char str = numOrStr.charAt(0);
			for (int i = 0; i < numOrStr.length(); i++) {
				if (str != numOrStr.charAt(i)) {
					flag = false;
					break;
				}
			}
			return flag;
		}

		// 不能是连续的数字--递增（如：123456、12345678）连续数字返回true
		public static boolean isOrderNumeric(String numOrStr) {
			boolean flag = true;// 如果全是连续数字返回true
			boolean isNumeric = true;// 如果全是数字返回true
			for (int i = 0; i < numOrStr.length(); i++) {
				if (!Character.isDigit(numOrStr.charAt(i))) {
					isNumeric = false;
					break;
				}
			}
			if (isNumeric) {// 如果全是数字则执行是否连续数字判断
				for (int i = 0; i < numOrStr.length(); i++) {
					if (i > 0) {// 判断如123456
						int num = Integer.parseInt(numOrStr.charAt(i) + "");
						int num_ = Integer.parseInt(numOrStr.charAt(i - 1) + "") + 1;
						if (num != num_) {
							flag = false;
							break;
						}
					}
				}
			} else {
				flag = false;
			}
			return flag;
		}

		// 不能是连续的数字--递减（如：987654、876543）连续数字返回true
		public static boolean isOrderNumeric_(String numOrStr) {
			boolean flag = true;// 如果全是连续数字返回true
			boolean isNumeric = true;// 如果全是数字返回true
			for (int i = 0; i < numOrStr.length(); i++) {
				if (!Character.isDigit(numOrStr.charAt(i))) {
					isNumeric = false;
					break;
				}
			}
			if (isNumeric) {// 如果全是数字则执行是否连续数字判断
				for (int i = 0; i < numOrStr.length(); i++) {
					if (i > 0) {// 判断如654321
						int num = Integer.parseInt(numOrStr.charAt(i) + "");
						int num_ = Integer.parseInt(numOrStr.charAt(i - 1) + "") - 1;
						if (num != num_) {
							flag = false;
							break;
						}
					}
				}
			} else {
				flag = false;
			}
			return flag;
		}
    
    /**
	 * 字符串转为unicode
	 * @param gbString
	 * @return
	 */
	public static String strConvUnicode(final String gbString) {
		char[] utfBytes = gbString.toCharArray();
		String unicodeBytes = "";
		for (int byteIndex = 0; byteIndex < utfBytes.length; byteIndex++) {
			String hexB = Integer.toHexString(utfBytes[byteIndex]);
			if (hexB.length() <= 2) {
				hexB = "00" + hexB;
			}
			unicodeBytes = unicodeBytes + "\\u" + hexB;
		}
		return unicodeBytes;
	}
	
	
	/**
	 * Unicode转字符串
	 * @param str
	 * @return
	 */
	public static String unicodeConvStr(String str) {
		str = (str == null ? "" : str);
		if (str.indexOf("\\u") == -1)// 如果不是unicode码则原样返回
			return str;

		StringBuffer sb = new StringBuffer(1000);

		for (int i = 0; i < str.length() - 6;) {
			String strTemp = str.substring(i, i + 6);
			String value = strTemp.substring(2);
			int c = 0;
			for (int j = 0; j < value.length(); j++) {
				char tempChar = value.charAt(j);
				int t = 0;
				switch (tempChar) {
				case 'a':
					t = 10;
					break;
				case 'b':
					t = 11;
					break;
				case 'c':
					t = 12;
					break;
				case 'd':
					t = 13;
					break;
				case 'e':
					t = 14;
					break;
				case 'f':
					t = 15;
					break;
				default:
					t = tempChar - 48;
					break;
				}

				c += t * ((int) Math.pow(16, (value.length() - j - 1)));
			}
			sb.append((char) c);
			i = i + 6;
		}
		return sb.toString();
	}
	public static String convertUnicode(String orgStr) {

		if (orgStr == null) {
			return null;
		}
		if (orgStr.indexOf("\\u")==-1) {
			return orgStr;
		}
		int startPos = 0;
		int curPos = 0;
		StringBuffer buffer = new StringBuffer();

		while ((curPos = orgStr.indexOf("\\u", startPos)) != -1) {
			buffer.append(orgStr.substring(startPos, curPos));
			char temp = (char) Integer.parseInt(orgStr.substring(curPos + 2, curPos + 6), 16);
			buffer.append(temp);
			startPos = curPos + 6;

		}
		buffer.append(orgStr.substring(startPos,orgStr.length()));
		return buffer.toString();

	}
	
	private static void removeList(List result,int size){
		if(result!=null && result.size()>size){
			result.remove(result.size()-1);
			removeList(result,size);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(isChinese("d中"));
	}
}
