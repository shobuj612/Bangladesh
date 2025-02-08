package chapter_9;

public class Third_Static {
    
    public static void main(String[] args) {

       
         // this is the first object

        Third_Static1 th=new Third_Static1();

        System.out.println("this is variable i want to print"+" "+th.a);
        System.out.println("this is variable i want to print"+" "+th.b);


               // static variable can be print by class name using dot(.)

       System.out.println("why i cannot static variable c"+" "+Third_Static1.c); 
        
            
       // this is the second object

       Third_Static1 th1=new Third_Static1(100);

       System.out.println("this is for b"+" "+th1.b);

       System.out.println("this is for c to change"+" "+Third_Static1.c);

    }
}

class Third_Static1{

     // this is the instance variable
     
     int a=10;

     float b=12.0f;

     static int c=20;

     Third_Static1(){

        // this is default constructor which has no parameter

        a=50;
        b=201.23f;
     }

     Third_Static1(int iqram){


         // here iiqram is local variable

         // c is global

        c=iqram;

        b++;
     }

     Third_Static1(double faruk){


         a=(int)faruk; // this is casting

         c++;


}

   public void method(){

      System.out.println("show  the reslut"+" "+a+c);
   }

   public void x(){


    System.out.println("show the increament of them"+" "+b+c);
   }
}