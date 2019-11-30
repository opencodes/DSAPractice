package lib;

public class MultiLevelNode {
    int data;
    MultiLevelNode right;
    MultiLevelNode down;

    public MultiLevelNode(int data){
        this.data = data;
        this.right = null;
        this.down = null;
    }
}
