package RecursionAssignment;

public class QSn1 {
    public static void main(String[] args) {
        int n=1234;
       int res= sum(n);
        System.out.println("The sum is:"+res);

    }
    public static int sum(int n){
        int r=0;
        int sum=0;
        int res;
        if(n==0){
            return 0;
        }
        else{
            return (n%10+sum(n/10));
        }

    }
}
