import java.util.Scanner;
class JavaDay4
{
public static void main(String[] args)
 {Scanner sc = new Scanner(System.in);
    System.out.println("enter your Age for voting ");
     int age = sc.nextInt();
  // supose user enterd the age is 17 years 
  

     if (age>=18)// if checks the condition 17 is grater than or equal to the age . in this case condition false 
      {

        System.out.println("your eligible for voting ");
        
     }
      else
       {
            System.out.println("your not eligiblr for voting your age is below 18 years");        
     }
  /*
  1. we are importing the util package for Scanner class, for taking the input from the user(console) 
  */
           
}
}
