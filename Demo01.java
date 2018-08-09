/**
 * 类的构造方法
 * 创建一个或多个构造方法
 */
public class Demo01{
    String tradeName="薯条";
    int tradePrice = 3;
    boolean sell=false;

    public Demo01(String name,int price){
        tradeName=name;
        tradePrice=price;
    }

    public Demo01(){
    }

    public StringBuffer shopping(Demo01 s){
        StringBuffer sb=new StringBuffer();
        System.out.println("商品名称为: "+s.tradeName+"\n 商品价格为： "+s.tradePrice+"元"+"\n 是否售完: "+s.sell);
        return sb;
    }

    public static void main(String[] args) {
        System.out.println("<无参数构造方法>");
        Shop s1=new Demo01();
        System.out.println(s1.shopping(s1));
        System.out.println("<带有参数构造方法>");
        Shop s2=new Demo01("可乐",4);
        System.out.println(s2.shopping(s2));
    }
}