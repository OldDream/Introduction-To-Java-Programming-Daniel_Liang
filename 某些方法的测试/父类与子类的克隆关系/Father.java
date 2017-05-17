public class Father implements Cloneable {
    String test = "Father";

    @Override 
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}