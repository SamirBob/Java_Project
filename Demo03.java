public class Demo03 {
    public static int i = 2;
    int sum = 0;

    public int test1(){
        System.out.println("---实例方法:test1()---");
        while(i<=100){
            sum+=i*i;
            i=i+2;
        }
        test3();
        return sum;
    }

    public static int test2(){
        System.out.println("---静态方法:test2()---");
        i+=i;
        test3();
        return i;
    }

    public static void test3(){
        System.out.println("---静态方法:test3()---");
        i+=2;
        System.out.println("test3 = "+i);
    }

    public static void main(String args[]){
        Demo03 t = new Demo03();
        System.out.println("test1="+t.test1());
        System.out.println("test2="+test2());
        Demo03.test3();
    }
}