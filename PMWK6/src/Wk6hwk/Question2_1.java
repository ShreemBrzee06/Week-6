package Wk6hwk;

public class Question2_1 {
    /*2.1 Declare two static variables.
      2.2 Declare one static method.
      2.3 Call both static variables into the static method inside the print statement.
      2.4 Declare the Main method.
      2.5 Call the static method into the Main method and run the programme.  */

    static String nam1 = "Ganesha", nam2 = "Kartika"; // 2.1 Declare two static variables.

    public static void main(String[]args){ //2.4 Declare the Main method.
        Devs(); //  2.5 Call the static method into the Main method and run the programme.
    }

    public static void Devs(){ // 2.2 Declare one static method.
        String G = "I love", K = "I love";
        System.out.println(G  +" "+  nam1);
        System.out.println(K  +" "+  nam2);
    }

}
