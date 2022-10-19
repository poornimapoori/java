class student1{
String name;
String branch;
String college;
int rollno;
int dob;
void studentstudying(){
System.out.println(name+" "+"is studying in"+" "+branch+" in "+college+" "+"college");
}
public static void main(String args[]){
 student1 poorni = new student1();
 poorni.name="poorni";
 poorni.branch="bsc";
 poorni.college="vnc";
 poorni.rollno=3;
 poorni.dob=1999;
 poorni.studentstudying();


 student1 anita = new student1();
 anita.name="anita";
 anita.branch="bsc";
 anita.college="vnc";
 anita.rollno=6;
 anita.dob=2001;
 anita.studentstudying();
}
}