
import java.util.Stack; 
import java.util.Scanner;  
import java.util.EmptyStackException;  

public class Test { 
	
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stk = new Stack<>();  
		System.out.print("How many element's do u want to add to the stack ? "); 
		int n = sc.nextInt(); 
		for(int i=0;i<n;i++) { 
			System.out.print("Add element "+(int)(i+1)+": ");
			int el = sc.nextInt(); 
			stk.push(el); 
		}	
		System.out.print("Element's of stack : "+stk+"\nPoping element's from the stack."); 
		try { 
			while(!stk.empty()){ 
				System.out.print("\nActual stack : " + stk+ "\nElement to be deleted next round : "+stk.peek());
				stk.pop();
			}
		}catch(EmptyStackException e) {  
			System.out.print("Stack is empty.");
		}
     		sc.close();
			System.out.print("\nActual stack : " + stk);

	}

}
