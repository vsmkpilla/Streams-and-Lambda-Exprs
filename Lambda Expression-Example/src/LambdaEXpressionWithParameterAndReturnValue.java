
interface Calc{
    //With Parameter
//    void printSum(int Sum);

    //With Parameters and Retrun value
    int sum(int a,int b);

}

public class LambdaEXpressionWithParameterAndReturnValue {
    public static void main(String[] args) {
        //The below 2 lines are expample of Parameterized Lambda expressions
//        Calc calc = (sum)->System.out.println("SumValue:" +sum);
//        calc.printSum(200);

        //The below lines are for lambda expression with Parameters and Return value
        Calc calc = (a,b)-> {return a+b;};
        int sum = calc.sum(10,20);
        System.out.println("Sum Value:"+sum);
    }

}
