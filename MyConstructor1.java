public class MyConstructor1 {
    

         int x=15;
         int y=50;
         int sum;
         int mySum;

         // constructor 1 means the default constructor

         MyConstructor1(){

            x=10;
            y=40;

         }

          
         // this is second constructor

         MyConstructor1(int p,int q){


            // sum varible can be  prin from here or by calling object from main method
            // sum is a globle variable. 

            // sum can be used globally and locally


            sum=p+q;

            System.out.println("sum is global.you can print this from here or from main method"+" "+sum);
            
            // my variable  cannot print outside this constructor;this is local variable 
            int my=p+q;

            // my variable can be print from here

            System.out.println("this is my varible to print from second constructor:"+" "+my);


         }

           
         // this is third constructor

         MyConstructor1(int a, int b,int c){


            mySum=a+b;

            int hiSum=a+b+c;

            System.out.println("this is three sum of the three variable:"+" "+hiSum);
         }


       // this is fourth constructor

       MyConstructor1(double a, double b){

        double myDouble=a+b;

        

        System.out.println("this is double that is from the foruth constructor;"+" "+myDouble);

       }

       // this is fifth constructor

       MyConstructor1(float a, float b){


        float myFloat=a+b;

        System.out.println("this is myFloat that is from fifth constructor:"+" "+myFloat);


       }



    public static void main(String[] args) {

        // this is first object

        MyConstructor1 con1=new MyConstructor1();


        System.out.println("this is first object "+" "+con1.x);

        System.out.println("this is first object "+" "+con1.y);


        // this is my second object

        MyConstructor1 con2=new MyConstructor1(25,36);

        System.out.println("thi is the second object "+" "+con2.sum);




        // this is third object


        MyConstructor1 con3=new MyConstructor1(10,20,30);

        System.out.println("this is third object "+" "+con3.mySum);

        // this is foruth constructor
        MyConstructor1 con4=new MyConstructor1(25.14d,36.125d);

         System.out.println("this is fourth object "+" "+con4.x);

         System.out.println("this is fourth object "+" "+con4.y);


        // this is fifth constructor 
        MyConstructor1 con5=new MyConstructor1(78.11f,96.154f);

        System.out.println("this is fifth object"+" "+con5.x);
        
        System.out.println("this is fifth object"+" "+con5.y);
       
        
    }
}
