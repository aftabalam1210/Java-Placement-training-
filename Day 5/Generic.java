class Linked <T>{
    class Node{
        T data;
        Node next;
    }
    public void wildCard(ArrayList<? extends Number>ar){

    }
    public <U> void print(U[]arr){

    }
}



public class Generic {
    public static void main(String[] args) {
        Linked<Float> list = new Linked();
    }
}
