package cn.sxt.oop;

/**
 * �����ַ�����Ļ����÷�
 * @author Administrator
 *
 */
public class TestString {
	public static void main(String[] args) {
		String  str = "abc";
		String str2 = new String("def");
		String str3 = "abc"+"defgh";
		String str4 = "18"+19;			//���Ǽӷ������ַ������ӷ���
		System.out.println(str4);
		
		System.out.println("##############");
		String  str10 = "gaoqi";
		String  str11 = "gaoqi";
		String  str12 = new String("gaoqi");
		
		
		System.out.println(str10 == str11);
		System.out.println(str12 == str11);		//str11��str12����ͬһ������
		
		
		//ͨ���Ƚ��ַ���ʱ��ʹ��equals
		System.out.println(str12.equals(str11));
		
		
		
		
	}
}
