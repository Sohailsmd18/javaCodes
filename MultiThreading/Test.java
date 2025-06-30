package MultiThreading;

// public class Test {
//     public static void main(String[] args) {
//         World w = new World();
//         w.start();  // runs world in a separate thread

//         for (int i = 0; i < 100; i++) {
//             System.out.println("Hello");
//         }
//     }
// }


public class Test extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Test t1 = new Test();   // Prints "Hello"
        World w1 = new World(); // Prints "world"

        t1.start(); // Start Hello thread
        w1.start(); // Start World thread
    }
}
