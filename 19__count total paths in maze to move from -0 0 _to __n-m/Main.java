public class Main {
    public static int countPaths(int i, int j, int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==n-1){
            return 1;
        }
        //move downwords
        int downpaths= countPaths(i+1,j,m,n);

        //move rightpaths
        int rightpaths=countPaths(i,j+1,n,m);
        return downpaths+rightpaths;
    }
    public static void main(String args[]){
        int n=3,m=3;
        int totalpaths=countPaths(0,0,n,m);
        System.out.println(totalpaths);
    }
}