
public class ZzzStu {
	//属性fields
	int id;
	String sname;
	int age;
	Computer comp;

void study(){//方法
	System.out.println("我在学习!使用的电脑:"+comp.brand );
}

void play(){ //方法
	System.out.println("我在玩!");
	
}


ZzzStu(){  //	构造方法.用于创建这个类的对象.无参数的构造方法可不写,由系统自动生成
	System.out.println("调用了无参的构造方法!");
}

	//java ZzzStu.java  java ZzzStu
public static void main(String[]args){  //程序执行的入口方法,必须有
	ZzzStu stu = new ZzzStu();    //创建一个对象实例
	stu.age = 22;
	stu.id=111;
	stu.sname = "zjgwhcn";

	stu.play();
	Computer c1= new Computer();
	c1.brand = "惠普";
	stu.comp=c1;	
	
	stu.study();//如果将该句移到stu.play();之后会出错
	System.out.println(stu);
	System.out.println(c1);
		}
}

//嵌套类
class Computer{
	String brand;
}
