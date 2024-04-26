package lab8;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        new Thread(new Producer(store)).start();
        new Thread(new Consumer(store)).start();
    }
}
