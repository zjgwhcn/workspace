
public class ZzzStu {
	//����fields
	int id;
	String sname;
	int age;
	Computer comp;

void study(){//����
	System.out.println("����ѧϰ!ʹ�õĵ���:"+comp.brand );
}

void play(){ //����
	System.out.println("������!");
	
}


ZzzStu(){  //	���췽��.���ڴ��������Ķ���.�޲����Ĺ��췽���ɲ�д,��ϵͳ�Զ�����
	System.out.println("�������޲εĹ��췽��!");
}

	//java ZzzStu.java  java ZzzStu
public static void main(String[]args){  //����ִ�е���ڷ���,������
	ZzzStu stu = new ZzzStu();    //����һ������ʵ��
	stu.age = 22;
	stu.id=111;
	stu.sname = "zjgwhcn";

	stu.play();
	Computer c1= new Computer();
	c1.brand = "����";
	stu.comp=c1;	
	
	stu.study();//������þ��Ƶ�stu.play();֮������
	System.out.println(stu);
	System.out.println(c1);
		}
}

//Ƕ����
class Computer{
	String brand;
}
