package Polygonlab1;

public class Tree {
    private  TreeNode root;

    public void  insert ( int value){
        if (root == null){
            root = new TreeNode( value);

        }else {
            root.insert(value);
        }
    }


    public void inorderTr(){
        if (root != null){
            root.inorderTr();
        }
    }

    public  void postOrder(){
        if (root != null){
            root.postOrder();
        }
    }

    public void preOder(){
        if (root != null){
            root.preOrder();
        }
    }

}
