import java.util.*;
/**
 * Division
 */
 class addition {
    public static int Addition(int a,int b){
        return a+b;
    }
}
public class Division {

    public static int  Divisionbytwo(int addResult){
        addition aa=new addition();
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        aa.Addition(a, b);
        return addResult/2;
    }
}