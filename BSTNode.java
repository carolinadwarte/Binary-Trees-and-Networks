/**This class is a Node of a binary tree.*/
public class BSTNode {
    Profile data;//reference to a profile
    BSTNode l;//reference ti the left child of the tree
    BSTNode r;//reference to the right child of the tree

    /**A new tree constructor.
     *
     * @param data*/
    public BSTNode (Profile data){
        this.data = data;
    }

    /**Gets the profile associated with this node.
     *
     * @return a profile data*/
    Profile getProfile(){
        return data;
    }

    /**
     * Method to set the left node.
     * @param l a reference to the left sub-tree
     */
    void setLeft (BSTNode l){
        this.l=l;
    }

    /**
     * Method to set the right node.
     * @param r a reference to the right sub-tree
     */
    void setRight (BSTNode r){
        this.r=r;
    }

    /**Gets the left node.
     *
     * @return a reference to the left node*/
    BSTNode getLeft() {
        return l;
    }

    /**Gets the right node.
     *
     * @return a reference to the right node*/
    BSTNode getRight() {
        return r;
    }
}
