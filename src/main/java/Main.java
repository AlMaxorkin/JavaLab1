/**
 * Main class
 */
public class Main {
    /**
     * main method
     * @param args arg
     */
    public static void main(String[] args){
        List<Integer> list = new List<>();

        list.push(5);
        list.push(2);
        list.push(1);
        list.push(7);
        list.push(8);
        list.push(10);

        System.out.println(list.show());

    }
}
