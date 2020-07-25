package Adarsh.designprinciples;

public class Add extends Calculator {
    Add(double n1,double n2){
        super(n1,n2);
    }
    double calculate(){
        return x+y;
    }
}