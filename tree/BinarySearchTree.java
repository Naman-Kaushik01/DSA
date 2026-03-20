package tree;


import java.util.Scanner;

public class BinarySearchTree {
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
        public BinarySearchTree(){

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
            return node;
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
            BinarySearchTree tree = new BinarySearchTree();
            int nums[] = {5,2,7,1,4,6,9,8,3,10};
            int nums1[] = {1,2,3,4,5,6,7,8,9,10};
            tree.populateSorted(nums1);
//            tree.populate(nums);

            tree.display();

        }
    }

