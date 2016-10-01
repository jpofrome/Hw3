/**
 * Created by Ares on 9/30/2016.
 */
public class Triple<E> {
    //fields
    private E left;
    private E middle;
    private E right;

    //constructor
    public Triple (E left, E middle, E right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    //getts and setters
    public E getLeft() {return left;}
    public E getMiddle() {return middle;}
    public E getRight() {return right;}
    public void setLeft(E left) {this.left = left;}
    public void setMiddle(E middle) {this.middle = middle;}
    public void setRight(E right) {this.right = right;}

    public String toString() {return "(" + left + ", " + middle + ", " + right + ")";}

}