package cn.sxt.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * ����ʱ�������ַ���֮��Ļ���ת��
 * DateFormat�������SimpleDateFormatʵ�����ʹ��
 * @author ���
 *
 */
public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		
		//��ʱ������ա���ʽ�ַ���ָ���ĸ�ʽ��ת����Ӧ���ַ���
		DateFormat  df  = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
		String str  =  df.format(new Date(4000000)); 
		System.out.println(str);
		
		//���ַ������ա���ʽ�ַ���ָ���ĸ�ʽ��ת����Ӧ��ʱ�����
		DateFormat  df2 = new SimpleDateFormat("yyyy��MM��dd�� hhʱmm��ss��");
		
		Date  date = df2.parse("1983��5��10�� 10ʱ45��59��");
		System.out.println(date);
		
		//���������ĸ�ʽ�ַ������磺����D����ñ�ʱ�������������ݵĵڼ��졣
		DateFormat  df3  = new SimpleDateFormat("D");
		String str3  =  df3.format(new Date()); 
		System.out.println(str3);
		
		
	}
}
