class LogicalOrOperatorDemo{
	
public static void main(String[] args){	

 int a = 10;
 int b = 20;
boolean result = ((a<b)||(a>(--b)));
System.out.println(result);// true		
System.out.println("b:"+b);//20
}
}