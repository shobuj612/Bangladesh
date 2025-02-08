package chapter_9;

public class Second_Static {
    
    public static void main(String[] args) {
            
         Second_Static1 se=new Second_Static1();  
         
         // the new keyword create the object of the class Second_Static1 by caliing the constructor Second_Static1() . then it increase the value of the parameter
         // iqram =11

                        se.method(); // first it print iqram=11

         Second_Static1 se1=new Second_Static1(); // iqram =12

                      se1.method();// second it print iqram=12

         Second_Static1 se2=new Second_Static1(); // iqram =13
                     
                         se2.method();// third  it print iqram=13

         // this iqram=12 is the final value

         // compiler start from here

         // it increase the constructor valeu one by one

         // finally here print iqram=13

                 se.method();// finally here print iqram=13

                 se2.method();// finally here print iqram=13

                 se2.method();// finally here print iqram=13




        

         

        

        
        

    }
}

// this is another class

class Second_Static1{
        

    // this is local variable

    static int iqram=10;


      Second_Static1(){

       // this is constructor

       // constructor is used to initialised the value of the variable


        iqram++; //that means iqram=iqram+1;



     }

     public void method(){


        System.out.println("show the count of the iqram"+" "+iqram);
     }
}
