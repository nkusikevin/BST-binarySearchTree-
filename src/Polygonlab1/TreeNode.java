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
