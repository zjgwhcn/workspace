package cn.sxt.test;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        //�������[0,1)֮���double���͵�����
        System.out.println(rand.nextDouble());
        //�������int��������Χ֮�ڵ���������
        System.out.println(rand.nextInt());
        //�������[0,1)֮���float���͵�����
        System.out.println(rand.nextFloat());
        //�������false����true
        System.out.println(rand.nextBoolean());
        //�������[0,10)֮���int���͵�����
        System.out.println(rand.nextInt(10));
        //�������[20,30)֮���int���͵�����
        System.out.println(20 + rand.nextInt(10));
        //�������[20,30)֮���int���͵����ݣ����ַ��������Ϊ���ӣ�
        System.out.print(20 + (int) (rand.nextDouble() * 10));
    }
}