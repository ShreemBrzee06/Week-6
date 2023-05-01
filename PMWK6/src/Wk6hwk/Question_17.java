package Wk6hwk;
/*17.1 Declare your city as instance variables.
 17.2 Declare your country as static variables.
 17.3 Declare one instance method and call static variable in print statement
 17.4 Declare static method and call instance variable in print Statement.
 17.5 Call both user defined methods into main method.
 */

public class Question_17
{ //17.1 Declare your city as instance variables.
// 17.2 Declare your country as static variables.
 String city = "London"; static String country = "United Kingdom";


 public static void main(String[]args)
 {// 17.5 Call both user defined methods into main method.
  Question_17 n1 = new Question_17();
n1.City();
Country();

 }
 public void City()
 { //17.3 Declare one instance method and call static variable in print statement
  System.out.println(country);

 }

 public static void Country()
 {//17.4 Declare static method and call instance variable in print Statement.
  Question_17 n = new Question_17();
  System.out.println(n.city);
 }

}
