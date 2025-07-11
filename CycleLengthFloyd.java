public class CycleLengthFloyd {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 0}; // input array
        int start = 0;

        // Initialize fast and slow pointers to start index
        int fast = start;
        int slow = start;

        // Phase 1: Detect cycle using Tortoise and Hare
        while (true) {
            // If fast pointer goes out of bounds, no cycle
            if (!isValid(a, fast) || !isValid(a, a[fast])) {
                System.out.println(-1);
                return;
            }

            // Move slow by 1 step
            slow = a[slow];

            // Move fast by 2 steps
            fast = a[a[fast]];

            // If both pointers meet, a cycle is detected
            if (fast == slow) break;
        }

        // Phase 2: Count cycle length
        int cur = a[slow];  // start walking from next element
        int len = 1;

        while (cur != slow) {
            cur = a[cur];
            len++;
        }

        System.out.println(len);  // Output the cycle length
    }

    // Helper to check if index is within bounds
    public static boolean isValid(int[] a, int ind) {
        return ind >= 0 && ind < a.length;
    }
}
