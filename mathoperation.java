
public class mathoperation
{
   public static void main(String[] args){
    
//Arithmetic
        int a = 10, b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
// Unary
        int x = 5;
        System.out.println(x++); 
        System.out.println(++x);

// Assignment
        int num = 20;
        num += 5;
        System.out.println(num);

// Relational
        System.out.println(a > b);
        System.out.println(a == b);

// Logical
        boolean p = true, q = false;
        System.out.println(p && q);
        System.out.println(p || q);

// Ternary
        int marks = 60;
        String result = (marks >= 50) ? "Pass" : "Fail";
        System.out.println(result);
    }
}

   

