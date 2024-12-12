import java.util.*;
class ArrayListDynamic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //Accepting array list elements
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for (int i=0;i<n;i++)
        {
            int s=sc.nextInt();
            a.add(s);
        }
        a.add(89);
        System.out.println(a);
    }
}
/*6
3
7
8
3
4
5
[3, 7, 8, 3, 4, 5, 89]*/