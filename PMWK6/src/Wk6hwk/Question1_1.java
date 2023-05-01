package Wk6hwk;
/*1.1 Declare two instance variables.
      1.2 Declare one instance method.
      1.3 Call both instance variables into the instance method inside the print statement.
      1.4 Declare the Main method.
      1.5 Call the above instance method into the Main method and run the programme.
       */
public class Question1_1 {

    int a = 5; String c = "Krishna"; // 1.1 Declare two instance variable
    public static void main(String[]args){ // 1.5 calling instance method into Main method
        Question1_1 v = new Question1_1();
        Instance_var();
        v.OneIm();

    }

    public static void Instance_var(){
        int b = 1; String d = "I love ";
        Question1_1 e = new Question1_1();

        System.out.println(e.a+b);
        System.out.println(d+ e.c);

    }

    public void OneIm(){ // 1.2 Declare one Instance Method
        String g = "Jai Shree ";
        int f = 5;
        System.out.println(a*f);        // 1.3 Call both instance variables into
                                        // the instance method inside the print statement.
        System.out.println(g + c);
    }
}
