class Flower{
String name;
String colour;
int noOFpetals;
void sheddingfragrance(){
  System.out.println(colour+" "+name+" is sheddingfragrance...!");
 }

   void blooming(){
    System.out.println(colour+" "+name+" is blooming...!");
	}
   
    public static void main(String args[]){

	 Flower rose=new Flower();
	 
	 rose.name="rose";
	 rose.colour="red";
	 rose.noOFpetals=12;
	 
	 rose.blooming();
	 rose.sheddingfragrance();

     Flower hibiscus=new Flower();
	 hibiscus.name="hibiscus";
	 hibiscus.colour="white";
	 hibiscus.noOFpetals=5;
	 
	 hibiscus.blooming();
	 hibiscus.sheddingfragrance();
    }
}