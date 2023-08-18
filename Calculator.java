class Calc
{
    public int add(int n1, int n2)
    {
    int result1= n1+n2;
     return result1;
    }
    public int subs(int n1, int n2)
    {
    int result2= n1-n2;
    return result2; 
    }
    public void show(int n)
    {
        System.out.println("char= " +n);
    }
}

public class Calculator
{
 public static void main(String args[])
{
  Calc obj=new Calc();
  int n1,n2;

  int result1=obj.add(n1=4,n2=3);
  int result2=obj.subs(n1,n2);
  System.out.println("Sum "+result1);
  System.out.println("Difference "+result2);
  obj.show('p');
}
}
