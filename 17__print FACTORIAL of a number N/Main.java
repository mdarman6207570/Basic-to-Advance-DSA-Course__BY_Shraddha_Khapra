public class Main {
    public static int printFact(int n){
        if(n==1||n==0){
            return 1;
        }
        int factnm1=printFact(n-1);
        int factn=n*factnm1;
        return factn;
    }
    public static void main(String args[]){
        int n=5;
        int ANS=printFact(n);
        //System.out.println(ANS);
    }
}