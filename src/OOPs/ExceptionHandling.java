package OOPs;

public class ExceptionHandling {
    public static void main(String[] args){
        int a = 5;
        int b = 0;
//        int c = a / b;  //  Exception in thread "main" java.lang.ArithmeticException: / by zero

        try {
//            int c = a / b;
            divide(a, b);
        } catch (Exception e){
            System.out.println(e.getMessage()); // This will give message
        } finally {
            System.out.println("Finally: This will always execute");
        }
    }
//    static int divide(int a, int b){
//        return a / b;
//    }

//    static int divide(int a, int b){
//        if(b == 0){
/// /            throw new ArithmeticException(); // This will throw null
//            throw new ArithmeticException("Please don't divide by 0");
//        }
//        return a / b;
//    }

    static int divide(int a, int b) throws ArithmeticException{ // Here we use throws, not throw
        if(b == 0){
        //  throw new ArithmeticException(); // This will throw null
        throw new ArithmeticException("Please don't divide by 0");
        }
    }
}
