package cn.sxt.oop;

/**
 * ���������������ڣ�Ϊ�����ṩͳһ�ġ��淶��ģ�塣�������ʵ����صĳ��󷽷��� 
 * @author Administrator
 *
 */
public abstract  class Animal {
	
	//��һ��û��ʵ�֡��ڶ����������ʵ�֡�
	abstract  public  void   shout();
	
	public void run(){
		System.out.println("�ܰ��ܣ�");
	}
	
	public static void main(String[] args) {
		Animal   a = new Dog();
		
//		Integer  i;
		
	}
	
}


class  Dog extends   Animal {

	@Override
	public void shout() {
		System.out.println("��������");
	}
	
}