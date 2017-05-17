interface MyInter{
    public String getName();
} 

public class LambdaTest2{
    public void test(MyInter i){
        System.out.println("The Content of This Method is "+i.getName());
    }
    //////////////////
    public static void main(String []args){
        LambdaTest2 at = new LambdaTest2();
        at.test(()->new String("Lambda Content"));
    }
}