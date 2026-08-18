import java.util.*;
class palin_partitioning
{
    static List <Integer> l=new ArrayList<>();
    public static void main(String []args)
    {
        int x=2;
        // System.out.println("recursion is "+x+" "+pow3(x,10));
        String s="aabb";
        solve(s,s.length());

    }

    public static boolean isPalin(String s)
    {
        String rev="";
        for(int i=0;i<s.length();i++)
        {
            rev=s.charAt(i)+rev;
        }

        return rev.equals(s);
            }

    public static void solve(String s, int n)
    {
       
        if(isPalin(s.substring(0,n)))
        {
            System.out.println(s.substring(0,n));
            solve(s.substring(n,s.length()),n+1);
        }
        else
        return;
    }
}
    