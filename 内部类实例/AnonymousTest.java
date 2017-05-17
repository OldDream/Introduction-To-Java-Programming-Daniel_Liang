interface MyInter{
    public String getName();
}

public class AnonymousTest{
    public void test(MyInter i){
        System.out.println("The Content of this function is "+i.getName());
    }

    public static void main(String[] args){
        AnonymousTest ta = new AnonymousTest();
        ta.test(new MyInter(){    //匿名内部类
            public String getName(){
                 return "Anonymous Content";
            }
        });
    }
}