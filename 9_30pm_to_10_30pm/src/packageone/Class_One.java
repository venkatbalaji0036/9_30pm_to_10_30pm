package packageone;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Class_One {
	
	public static void main(String[] args) {
		Class_One obj = new Class_One();
		System.out.println("This is in main method");
		obj.MethodOne();
		
		int Value = 100;
		char char_value='c';
		boolean flag = false;
		
		
		//Unary Operator
		//++ or --
		
		int  i = 10;
		System.out.println(i++); //10
		System.out.println(i); // 11
		System.out.println(i--); //11
		System.out.println(i); // 10
		
		
		System.out.println(--i);  //9
		System.out.println(i); //9
		System.out.println(++i); //10
		System.out.println(i); //10
		
		System.out.println("==============================================");
		//Arithmetic Operator
		
		int j=20;
		int sum = i+j;
		System.out.println(sum);
		System.out.println(i-j);
		System.out.println(i*j);
		
		System.out.println(j/i);  //Quotient
		System.out.println(j%i);  //Reminder
		
		System.out.println("=======================================");
		
		//Relational Operator
		
		/*
		 *      <
		 *      >
		 *      <=
		 *      >=
		 *      ==
		 *      !=
		 * 
		 */
		int k=10;
		System.out.println(i<j);
		System.out.println(i==k);
		System.out.println(j==k);
		System.out.println(i<=k);
		
		System.out.println("=======================================");
		
		//Logical Operator
		
		//   AND - &&
		//   OR - ||
		
		if(i<j||i==j){
			System.out.println("i is less than j");
		}else{
			System.out.println("i is not less than j");
		}
		
		System.out.println("================================================");
		
		int a=10;
		switch(a){
			case 20:
				System.out.println("a is equal to j");
				break;
			case 10: 
				System.out.println("a is equal to i and k");
				break;
			default:
				System.out.println("a is not equal to i or j or k");
		}
		
		System.out.println("================================================");
		
		//for loop
		
		for(int x=i;x<=j;x++){
			System.out.println(x);
		}
		
		System.out.println("===========================================");
		
		
		int x=i;
		//int Counter=0;
		while(x<=j){
			System.out.println(x);
			x=x+1;
			if(x==15){
				x=x+1;
			}else{
				continue;
			}
		}
		
		System.out.println("==================================");
		
		int y=i;
		do{
			System.out.println(y);
			y=y+1;
		}while(y<=j);
		
		
		/*
		 *  Fibonacci series
		 *  I J
		  0 1 1 2 3 5 8........
		  
		  int i=0;
		  int j=1;
		  int temp=0;
		  
		  int temp=i+j;
		  
		  temp=j;
		  j=i;
		  
 Prime number
 int 63;
 13/2=6.5 = rounding of this number to 7 = n
 for(int i=1;i<=7;i++){
 13/1
 13/2
 13/3
 13/4
 13/5
 13/6
 13/7
 
 if 13%(1-7) = 0 more than 2 times then it is not prime number
int counter=0;
counter=counter+1
if(counter>=2){
break;
syso(This is not a prime number)
}else{
coninue;
}


 Factorial
 10!
 
 5! = 5*4*3*2*1
 
 factorial = 10*9*8*7*6*5*4*3*2*1
 
 int 10;
 int factorial = 1;
 for(int i=10;i>=1;i--){
 	factorial = factorial*i;
 }
 

 Armstrong number
 
 1634
 1634 = 1^4+6^4+3^4+4^4 = 1634
 
 10)1634(163
    1630
   ------
       4
   ------
   
   10)163(16
      160
     -----
        3
     -----
     
     10)16(1
        10
      ------
         6
      ------
     
     
     
     
     
     
   
   
 
 

		 * 
		 * 
		 */
		
	System.out.println("======================================");
	
	int[] Array1 = new int[4];
	Array1[0] = 100;
	//Array1[1] = 200;
	Array1[2] = 300;
	Array1[3] = 400;
	//Array1[4] = 500;
	
	System.out.println(Array1.length);
	
	for(int m=0;m<Array1.length;m++){
		System.out.println(Array1[m]);
	}
	
	System.out.println(Array1[1]);
		
	System.out.println("======================================");
	
	LocalDate Date = LocalDate.now();
	System.out.println(Date);
	
	LocalTime Time = LocalTime.now();
	System.out.println(Time);
	
	LocalDateTime Date_Time = LocalDateTime.now();
	System.out.println(Date_Time);
	
	
	ZoneId zid = ZoneId.of("America/Los_Angeles");
	LocalDateTime Date_Time1 = LocalDateTime.now(zid);
	
	System.out.println(Date_Time1);
		
	System.out.println("=======================================");
	
	String String_Var = "     This is a String     ";
	String Str2 = "This is second String";
	
	System.out.println(Str2.concat("Connected String"));
	System.out.println(Str2.charAt(16));
	System.out.println(Str2.compareTo(String_Var));
	System.out.println(Str2.contains("Second"));
	System.out.println(Str2.indexOf('S'));
	System.out.println(Str2.equals(String_Var));
	System.out.println(Str2.length());
	System.out.println(Str2.replace('s', 'Z'));
	System.out.println(Str2.substring(4, 19));
	System.out.println(String_Var);
	System.out.println(String_Var.trim());
	System.out.println(Str2.split(" "));
	//System.out.println(Str2.);
	
	
	//This order is created succesfully. Your order id is: AMZ0496774 
	
	
	String value[] = Str2.split(" ");
	
	for(int n=0;n<value.length;n++){
		System.out.println(value[n]);
	}
	
	System.out.println("=====================================");
	
	/*
	 * 
	 * String str1 = "This is a String";
	 * String str2 = "";
	 * for(int i=str.length;i<;i++){
	 * chat value = str.charAt(i);
	 * str = Str+value;
	 * }
	 * syso(str2);
	 * 
	 * 
	 */
	
	
	// Integer.parseInt(String value)

	 //Integer.toString( Integer value )

	
	int xy = 10;
	String z = "20";
	
	System.out.println(xy+Integer.parseInt(z));
	System.out.println(Integer.toString(xy)+z);
	
	System.out.println("=====================================");
	
	ArrayList<Integer> AL = new ArrayList<Integer>();
	
	AL.add(10);
	AL.add(20);
	AL.add(30);
	AL.add(40);
	
	System.out.println(AL);
	System.out.println(AL.size());
	
	AL.add(4, 90);
	
	AL.remove(1);
	
	System.out.println(AL);
	System.out.println(AL.size());
	
	LinkedList<Integer> LL = new LinkedList<Integer>();
	
	LL.add(100);
	LL.addAll(AL);
	LL.addFirst(1000);
	LL.addLast(2000);
	LL.contains(2000);
	
	System.out.println(LL);
	
	System.out.println(LL.contains(100));
	System.out.println(LL.indexOf(2000));
	System.out.println(LL.remove(3));
	System.out.println("Removed LL is: "+LL);
	System.out.println(LL.size());
	System.out.println(LL.get(3));
	System.out.println(LL.set(3, 5000));
	System.out.println(LL);
	
	System.out.println("======================================================");
	
	HashSet<String> HS = new HashSet<String>();
	HS.add("StringOne");
	HS.add("StringTwo");
	HS.add("StringThree");
	HS.add("StringFour");
	HS.add("StringFive");
	HS.add("StringThree");

	
	System.out.println(HS);
	System.out.println(HS.size());
	System.out.println(HS.remove("StringEight"));
	System.out.println(HS);
	
	LinkedHashSet<Integer> LHS = new LinkedHashSet<Integer>();
	LHS.add(5000);
	LHS.addAll(LL);
	
	System.out.println(LHS);
	System.out.println(LHS.size());
	
	System.out.println("==============================================");
	
	HashMap<Integer, String> HM = new HashMap<Integer, String>();
	HM.put(1234, "Ramesh");
	HM.put(1235, "Suresh");
	HM.put(1236, "Ganesh");
	
	System.out.println(HM);
	
	LinkedHashMap<Integer, String> LHM = new LinkedHashMap<Integer, String>();
	LHM.put(100, "String100");
	LHM.putAll(HM);
	System.out.println(LHM);
	System.out.println(LHM.containsKey(100));
	System.out.println(LHM.containsValue("String100"));
	System.out.println(LHM.get(1236));
	System.out.println(LHM.remove(1234));
	System.out.println(LHM);
	System.out.println(LHM.size());
	//System.out.println(LHM.);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
		
		//if in java
		
		//3 types of if's
		
		if(condition){
			//code to be written here
		}
		
		if(condition){
			//code to be written here 
		}else{
			//code to be written here
		}
		
		if(condition){
			
		}else if(condition){
			
		}else if(condition){
			
		}else{
			
		}
		*/
		
		
		
		
		
		
		
		
		
		
	}
		
	public void MethodOne(){
		System.out.println("This is print statement in metodOne");
	}
	
	/*
		Written By: Satish
		Sprint: 13.5
		Testcase name: This is to verify the Sin in button
		Testcase number: 24587 
	*/
	public void Verify_Signin_Button(){
		
	}
	
	public void MethodThree(){
		
	}
	
	public void MethodFour(){
		
	}
}
