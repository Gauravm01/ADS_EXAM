import java.util.*;
class twStack{
	int[] arr;
	int size;
	int top1,top2;
	
	twStack(int a){
	
	size=a;
	arr=new int[a];
	top1 =-1;
	top2 =size;
	
	}
	
	void push1(int x){
	
	if(top1<top2-1){
	top1++;
	arr[top1]=x;
	}
	else{
	
	System.out.println("Stack Overflow"+"By element :"+x+"\n");
	System.exit(1);
	
	}
	
	}
	
	void push2(int x){
	if(top1<top2-1){
	top2--;
	arr[top2]=x;
	
	}
	else{
	
	System.out.println("Stack overflow");
	System.exit(1);
	
	}
	
	
	}
	
	int pop1(){
	
	if(top1>=0){
	int x=arr[top1];
	top1--;
	return x;
	
	}
	else{
	
	System.out.println("Stack Underflow");
	System.exit(1);
	
	}
	return 0;
	
	}
	
	
	int pop2(){
		
		if(top2<size){
		
		int x= arr[top2];
		top2++;
		return x;
		}
		else{
		
		System.out.println("Stack Uderflow");
		System.exit(1);
		
		}
		return 1;
	}
}


class TwoStack{

	public static void main(String... args){
	
	twStack ts = new twStack(5);
	ts.push1(5);
	ts.push2(10);
	ts.push2(15);
	ts.push1(11);
	ts.push2(7);
	System.out.println("popped element from stack1 is :"+ts.pop1());
	ts.push2(40);
	System.out.print("popped element from stack2 is :"+ts.pop2());
	
	
	}


}