import java.util.LinkedHashMap;
import java.util.Map;

public class os9lrup {
    public static void main(String[] args) {
        int[] pageReferences = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2, 3};
        int frames = 4;

        int pageFaults = simulateLRU(pageReferences, frames);
        System.out.println("Total page faults: " + pageFaults);
    }

    public static int simulateLRU(int[] pageReferences, int frames) {
        LinkedHashMap<Integer, Integer> memory = new LinkedHashMap<>(frames, 0.75f, true);
        int pageFaults = 0;

        for (int page : pageReferences) {
            if (!memory.containsKey(page)) {
                if (memory.size() == frames) {
                    // Remove the least recently used page
                    int lruPage = memory.entrySet().iterator().next().getKey();
                    memory.remove(lruPage);
                    System.out.println("Page " + lruPage + " removed from memory.");
                }
                memory.put(page, 0);
                pageFaults++;
                System.out.println("Page " + page + " added to memory.");
            }

            // Update access order for the accessed page
            memory.get(page);

            // Print current state of memory
            System.out.print("Current memory state: ");
            for (int p : memory.keySet()) {
                System.out.print(p + " ");
            }
            System.out.println();
        }

        return pageFaults;
    }
}
