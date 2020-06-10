import javax.lang.model.util.ElementScanner6;

public class q5 {
    public static void main(String[] args){
        int marks = 56;
        if(marks>=75)
            System.out.println("Distinction");
        else if(marks>=60)
            System.out.println("First class");
        else if(marks>=50)
            System.out.println("second class");
        else if(marks>=35)
            System.out.println("pass");
        else
            System.out.println("Fail");
    }
}