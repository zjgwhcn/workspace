package cn.sxt.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * �����������ʹ��
 * @author Administrator
 *
 */
public class TestCanlendar {
	public static void main(String[] args) {
		//������ڵ����Ԫ��
		Calendar calendar = new GregorianCalendar(2999,10,9,22,10,50);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int  day = calendar.get(Calendar.DATE);		//Ҳ����ʹ�ã�DAY_OF_MONTH��
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);	//���ڼ��� 1-7.  1�������գ�2����һ��������7���������� 
		System.out.println(year) ;
		System.out.println(month) ;	//0-11��ʾ��Ӧ���·ݡ�0��1�£�1����2��.....11��12�¡�
		System.out.println(weekday);
		System.out.println(day);
		
		//�������ڵ����Ԫ��
		Calendar c2 = new GregorianCalendar();
		c2.set(Calendar.YEAR, 8012);
		
		System.out.println(c2);
		
		//���ڵļ���
		Calendar c3 = new GregorianCalendar();
		c3.add(Calendar.YEAR, -100);
		System.out.println(c3) ;
		
		//���ڶ����ʱ������ת��
		Date  d4 =  c3.getTime();
		Calendar c4 = new GregorianCalendar();
		c4.setTime(new Date());
		
		printCalendar(c4); 
	}
	
	
	public static  void  printCalendar(Calendar  c){
		//��ӡ��1918��10��10�� 11:23:45 ����
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;   //0-11
		int  date = c.get(Calendar.DAY_OF_MONTH);
		int  dayweek  = c.get(Calendar.DAY_OF_WEEK)-1;    //1-7.1���գ�2��1,3��2....
		String dayweek2 = dayweek==0?"��":dayweek+"";
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println(year+"��"+month+"��"+date+"�� "+hour+"ʱ"+minute+"��"+second+"��"
				+"   ��"+dayweek2);
		
	}
	
	
	
	
}
