/**
 * This class models a binary tree.
 * */
public class BST {
    BSTNode root;//a root element of the binary tree

    /**
     * A new tree constructor.
     * */
    public BST(){
        this.root = null;
    }

    /**
     * Constructs a BSTNode and places a reference to the profile in it.
     *
     * @param p a Profile object
     */
    void addProfile (Profile p){
        BSTNode newNode = new BSTNode(p);
        if (root==null){
            this.root=newNode;
        }else{
            this.root = recursiveMethod(newNode, this.root);
        }
    }

    /**
     * Recursive method to populate the BST that calls either getLeft () or getRight () depending
     * on if the first name of the profile alphabetically comes before or after the name of the current node.
     *
     * @param newNode new node
     * @param currentNode current node
     * @return the root of the BST
     */
    private BSTNode recursiveMethod(BSTNode newNode, BSTNode currentNode) {

        if (newNode.getProfile().getFirstName().compareTo(currentNode.getProfile().getFirstName()) < 0) {
            if (currentNode.getLeft() == null) {
                currentNode.setLeft(newNode);
                return currentNode;
            }
            this.root.setLeft(recursiveMethod(newNode, currentNode.getLeft()));
        }

        if (newNode.getProfile().getFirstName().compareTo(currentNode.getProfile().getFirstName()) > 0) {
            if (currentNode.getRight() == null) {
                currentNode.setRight(newNode);
                return currentNode;
            }

            this.root.setRight(recursiveMethod(newNode, currentNode.getRight()));
        }

        return this.root;
    }


}
