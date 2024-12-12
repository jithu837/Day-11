import java.util.*;
abstract interface math
{
    void print();
}
class d implements math{
    public void print(){
        System.out.println("HELLO");
    }
}
public class AbstractInterface{
    public static void main(String args[])
    {
         d f =new d();
         f.print();
}}

/*HELLO*/