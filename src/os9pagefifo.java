import java.util.LinkedList;
import java.util.Queue;

public class os9pagefifo {
    public static void main(String[] args) {
        int[] pageReferences = {1,3,0,3,5,6,3};
        int frames = 3;

        int pageFaults = simulateFIFO(pageReferences, frames);
        System.out.println("Total page faults: " + pageFaults);
    }

    public static int simulateFIFO(int[] pageReferences, int frames) {
        Queue<Integer> memory = new LinkedList<>();
        int pageFaults = 0;

        for (int page : pageReferences) {
            if (!memory.contains(page)) {
                if (memory.size() == frames) {
                    int removedPage = memory.poll();
                    System.out.println("Page " + removedPage + " removed from memory.");
                }
                memory.offer(page);
                pageFaults++;
                System.out.println("Page " + page + " added to memory.");
            }
            // Print current state of memory
            System.out.print("Current memory state: ");
            for (int p : memory) {
                System.out.print(p + " ");
            }
            System.out.println();
        }

        return pageFaults;
    }
}
