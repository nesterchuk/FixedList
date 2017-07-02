import java.util.LinkedList;

public class FixedList <E> {
    LinkedList<E> list;
    int sizeList;

    FixedList(){
        this.list = new LinkedList<E>();
        this.sizeList = 16;
    }

    FixedList(int size){
        this.list = new LinkedList<E>();
        this.sizeList = size;
    }

    public void push(E newElement){
        if(list.size() == sizeList){
           list.removeFirst();
        }
        list.add(newElement);
    }
    public LinkedList<E> getList(){
        return list;
    }
}
