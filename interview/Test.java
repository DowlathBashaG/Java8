package io.dowlath.javahidden.interview;
class A1{
    public int i;
    protected  int j;
}
class B2 extends  A1{
    int j;
    void display(){
        super.j = 3;
        super.i = 10;
        System.out.println(i+ " "+j);
    }
}
/*class Men{
    public int number;
}*/
/*class A{
    final public int GetResult(int a, int b){
        return 0;
    }
}
class B extends A{
    public int GetResult(int a, int b){
        return 1;
    }
}*/
public class Test {

    /*static String value = " testify";
    static int value1=25;
    static{
        value1=50;
        System.out.println(value);;
        System.out.println(value1);*/

  /*  public void doIt(int i, Men p){
        i =5;
        p.number = 8;
    }*/
    public static void main(String[] args) {
     /* int x= 0;
      Men p = new Men();
      new Test().doIt(x,p);
        System.out.println(x+" "+p.number);*/
        B2 obj = new B2();
        obj.i =1;
        obj.j = 2;
        obj.display();
    }
}
