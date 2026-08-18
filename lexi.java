import java.util.*;
class lexi
{
    static List <Integer> l=new ArrayList<>();
    public static void main(String []args)
    {
        int x=2;
        // System.out.println("recursion is "+x+" "+pow3(x,10));
        int a[]={1,2,3};

        solve(a,0);

    }
    
    public static void solve(int a[], int n)
    {
        System.out.println(l);

        if(n==a.length)
        {
            return;
        }


    }

    public static int pow(int n, int k)
    {
        if(k==0)
        return 1;

        if(k%2==0)
        {
            return pow(n,k/2)*pow(n,k/2);
        }
        else
        return pow(n,k/2)*pow(n,k/2)*n;
    }

     public static int pow3(int n, int k)
    {
        if(k==0)
        return 1;

        if(k%3==0)
        {
            return pow(n,k/3)*pow(n,k/3)*pow(n,k/3);
        }
        else  if(k%3==1)
        {
            return pow(n,k/3)*pow(n,k/3)*pow(n,k/3)*n;
        }
        else
        return pow(n,k/3)*pow(n,k/3)*n*n;
    }
}