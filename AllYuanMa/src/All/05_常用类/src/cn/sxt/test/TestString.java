package cn.sxt.test;

public class TestString {
	public static void main(String[] args) {
//		String   str = "aaabbbb";
//		String   str2 = str.substring(2, 5);
//		
//		System.out.println(str);
//		System.out.println(str2);
		
		
		
		//�����������Ż�,ֱ���ڱ����ʱ���ַ�������ƴ��
        String str1 = "hello" + " java";//�൱��str1 = "hello java";
        String str2 = "hello java";
        System.out.println(str1 == str2);//true
        String str3 = "hello";
        String str4 = " java";
        //�����ʱ��֪�������д洢����ʲô,����û�취�ڱ����ʱ���Ż�
        String str5 = str3 + str4;
        System.out.println(str2 == str5);//false
		
        System.out.println(str2.equals(str5));  //���ַ����Ƚϵ�ʱ��ʹ��equals��Ҫʹ��==
        
        
	}
}
