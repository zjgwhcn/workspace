package One01;

import java.util.Stack;

public class Mystack1 {
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;

	public Mystack1(){
		this.stackData= new Stack<Integer>();
		this.stackMin= new Stack<Integer>();
	}
	
	public int push(int newNum){
		if (this.stackMin.isEmpty()){
			this.stackMin.push(newNum);
		}else if (newNum<=this.getmin()){
			this.stackMin.push(newNum);	
										}
		this.stackData.push(newNum);
	}
	
	public int pop(){
		if (this.stackMin.isEmpty()){
			throw new RuntimeException("Your stack isempty.");
									}
		int value=this.stackData.pop();
		if (value == this.getmin()){
			this.stackMin.pop();
									}
		return value;
					}
	
	public int getmin(){
		if (this.stackMin.isEmpty()){
			throw new RuntimeException("Your stack is empty.");
					}
		return this.stackMin.peek();
	}

public static void main (String[] args){
	int newNum=5;
	
	
	Mystack1 Mystack = new Mystack1();
	int Num = Mystack.push(newNum);
	//if (Num<10)
		//Num++;
		//else return;
			
	System.out.print("The push is "+Num);


}

}
