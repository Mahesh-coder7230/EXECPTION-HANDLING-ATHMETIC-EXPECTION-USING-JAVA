import java.util.Scanner;
class UnderAge extends Exception{
    int age;
    UnderAge(int age){
        this.age = age;
    }
    public String toString(){
        return "UnderAge: "+age;
    }
}
public class ExceptionDemo{
    void test(int age) throws UnderAge{
        if(age<18){
            throw new UnderAge(age);
        }
        else{
            System.out.println("You Are Eligible Age:"+age);
        }
    }
    public static void main(String[]args){
        ExceptionDemo demo =new ExceptionDemo();
        try{
            demo.test(16);
        }
        catch(UnderAge e){
            System.out.println("Exception caught: " +e);
        }
        try{
            demo.test(21);
        }
        catch(UnderAge e){
            System.out.println("Exception caught: " +e);
        }
    }
}