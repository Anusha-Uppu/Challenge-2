import java.util.*;
class addition {
    public static int Addition(int a,int b){
        return a+b;
    }
} class Division {

    public static int  Divisionbytwo(int addResult){
        
        return addResult/2;
    }
}
class multiplication {
    public static int mul(int a,int h){
        return a*h;
    }
}
public class main {

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        addition aa=new addition();
        int r1=aa.Addition(a, b);
        Division d=new Division();
       int r2= d.Divisionbytwo(r1);
       multiplication m=new multiplication();
       int h=sc.nextInt();
       int result=m.mul(r2, h);
       System.out.println(result);
     }
}