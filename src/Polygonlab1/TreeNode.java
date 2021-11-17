package Polygonlab1;

public class TreeNode {
    private int data ;
    private TreeNode leftnode;
    private  TreeNode rightnode;


    public void insert (int value){
        if (value == data){
            return;
        }

        if (value< data){
            if (leftnode == null){
                 leftnode = new TreeNode(value);
            }else {
                leftnode.insert(value);
            }
        }else
            if (rightnode == null){
                rightnode = new TreeNode(value);
            }else {
                rightnode.insert(value);
            }
    }
    public void inorderTr(){
        if (leftnode != null){
            leftnode.inorderTr();
        }
        System.out.print(data + ",");
        if (rightnode != null){
            rightnode.inorderTr();
        }
    }

    public  void postOrder(){
        if (leftnode != null){
            leftnode.postOrder();
        }
        if (rightnode != null){
            rightnode.postOrder();
        }

        System.out.print(data + ",");
    }

    public  void preOrder(){
        System.out.print(data + ",");
        if (leftnode != null){
            leftnode.preOrder();
        }
        if (rightnode != null){
            rightnode.preOrder();
        }
    }

    public TreeNode(int value){
        this.data = value;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftnode() {
        return leftnode;
    }

    public void setLeftnode(TreeNode leftnode) {
        this.leftnode = leftnode;
    }

    public TreeNode getRightnode() {
        return rightnode;
    }

    public void setRightnode(TreeNode rightnode) {
        this.rightnode = rightnode;
    }
}
