package cn.sxt.test;

/**
 * ����ö��
 * @author Administrator
 *
 */
public class TestEnum {
	public static void main(String[] args) {
		System.out.println(Season.SPRING);
		
		Season a = Season.AUTUMN;
		
		switch(a){
		case SPRING:
			System.out.println("�������ˣ����ֵļ���");
			break;
		case SUMMER:
			System.out.println("�������ˣ���Ӿ�ļ���");
			break;
		case AUTUMN:
			System.out.println("�������ˣ��ջ�ļ���");
			break;
		case WINTER:
			System.out.println("�������ˣ����ߵļ���");
			break;
			
		}
		
		
	}
}


enum  Season{
	SPRING, SUMMER,AUTUMN,WINTER
}

enum Week {
	����һ,���ڶ�,������,������,������,������,������
}
