package cn.sxt.test;

/**
 * ����StringBuilder��StringBuffer�ɱ��ַ�����
 * @author Administrator
 *
 */
public class TestStringBuilder {
	public static void main(String[] args) {
		String  str;
		
		//StringBuilder�̲߳���ȫ��Ч�ʸߣ�һ��ʹ��������StringBuffer�̰߳�ȫ��Ч�ʵ͡�
		StringBuilder  sb = new StringBuilder("abcdefg");
		
		System.out.println(Integer.toHexString(sb.hashCode()));  
		System.out.println(sb);
		
		sb.setCharAt(2, 'M');
		System.out.println(Integer.toHexString(sb.hashCode()));  
		System.out.println(sb);
		
	}
}
