import java.util.ArrayList;

public class os10fcfs {
    public static int fcfsDiskScheduling(ArrayList<Integer> requestQueue) {
        int currentPosition = 0;
        int totalSeekTime = 0;

        for (int request : requestQueue) {
            int seekDistance = Math.abs(request - currentPosition);
            totalSeekTime += seekDistance;
            currentPosition = request;
        }

        return totalSeekTime;
    }

    public static void main(String[] args) {
        // Example queue of disk I/O requests
        ArrayList<Integer> requestQueue = new ArrayList<>();
        requestQueue.add(98);
        requestQueue.add(183);
        requestQueue.add(37);
        requestQueue.add(122);
        requestQueue.add(14);
        requestQueue.add(124);
        requestQueue.add(65);
        requestQueue.add(67);

        int totalSeekTime = fcfsDiskScheduling(requestQueue);

        System.out.println("FCFS Disk Scheduling:");
        System.out.println("Request Queue: " + requestQueue);
        System.out.println("Total Seek Time: " + totalSeekTime);
    }
}
