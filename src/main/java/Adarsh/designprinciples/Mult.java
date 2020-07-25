package Adarsh.designprinciples;

public class Mult extends Calculator {
    Mult(double n1,double n2){
        super(n1,n2);
    }
    double calculate(){
        return x*y;
    }
}
