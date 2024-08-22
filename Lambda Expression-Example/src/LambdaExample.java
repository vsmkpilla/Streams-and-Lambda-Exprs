
@FunctionalInterface
interface Inr {
    void show();
}
//the below is a normal interface
//interface USD{
//    void Show();
//    void Print();
//}

//The below code is to define show method.(Created a class and defined the show method in it)
class InrImplementation implements Inr{
    public void show(){
        System.out.println("In Implementation class of INR");
    }
}

public class LambdaExample {

    public static void main(String[] args) {
        //Below 2 line are to invoke the show() method
        Inr inr = new InrImplementation();
        inr.show();

        //By using Lamda expression we can reduce lot of code like below
        Inr inrWithLambda = ()->{System.out.println("In Lamda expression, Defined the show method using Lambda expression");};
        inrWithLambda.show();
    }

}
