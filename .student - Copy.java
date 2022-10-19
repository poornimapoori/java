class student{
String name;
String branch;
String college;
int rollno;
int dob;
void studentstudying(){
System.out.println(name+" "+branch+" "+college+" "+rollno+" "+dob+ "is studying in this college");
}
public static void main(String args[]){
student poorni=new student();
poorni.name="poorni";
poorni.branch="bsc";
poorni.college="vnc";
poorni.rollno=3;
poorni.dob=1999;
poorni.studentstudying();

student anita= new student();
anita.name="anita"
anita.branch="bcom"
anita.college="abvp"
anita.rollno=6;
anita.dob=2001;
anita.studentstudying();
}
}

