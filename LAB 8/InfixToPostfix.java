import java.util.Scanner;
import java.util.Stack;
public class InfixToPostfix{
	int top = 1;
	char polish = ' ';
	int rank = 0;
	char temp;
	Stack<Character> s = new Stack<>();
	public void Postfix(String str){
      s[top] = '(';
      for(int i=0;i<str.length();i++){
      	char next = str.charAt(i);
      	while(next != ' '){
      		if(top < 1){
      			System.out.println("Invalid String");
      			return;
      		}
      		else{
      			while(SPF(s[top]) > IPF(next)){
                    temp = pop(top);
                    polish = polish + temp;
                    rank = rank + rank(temp);
                    if(rank < 1){
                    	System.out.println("Invalid String");
                    }
      			}
      		}
      		if(SPF(s[top]) != IPF(next)){
      			push(next);
      		}
      		else{
      			pop(top);
      		}
      	}
      	if(top != 0 && rank!= 1){
      		System.out.println("Invalid String");
      	}
      	else{
      		System.out.println("Valid String");
      	}
	}
	public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter String:");
     String str = sc.next();
     InfixToPostfix obj = new InfixToPostfix();
     obj.Postfix(str);
	}
}