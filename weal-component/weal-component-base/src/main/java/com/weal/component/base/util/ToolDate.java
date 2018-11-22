package com.weal.component.base.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 日期工具类
 * @author guogchao
 *
 */
public class ToolDate {
	
	/**yyyyMMddHHmmss*/
	public final static String DATE_FORMAT_0="yyyyMMddHHmmss";
	/**yyyy-MM-dd HH:mm:ss*/
	public final static String DATE_FORMAT_1="yyyy-MM-dd HH:mm:ss";
	/**yyyy-MM-dd HH:mm*/
	public final static String DATE_FORMAT_2="yyyy-MM-dd HH:mm";
	/**yyyy-MM-dd*/
	public final static String DATE_FORMAT_3="yyyy-MM-dd";
	/**yyyy年MM月dd日*/
	public final static String DATE_FORMAT_4="yyyy年MM月dd日";
	/**HH:mm:ss*/
	public final static String DATE_FORMAT_5="HH:mm:ss";
	/**yyyy-MM-dd HH:mm:ss,SSS*/
	public final static String DATE_FORMAT_6="yyyy-MM-dd HH:mm:ss.SSS";
	/**yyyy年MM月dd日 HH时mm分ss秒*/
	public final static String DATE_FORMAT_7="yyyy年MM月dd日 HH时mm分ss秒";
	/**yyyyMMdd*/
	public final static String DATE_FORMAT_8="yyyyMMdd";
	
	
	
	/**
	 * 获取当前日期 yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String getToDay(){
		return getToDay(DATE_FORMAT_1);
	}
	
	/**
	 * 获取当前日  yyyy-MM-dd
	 * @return
	 */
	public static String getToDay3(){
		return getToDay(DATE_FORMAT_3);
	}
	
	/**
	 * 获取当前日 格式化
	 * @return
	 */
	public static String getToDay(String pattern){
		return getFormatDate(new Date(), pattern);
	}
	
	/**
	 * 获取当前日
	 * @return
	 */
	public static Date getToDayDate(){
		return new Date();
	}
	
	/**
	 * 获取当前日 格式化
	 * @return
	 */
	public static Date getToDayDate(String pattern){
		return getFormatDate(getFormatDate(new Date(), pattern), pattern);
	}
	
	
	
	/**
	 * 获取格式字符串日期
	 * @param date
	 * @param pattern yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String getFormatDate(Date date){
		SimpleDateFormat df=new SimpleDateFormat(DATE_FORMAT_1);
		if(date!=null){
			return (df.format(date));
		}
		return null;
	}
	
	/**
	 * 获取格式字符串日期
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String getFormatDate(Date date,String pattern){
		SimpleDateFormat df=new SimpleDateFormat(pattern);
		if(date!=null){
			return (df.format(date));
		}
		return null;
	}
	
	/**
	 * 获取格式字符串日期 
	 * 自动匹配日期格式
	 * @param date
	 * @return
	 */
	public static Date getFormatDate(String date){
		String pattern=ToolDate.DATE_FORMAT_3;
		if(date.trim().length()>=19){
			pattern=ToolDate.DATE_FORMAT_1;
			if(date.trim().length()>19){
				pattern=ToolDate.DATE_FORMAT_6;
			}
		}else if(date.trim().length()==8 && date.contains(":")){
			pattern=ToolDate.DATE_FORMAT_5;
		}else if(date.trim().length()==8){
			pattern=ToolDate.DATE_FORMAT_8;
		}else if(date.trim().length()==14){
			pattern=ToolDate.DATE_FORMAT_0;
		}else if(date.trim().length()==16){
			pattern=ToolDate.DATE_FORMAT_2;
		}
		return getFormatDate(date, pattern);
	}
	
	/**
	 * 如果日期时分秒为00自动转为年月日
	 * @param date
	 * @return
	 */
	public static String formatSubDate(String date){
		date=date.trim();
		if(date.indexOf(".0")!=-1){
			date=date.substring(0, date.length()-2);
		}
		int len=date.length();
		if(len>=19){
		String tmp=date.substring(11, 19);
			if("00:00:00".equals(tmp)){
				if(len>19){
					if(ToolEx.strToInteger(date.substring(20))!=0){
						return date;
					}
				}
				return date.substring(0, 10);
			}
		}else if(len>=14){
		String tmp=date.substring(8, 14);
			if("000000".equals(tmp)){
				if(len>14){
					if(ToolEx.strToInteger(date.substring(14))!=0){
						return date;
					}
				}
				return date.substring(0, 8);
			}
		}
		return date;
	}
	
	/**
	 * 获取格式字符串日期
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static Date getFormatDate(String date,String pattern){
		SimpleDateFormat df=new SimpleDateFormat(pattern);
		if(date!=null){
			try {
				return (df.parse(date));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * 获取格式字符串日期
	 * @param date
	 * @param yyyy-MM-dd 
	 * @return
	 */
	public static String getFormatDate_Str(String date){
		return getFormatDateToStr(date, DATE_FORMAT_3);
	}
	
	/**
	 * 获取格式字符串日期
	 * @param date
	 * @param yyyy-MM-dd 
	 * @return
	 */
	public static Date getFormatDate_Date(String date){
		return getFormatDate(date, DATE_FORMAT_3);
	}
	
	
	/**
	 * 获取格式字符串日期
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String getFormatDateToStr(String date,String pattern){
		return getFormatDate(getFormatDate(date), pattern);
	}
	
	/**
	 * 获取毫秒数
	 */
	public static Long getMs(String date){
		return getFormatDate(date).getTime();
	 }
	
	/**
	 * 获取毫秒数
	 */
	public static Long getMs(Date date){
		return date.getTime();
	 }
 
	
	/** 
     * 获取日期中的某数值。如获取月份 
     * @param date 日期 
     * @param dateType 1:年;2:月;5:日;7:星期;9:(0:上午,1:下午);
     * 10:时(12);11:时(24);12:分;13:秒;14:毫秒
     * @return 数值 
     */  
    public static int getDate(Date date, int dateType) {
        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(date);  
        int tmp=calendar.get(dateType);
        if(dateType==2){
        	tmp=tmp+1;
        }
        else if(dateType==7){
        	tmp=tmp-1;
        	if(tmp==0){
        		tmp=7;
        	}
        }
        return tmp;  
    }
    /** 
     * 获取日期中的某数值。如获取月份 
     * @param date 日期 
     * @param dateType 1:年;2:月;5:日;7:星期;9:(0:上午,1:下午);
     * 10:时(12);11:时(24);12:分;13:秒;14:毫秒
     * @return 数值 
     */  
    public static int getDate(String date, int dateType) {
        return getDate(getFormatDate(date), dateType);  
    }
    
    public static String getWeek1(String date){
    	String week="";
    	int wk=getDate(date, 7);
    	switch (wk) {
		case 7:
			week+="日";
			break;
		case 6:
			week+="六";
			break;
		case 5:
			week+="五";
			break;
		case 4:
			week+="四";
			break;
		case 3:
			week+="三";
			break;
		case 2:
			week+="二";
			break;
		case 1:
			week+="一";
			break;
		default:
			break;
		}
    	return week;
    }
    
    
    public static String getWeek(String date){
    	String week="星期";
    	int wk=getDate(date, 7);
    	switch (wk) {
		case 7:
			week+="日";
			break;
		case 6:
			week+="六";
			break;
		case 5:
			week+="五";
			break;
		case 4:
			week+="四";
			break;
		case 3:
			week+="三";
			break;
		case 2:
			week+="二";
			break;
		case 1:
			week+="一";
			break;
		default:
			break;
		}
    	return week;
    }
      
    public static String getWeekToDate(String week){
    	String today=getToDay3();
    	String weekNew= getWeek(today);
    	if(!ToolEx.equals(week, weekNew)){
    		today=getFormatDate(addDate(today, 5, 1),DATE_FORMAT_3);
    		weekNew= getWeek(today);
    		if(!ToolEx.equals(week, weekNew)){
    			today=getFormatDate(addDate(today, 5, -2),DATE_FORMAT_3);
    			weekNew= getWeek(today);
        		if(!ToolEx.equals(week, weekNew)){
        			today=null;
        		}
    		}
    	}
    	return today;
    }
    /** 
     * 增加日期中某类型的某数值。如增加日期 
     * @param date 日期 
     * @param dateType 1:年;2:月;5:日;7:星期;9:(0:上午,1:下午);
     * 10:时(12);11:时(24);12:分;13:秒;14:毫秒
     * @param amount 数值 
     * @return 计算后日期 
     */  
    public static Date addDate(Date date, int dateType, int amount) {
        Date myDate = null;  
        if (date != null) {
            Calendar calendar = Calendar.getInstance();  
            calendar.setTime(date);  
            calendar.add(dateType, amount);  
            myDate = calendar.getTime();  
        }  
        return myDate;  
    }
    
    
    /** 
     * 增加日期中某类型的某数值。如增加日期 
     * @param date 日期 
     * @param dateType 1:年;2:月;5:日;7:星期;9:(0:上午,1:下午);
     * 10:时(12);11:时(24);12:分;13:秒;14:毫秒
     * @param amount 数值 
     * @return 计算后日期 
     */  
    public static Date addDate(String date, int dateType, int amount) {
        return addDate(getFormatDate(date), dateType, amount);  
    }
    
    /**
     * 日期相减 date1-date2
     * 得到天数
     * @param date1
     * @param date2
     * @return
     */
	public static long subDate(Object date1,Object date2){
		String d1="";
		String d2="";
		if(date1 instanceof String){
			d1=getFormatDateToStr(date1.toString(),DATE_FORMAT_3);
		}else{
			d1=getFormatDate((Date)date1, DATE_FORMAT_3);
		}
		if(date2 instanceof String){
			d2=getFormatDateToStr(date2.toString(),DATE_FORMAT_3);
		}else{
			d2=getFormatDate((Date)date2, DATE_FORMAT_3);
		}
		long day=0;
		Long dt1 =getFormatDate(d1,DATE_FORMAT_3).getTime();
        Long dt2 =getFormatDate(d2,DATE_FORMAT_3).getTime();
        day=(dt1-dt2)/(24*60*60*1000); 
        return day;
	}
	
	
	/**
	 * 获取当月的 天数
	 * */
	public static int getCurrentMonthDay() {
		
		Calendar a = Calendar.getInstance();
		a.set(Calendar.DATE, 1);
		a.roll(Calendar.DATE, -1);
		int maxDate = a.get(Calendar.DATE);
		return maxDate;
	}
	/**
	 * 添加当月的 天数
	 * */
	public static String addCurrentMonthDay(int day) {
		Calendar a = Calendar.getInstance();
		a.set(Calendar.DAY_OF_MONTH, day);
		a.set(Calendar.HOUR_OF_DAY, 0);
		SimpleDateFormat df=new SimpleDateFormat("yyyyMMdd");
		return (df.format(a.getTime()));
	}
	
	

	
	/**
	 * 日期比较  天
	 * DATE1>DATE2  1
	 * DATE1<DATE2  -1
	 * DATE1=DATE1  0
	 * @param DATE1
	 * @param DATE2
	 * @return
	 */
	 public static int compareDate(String DATE1, String DATE2) {
        try {
            Long tmp=subDate(DATE1, DATE2);
            if (tmp>0) {
                return 1;
            } else if (tmp<0) {
                return -1;
            } else {
                return 0;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;
    }
	 /**
	 * 与当前日期比较  天
	 * @param DATE
	 * @return
	 */
	 public static int compareDate(String DATE) {
		return compareDate(DATE, getToDay(DATE_FORMAT_3));
	 }
	 
	 /**
	  * 时间相减
	  * @param d1  结束日期
	  * @param d2 开始日期
	  * @return 秒
	  */
	 public static Long calLastedTime(String d1,String d2){
		 Long dt1 =getFormatDate(d1).getTime();
		 Long dt2 =getFormatDate(d2).getTime();
		 return ((dt1 - dt2) / 1000);
	 }
	 
	 /**
	  * 与当前时间相减
	  * @param d1  结束日期
	  * @return 秒
	  */
	 public static Long calLastedTimeToS(String d1){
		return calLastedTime(d1,getToDay());
	 }

	 
	 /**
	  * 与当前日期相减  
	  * @param d1  结束日期 天
	  * @return 秒
	  */
	 /*public static Long calLastedTimeToDay(String d1){
		 Calendar calendar = new GregorianCalendar(); 
	     calendar.setTime(getFormatDate(d1, DATE_FORMAT_3)); 
	     calendar.add(calendar.DATE,1);
	     Long dt1 =calendar.getTime().getTime();
		 Long dt2 = getToDayDate(DATE_FORMAT_1).getTime();
		 return ((dt1 - dt2) / 1000);
	 }*/
	
	/**
	 * 返回年+季度
	 */
	 public static String getYearToQuarter(Object date,String mark){
		 if(!ToolEx.isNotEmpty(date)){
			 return mark+"";
		 }
		 int year=getDate(ToolEx.toString(date), 1);
		 int m=getDate(ToolEx.toString(date), 2);
		 String quarter="1";
		 if(m==1 || m==2 || m==3){
			 quarter="1";
		 }else if(m==4 || m==5 || m==6){
			 quarter="2";
		 }else if(m==7 || m==8 || m==9){
			 quarter="3";
		 }else if(m==10 || m==11 || m==12){
			 quarter="4";
		 }
		 return mark+year+""+quarter;
	 }
	 
	 public static int getYearToQuarter(){
		 int year=getDate(getToDay3(), 1);
		 year=(year-2015)*4;if(year<0){year=0;}
		 int m=getDate(getToDay3(), 2);
		 int quarter=1;
		 if(m==1 || m==2 || m==3){
			 quarter=1;
		 }else if(m==4 || m==5 || m==6){
			 quarter=2;
		 }else if(m==7 || m==8 || m==9){
			 quarter=3;
		 }else if(m==10 || m==11 || m==12){
			 quarter=4;
		 }
		 return year+quarter;
	 }
	 
	 /**1:年;2:月;5:日;7:星期;9:(0:上午,1:下午);10:时(12);11:时(24);12:分;13:秒;14:毫秒*/
	 public static void main(String[] args) {
		 
		 Calendar a = Calendar.getInstance();
		a.set(Calendar.DAY_OF_MONTH, 11);
		a.set(Calendar.HOUR_OF_DAY, 19);
		SimpleDateFormat df=new SimpleDateFormat("yyyyMMddHHmmss");
		
		
		Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        long m=((calendar.getTimeInMillis() - (new Date().getTime())) / 1000);
        System.out.println(m);
	}
	
}
