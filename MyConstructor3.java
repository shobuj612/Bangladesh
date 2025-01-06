public class MyConstructor3 {

      // here t is a variable that we can use everywhere


    int t;

     void mySum(int a,int b){
        //sum is local variable .this is can be used by object
        // 
        
        // 
        int sum=a+b;

        System.out.println("this is sum from the mySum method"+" "+sum);
        
     }

     MyConstructor3(int a , int b){

        india();

        mySum(a, b);

        t=a+b;

        int x=Sum(a, b);

        System.out.println("this is from calling constructor"+" "+x);

        int y=hiSum(a, b);

        System.out.println("this is static that is calling from  constructor"+" "+y);
     }


     public int Sum(int a,int b){

        return a*b;
     }


     public static int hiSum(int a,int b){
        return a+b;
     }

     public void india(){

        int w=20;
        int u=50;

        int v=w+u;

        System.out.println("this is called in the consturctor"+" "+v);
     }
    
    public static void main(String[] args) {
        
          MyConstructor3 myConstructor3=new MyConstructor3(25, 36);

          System.out.println("this is by object"+" "+myConstructor3.t);

          System.out.println("this is called without object"+" "+hiSum(25, 90));

          System.out.println("this is called by object"+" "+myConstructor3.Sum(60, 70));

          
    }
}
