package chapter_9;

public class Circle {

    public static void main(String[] args) {

           // this is first object

        Circle1 circle1=new Circle1();

        System.out.println("this is  the first constructor"+" "+circle1.radius);
         
        // this is second object

        Circle1 circle12=new Circle1(26.12);

        System.out.println("this is the second constructor:"+" "+circle12.radius);
        
        // call the method 
        circle12.myArea();
       

        // this is third object

        Circle1 circle13=new Circle1(12.10f);

        System.out.println("show the float raduou"+" "+circle13.radius);
          
        // callde the method by the object


        circle13.area(20.12f);
         

        // this is fourth object

        Circle1 circle14=new Circle1(20);


        System.out.println("show  the value of the iqram"+" "+circle14.iqram);


        circle14.pakistan();





    }

}

class Circle1 {

    double radius;// this is varialble or data field
                  // this is called instance variable

    int iqram; // thi is instance variable

    /*
     * 🔹 Conclusion:
     * ✔ Constructor public বা protected হতে পারে।
     * ✔ public হলে সব জায়গা থেকে অ্যাক্সেস করা যাবে।
     * ✔ protected হলে শুধুমাত্র Inheritance বা প্যাকেজের ভিতরে ব্যবহার করা যাবে।
     * ✔ private হলে বাইরের ক্লাস থেকে Object তৈরি করা যাবে না।
     * ✔
     */

    /*
     * Constructor-এর ভিতরে থাকতে পারে:
     * ✔ Variable Initialization (ভেরিয়েবল সেট করা)
     * ✔ Method Call (অন্য Method কল করা)
     * ✔ Object Creation (নতুন Object তৈরি করা)
     * ✔ Control Statements (if-else, loops)
     * 
     * ❌ Constructor-এর ভিতরে থাকতে পারে না:
     * ❌ Method Definition (Constructor-এর ভিতরে নতুন Method তৈরি করা যাবে না)
     * ❌ Return Statement (void বা কোনো রিটার্ন ভ্যালু)
     * 
     * 
     */

    /*
     * Constructor-এর ভিতরে Local Variable ব্যবহার করা যায়।
     * ✅ Constructor Parameter নেওয়া যায় এবং সেটিকে Local Variable-এ রাখা যায়।
     * ❌ Constructor-এর বাইরে Local Variable ব্যবহার করা যায় না।
     * ✔ Local Variable যদি Constructor-এর বাইরে ব্যবহার করতে চান, তাহলে সেটি
     * Instance Variable-এ সংরক্ষণ করুন।
     * 
     * 
     */
    /*
     * 
     * Constructor বা Method-এর ভিতরে Instance Variable-এর Data Type পরিবর্তন করা
     * যায় না।
     * ✅ Instance Variable-এর Value পরিবর্তন করা সম্ভব।
     * ✅ নতুন ভেরিয়েবল তৈরি করে Data Type পরিবর্তন করা সম্ভব।
     */

    /*
     * 
     * 🔹 Conclusion
     * ❌ Constructor-এর কোনো Data Type থাকে না।
     * ❌ Constructor Parameter-এর Data Type এবং Instance Variable-এর Data Type একই
     * হতে হবে না।
     * ✅ Constructor-এর ভিতরে Data Type কনভার্সন করা সম্ভব (যেমন: int → double,
     * String → int)
     */

    // this is my first constructor

    public Circle1() { // this is called default constructor
                       // constructor cannot contain any method but to call
        radius = 20;
    }

    // constructor cannot be duplicate
      
    // this is second constructor

    public Circle1(double newRadius) {

        this.radius = newRadius;

    }

    public void myArea() {

        double area = Math.PI * radius * radius;

        System.out.println("show the area of the circle" + " " + area);
    }


    // this is third constructor


    public Circle1(float hiradius) {

        this.radius = hiradius;
    }

    public void area(float radius) {

        double b = Math.PI * radius * radius;

        System.out.println("show the result" + " " + b);

    }
     

    // this is third constructor

    public Circle1(long kiradius) {

        this.radius = kiradius;
    }

     // this is fourth constructor

    public Circle1(int niqram) {
       
        // constructor parameter data type is short
        // but instance variable data type is int
        // they may be different
        // faruk is local variable
        // constructor parameter can be assign into local variable

        // local variable can be assign into instance variable


         int faruk=niqram;

         iqram=faruk;

    }

    public void pakistan(){

        int count=iqram*iqram;

      System.out.println("show the count"+" "+count);
    }

}
