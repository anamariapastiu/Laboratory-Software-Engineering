package isp.lab3.exercise1;
import org.junit.jupiter.api.Test;

public class Tree {
    public int height;
    public Tree() {
        height=15;
    }

    public int getHeight() {
        return height;
    }

    public int Grow(int meters) {
        if (meters>=1) {
            height = height + meters;
        }
        return height;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "height=" + height +
                '}';
    }
    public static void main(String[] args){
    Tree tree=new Tree();
    tree.Grow(5);
    System.out.println(tree);
    }
}

