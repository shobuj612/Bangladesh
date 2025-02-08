public class MyConstructor {
    
          // set the data field in the class

          int x;
          int y=10;

          public int myMethod(int hi){

            return y+hi;
          }


          // the constructor cannot contain any method 

          // the constructor can call a method

          // the constructor initialize or override any variable or attribute 

          MyConstructor(int p,int q){

              

            x=p;

          int result=  mySum( p, q);

          // if i want to print something from constructor  i dont need to use object

          System.out.println("this is method that is called from the constructor"+" "+result);



          }


          public static int mySum(int p,int q){

            return p*q;
          }

          
    // 
    public static void main(String[] args) {

      // myConstructor ,this is object that can hold variable and method from class

      // MyConstructor() is mehod that is pass parameter value
        

        MyConstructor myConstructor=new MyConstructor(10,12);

       int a= myConstructor.myMethod(10);

       System.out.println("this attribute from the class "+" "+a);

       int jar=mySum(12, 13);

       System.out.println("this is the method in the class"+" "+jar);
    }
}
