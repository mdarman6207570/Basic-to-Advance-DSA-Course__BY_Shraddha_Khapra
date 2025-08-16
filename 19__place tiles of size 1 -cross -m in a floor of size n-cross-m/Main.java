public class Main {
    public static int placeTiles(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        // vertically
        int vertplacements=placeTiles(n-1,m);

        //horizontally
        int horplacements=placeTiles(n-1,m);
        return vertplacements+horplacements;
    }
    public static void main(String args[]){
        int n=4,m=2;
        System.out.println(placeTiles(n,m));
    }
}