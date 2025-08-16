public class Main {
    public static boolean issorted(int array[],int idx){
        if(idx==array.length-1){
            return true;
        }
        if(array[idx]<array [idx+1]){
            return issorted(array,idx+1);
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        int array[]={1,3,5};
        System.out.println(issorted(array,0));
    }
}