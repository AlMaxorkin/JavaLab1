import java.sql.SQLOutput;

/**
 * Класс для хранения произвольного количества элементов, реализованный с помощью односвязного списка
 * @author Alexandr Makhorkin
 * @param <T>
 */
public class List<T> {
    /** Поле размера списка*/
    int size;

    /**Голова списка*/
    private Node head;
    /**Конец списка*/
    private Node tail;


    /**Конструктор*/
    public List() {
        size = 0;
        this.head = null;
        this.tail = null;
    }

    /**
     * Getter
     * @return поле size
     */
    public int getSize() {
        return size;
    }

    /**
     * Класс для хранения узлов списка
     */
    private class Node {
        /**Значение узла*/
        T data;
        /** Следующий узел в списке*/
        Node next;

        /**
         * Конструктор
         * @param data знвчение помещамеое в узел списка
         */
        public Node(T data) {
            this.data = data;
            this.next = null;
        }

    }

    /**
     * Добавление элемента в конец списка
     * @param data элемент, который нужно добавить
     */
    public void push(T data){
        Node temp = new Node(data);
        if(head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = tail.next;
        }
        size++;
    }

    /**
     * Удаление с возвращением удаляемого элемента
     * @return удаляемый элемент
     */
    public T pop(){

        T last = tail.data;
        Node node = head;

        for(int i = 0; i < size -2; i++){
            node = node.next;
        }

        tail = node;
        node.next = null;
        size--;

        return last;
    }

    /**
     * Возврат последнего элемента в списке
     * @return последний элемент
     */
    public T peek(){
        return tail.data;
    }

    /**
     * Переопределенный метод для возвращения элемента по индексу
     * @param index
     * @return t
     */
    public T peek(int index){
        Node node = head;

        if(index >= size)
            return tail.data;

        for(int i = 0; i < index ; i++)
            node = node.next;

        return node.data;
    }

    /**
     * Удаление элемента по индексу
     * @param index индекс удаляемого элемента
     */
    public void delete(int index){
        Node node = head;

        if(index >= size)
            this.pop();

        if(index == 0){
            head = head.next;
            node = head;
        }

        else {
            for (int i = 0; i < (index - 1); i++) {
                node = node.next;
            }
            node.next = node.next.next;
            tail = node;
            size--;
        }
    }


    /**
     * @return строка со всеми элемнтами списка
     */
    public String show(){
        if(getSize() == 0)
            return "";

        StringBuilder buff = new StringBuilder();

        for (Node node = head; node != null; node = node.next)
            buff.append(node.data + " ");

        return buff.toString();
    }
}

