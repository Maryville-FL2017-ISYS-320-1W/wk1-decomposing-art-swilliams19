/*
  	ISYS 320
  	Name(s):Stephanie Williams
  	Date: 11/14/2017
*/

// 1. Your predicted output 
 	/*"This is message1."*/
 	/*"This is message2."*/
 		

public class Tricky {
 		public static void main(String[]args) {
 		message1();
 		message2();
 		System.out.println("Done with main.");
 		
}
 		public static void message1() {
 			System.out.println("This is message1.");
}
 		public static void message2() {
 			System.out.println("This is message2.");
 			message1();
 			System.out.println("Done with message 2.");
}

 	}
// 3. Were you correct? Explain any differences
       /*No, I was not correct.  I only predicted 2 lines of output when there are 5.*/
	   /*So I failed to predict the last 3 lines of output.*/
	   /*And even if I had predicted the other lines, I would not have put them in that order.*/
 

