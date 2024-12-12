import java.util.*;
class ArrayList1
{
    public static void main(String args[])
    {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(345);
        a.add(909);
        //Adding at particular index
        a.add(1,789);
        a.add(767);
        //Modifying
        a.set(2,7898);
        System.out.println(a);
    }
}
/*[345, 789, 7898, 767]*/