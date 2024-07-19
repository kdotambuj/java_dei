import java.util.*;
import java.util.Scanner;

public  class Expression {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter the expression that you want to evaluate");
         String exp = scanner.nextLine();

         String operator = exp.substring(0,3);

         int idx = 0;

         String x1 = "";
         String x2 = "";


         // extracting x1 and x2 from the expression
         // we can use the inbuilt function also, like trim or split, but I am using the traditional approach here.
         while(exp.charAt(idx)!='(') idx += 1;
         idx += 1;
         while(exp.charAt(idx)!=','){
             if (exp.charAt(idx) == ' '){
                 idx +=1;
                 continue;
             }
             x1 = x1 + exp.charAt(idx);
             idx++;
         }
         idx += 1;
         while(exp.charAt(idx)!=')'){
             if (exp.charAt(idx) == ' '){
                 idx +=1;
                 continue;
             }
             x2 = x2 + exp.charAt(idx);
             idx += 1;
         }


         //converting into integer
         int x = Integer.valueOf(x1);
         int y = Integer.valueOf(x2);

         //doing operation
         if (operator.equals("ADD")){
              System.out.print(x+y);
         }
         else if (operator.equals("MUL")){
             System.out.print(x*y);
         }
         else if (operator.equals("DIV")){
             if (y==0) {
                 System.out.print("Cannot divide by zero");
                 return;
             }
             System.out.print(x/y);
         }
         else if (operator.equals("SUB")){
             System.out.print(x-y);
         }
         else System.out.print(Math.pow(x,y));
    }
}