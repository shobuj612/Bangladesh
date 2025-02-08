package chapter_9;

public class MyStatic_Instance {

    
    public static void main(String[] args) {


        Counter obj1 = new Counter();
        Counter obj2 = new Counter();

    
        // this is will be called first

        Counter.increment();

        // this is will be called after the completed the first called

        Counter.increment();

        

        obj1.display();  // Output: Count: 2

        obj2.display();  // Output: Count: 2 (Same count, because it's a static variable)
        
    }
}


class Counter {
    // Static variable to count the number of times the method is called

    static int count = 0;

    // compiler will jump here first and completed it

    // then it will be called next

     

    static void increment() {

        count++;

        System.out.println("show the countt"+" "+count);
    }

    // Instance method that displays the current count
    void display() {
        System.out.println("Count: " + count);
    }
}
