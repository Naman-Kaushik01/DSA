package tree;
import java.util.Scanner;

public class AVLTree {
    class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;
    public AVLTree(){

    }
    public int height(Node node){
        if(node == null){
            return 0;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root == null;
    }
    public void insert(int value){
        root = insert(value, root);
    }

    //INSERT

    public Node insert(int value,Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value, node.left);
        }
        if(value > node.value){
            node.right = insert(value, node.right);
        }
        node.height = 1 + Math.max(height(node.left), height(node.right));
        return rotate(node);
    }
    private Node rotate(Node node){
        if(height(node.left) - height(node.right) > 1){
            //left heavy
            if(height(node.left.left) - height(node.left.right) > 0){
                //left left case
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0){
                //left right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(height(node.left) - height(node.right) < -1){
            //right heavy
            if(height(node.right.left) - height(node.right.right) < 0){
                //right right case
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right) > 0){
                //left right case
                node.left = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    private Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return c;
    }
    private Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return p;
    }

    public void populate(int nums[]){
        for (int i = 0; i < nums.length; i++){
            this.insert(nums[i]);
        }
    }
    public void populateSorted(int[] nums){
        populateSorted(nums , 0 , nums.length);
    }
    public void populateSorted(int[] nums , int start , int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start)/2;
        this.insert(nums[mid]);
        populateSorted(nums , start , mid);
        populateSorted(nums , mid + 1 , end);

    }

    private boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
    private void display(){
        display(root);
    }
    private void display(Node node){
        display(this.root , "Root Node: ");
    }
    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.value + " ");
        display(node.left , "left child of " + node.value + " : ");
        display(node.right, "right child of " + node.value + " : ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       AVLTree tree = new AVLTree();
        int nums[] = {5,2,7,1,4,6,9,8,3,10};
        int nums1[] = {1,2,3,4,5,6,7,8,9,10};
        tree.populateSorted(nums1);
//            tree.populate(nums);

        tree.display();

    }
}

