package cn.sxt.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * ����File��Ļ����÷�
 * @author Administrator
 *
 */
public class TestFile {
	
	public static void main(String[] args) throws IOException {
		
//		File  f = new File("d:/a.txt");
		File  f = new File("d:\\a.txt");
		System.out.println(f); 
		f.renameTo(new File("d:/bb.txt"));
		
		System.out.println(System.getProperty("user.dir"));
		
		File  f2 = new File("gg.txt");		
//		f2.createNewFile();
		
		System.out.println("File�Ƿ���ڣ�"+f2.exists());
        System.out.println("File�Ƿ���Ŀ¼��"+f2.isDirectory());
        System.out.println("File�Ƿ����ļ���"+f2.isFile());
        System.out.println("File����޸�ʱ�䣺"+new Date(f2.lastModified()));
        System.out.println("File�Ĵ�С��"+f2.length());
        System.out.println("File���ļ�����"+f2.getName());
        System.out.println("File��Ŀ¼·����"+f2.getAbsolutePath());
		
        
        File f3 = new File("d:/��Ӱ/����/��½");
//        boolean flag = f3.mkdir(); //Ŀ¼�ṹ����һ�������ڣ��򲻻ᴴ������Ŀ¼��
        boolean flag = f3.mkdirs();//Ŀ¼�ṹ����һ��������Ҳû��ϵ����������Ŀ¼��
        System.out.println(flag);//����ʧ��
        
	}

}
