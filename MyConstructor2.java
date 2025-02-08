public class MyConstructor2 {

    int x;

    int y;

    int z;

    float x1 = 10;

    float y1 = 20;

    float z1 = 30;

    public int mySum(int p, int q) {

        return p + q;

    }

    public double myJump(double a, double b) {

        return a * b;
    }

    public void myJun(int c, int d) {

        x = c;
        y = d;
        z = x + y;

        System.out.println("this is the attribute from the class" + " " + z);
    }

    MyConstructor2(int e, int f) {
        x = e;
        y = f;

        myIndia(e, f);

    }

    public static void myIndia(int e, int f) {

        int result = e + f;

        System.out.println("this is the value of calling from constructor:" + " " + result);
    }

    MyConstructor2(double g, double h) {

        x = (int) g;
        y = (int) h;

        System.out.println("this is direct print from the constructor" + " " + x + y);

        double hi = myDouble(g, h);

        System.out.println("the value of Hi:" + " " + hi);

        // double r=g;
        // double s=h;
    }

    public double myDouble(double g, double h) {

        return g * h;
    }


    MyConstructor2(float s, float t ){

        float s1=s;
        float s2=t;

        float s3=s1+s2;

        System.out.println("this is the constructor without initialization:"+" "+s3);
    }

    public static void main(String[] args) {


        MyConstructor2 myConstructor2=new MyConstructor2(10.2f, 12.20f);

        MyConstructor2 myConstructor3=new MyConstructor2(100,20);

        MyConstructor2 myConstructor4=new MyConstructor2(123.d, 205.123d);

        int mysum=myConstructor2.mySum(10,20);

        System.out.println("this is the result:"+" "+mysum);

        int mysum1=myConstructor3.mySum(200, 500);

        System.out.println("the sum by anotther constructor"+" "+mysum1);

        int mysum2=myConstructor4.mySum(30, 40);

        System.out.println(" the sum by constructor 3 "+" "+mysum2);


        double mydouble=myConstructor2.myDouble(15.01,20.1);
        
        System.out.println("this is the result from mydouble:"+" "+mydouble);

        myConstructor4.myJump(20,31);

        



    }
}
