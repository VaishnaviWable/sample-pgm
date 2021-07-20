class Example1
{
   public static void main(String args[])
   {
      try{
         int num1=30, num2=0;
         int output=num1/num2;
         System.out.println ("Result: "+output);
      }
      catch(ArithmeticException e){
         System.out.println ("You Shouldn't divide a number by zero");
      }

	 try{
        int a[]=new int[10];
        //Array has only 10 elements
        a[11] = 9;
      }
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println ("ArrayIndexOutOfBounds");
      }
   }
}



Output:

Microsoft Windows [Version 10.0.18362.207]
(c) 2019 Microsoft Corporation. All rights reserved.

C:\Users\HP\Desktop\java>javac Example1.java

C:\Users\HP\Desktop\java>java example1.java
You Shouldn't divide a number by zero
ArrayIndexOutOfBounds

C:\Users\HP\Desktop\java>


