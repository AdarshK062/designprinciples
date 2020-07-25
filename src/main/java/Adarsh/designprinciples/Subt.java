package Adarsh.designprinciples;

public class Subt extends Calculator {
    Subt(double n1,double n2){
        super(n1,n2);
    }
    double calculate(){
        return x-y;
    }
}