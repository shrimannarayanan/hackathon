
import java.util.Scanner;
class condition{
    public static void main (String args[])
{
    Scanner sc = new Scanner (System.in);

    int num = sc.nextInt();
    if (num>0){
        System.out.println("it is positive ");

    }
     if(num<0) 
    {
        System.out.println("it is negative ");
  
    
    }
    
   if (num==0){
        System.out.println("it is zero");
    }
      
    
    else if (num%2==0){
        System.out.println("it is positive even");
    }
   
   else if(num%2==0){
        System.out.println("it is neg even");

    }

}
}
