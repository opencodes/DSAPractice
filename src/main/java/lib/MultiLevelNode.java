package lib;

public class MultiLevelNode {
    public int data;
    public MultiLevelNode right;
    public MultiLevelNode down;

    public MultiLevelNode(int data){
        this.data = data;
        this.right = null;
        this.down = null;
    }
}
