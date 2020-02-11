import java.util.*;
public class Main {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("First operand:");
		try{
		int fOperand = sc.nextInt();
		System.out.print("Second operand:");
		int sOperand = sc.nextInt();
		System.out.print("Operator(+,-,*,/):");
		char operator = sc.next().charAt(0);
		System.out.println("Result:"+calculator(fOperand,sOperand,operator));		    
		}catch(Exception e)  
        {  
            System.out.println(e);  
        }
	}
	
	public static int calculator(int fOperand, int sOperand,char operator) {
		if(operator=='+'){
		    return fOperand + sOperand;
		}
		else if(operator=='-'){
		    return fOperand - sOperand;
		}
		else if(operator=='*'){
		    return fOperand * sOperand;
		}
		
		else if(operator=='/'){
		    return fOperand / sOperand;
		}
		return 0;
	}


}
