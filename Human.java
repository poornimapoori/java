class Human{
	
  void speak(unknown person) {
    System.out.println("Hi");
  }

   void speak (Friend person) {
	   
    System.out.println("Hi....bla..bla");
  }
  }
     class unknown{
	 }
	 
	 class Friend {
	 }
	 
	 class HumanTest{
	   public static void main(String args[]){
		 
	 Human Shruthi=new Human();
	 unknown unknown=new unknown();
	 Friend friend= new Friend();
	 Shruthi.speak(unknown);
	 Shruthi.speak(friend);
	 }
	 }
