package chapter_9;

public class Jump {
    
    public static void main(String[] args) {
        
        System.out.println("this is my first know about the jump");

        method();
        
        // this will be printed at the last
        
        System.out.println("this is print at the last");

        // java read the cod line by line 

        // when it finds the method call then it jump the method

        //after the jump it then return back
        


    }

    public static void method(){

        System.out.println("this is printed after the first sout statement");
    }
}
