package cn.sxt.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ʹ��try-catch�����쳣
 * @author Administrator
 *
 */
public class Test02 {
	public static void main(String[] args) {
		readMyFile();
	}
	
	public  static  void  readMyFile(){
		FileReader  reader = null;
		try{
			reader = new FileReader("d:/b.txt");
			System.out.println("step1");
			char  c1 = (char)reader.read();
			System.out.println(c1);
			
		}catch(FileNotFoundException e){		//�����쳣�ڸ����쳣ǰ��
			System.out.println("step2");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			System.out.println("step3");
			try {
				if(reader!=null){
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
