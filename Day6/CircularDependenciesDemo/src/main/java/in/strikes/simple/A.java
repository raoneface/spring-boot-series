package in.strikes.simple;

import org.springframework.stereotype.Component;

//@Component
public class A {

    private B b;

    public A(B b){
        this.b = b;
    }
    public void printa(){
        b.printb();
        System.out.println("this is a class printa");
    }
}
