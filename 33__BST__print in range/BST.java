public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            //left subtree
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void prinInRange(Node root,int X,int Y){
        if(root==null){
            return ;
        }
        if(root.data>=X && root.data<=Y){
            prinInRange(root.left,X,Y);
            System.out.println(root.data+" ");
            prinInRange(root.right,X,Y);
        }
        else if(root.data>=Y){
            prinInRange(root.left,X,Y);
        }
        else{
            prinInRange(root.right,X,Y);
        }
    }
    public static void main(String args[]){
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        prinInRange(root,2,5);
    }
}

