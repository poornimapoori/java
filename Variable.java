class VariableTest{
int a;
static int b;
public static void main(String args[]){
int c;
b=10;
System.out.print("b: "=b);
VariableTest test=New VariableTest();
test.a=10;
System.out.println(test.a);
 System.out.println("test.b: "+test.b);//10
 test.b=30
  System.out.println("test.b: "+test.b);//30
variableTest test1 =New VariableTest();
 test1.a=20;
  test1.b=50;
 System.out.println(test1.a); 
 System.out.println("test1.b: "+test1.b);//50
System.out.println("test.b: "+test.b);//50 
}
}