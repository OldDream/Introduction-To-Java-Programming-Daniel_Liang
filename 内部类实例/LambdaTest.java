interface MyInter{
    public String getName();
}

public class LambdaTest{
    public void test(MyInter i){
        System.out.println("The Content of this function is "+i.getName());
    }

    public static void main(String[] args){
        LambdaTest ta = new LambdaTest();
        ta.test(() -> {return "Lambda Content";});
    }
}