package MultiThreading;
//WITHOUT THREADS
// public class World {
//     public void printWorld() {
//         System.out.println("world");
//     }
// }

public class World extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("world");
        }
    }
}
