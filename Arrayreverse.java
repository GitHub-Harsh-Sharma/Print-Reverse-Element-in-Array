import java.util.*;

class Arrayreverse
{
 int []arr= new int[5];

 public void input()
 {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter elements");
     for (int i=0;i<5;i++)
     {
         arr[i]=sc.nextInt();
     }
 }   

 public void print()
 {
     int rev=0;
     System.out.println("Reverse element is:");
     for (int i=4;i>=0;i--)
        {
            System.out.println(arr[i]);
        }   
}  
 public static void main(String args[])
 {
     Arrayreverse arr=new Arrayreverse();
     arr.input();
     arr.print();
 }
} 