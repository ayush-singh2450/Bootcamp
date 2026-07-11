package Problems;
import java.util.Arrays;

public class MeetingRooms {
    public static void main(String[] args) {

        int[] start = {1, 3,5,7 };
        int[] end = {2, 4, 6, 8};

        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0, j = 0;
        int rooms = 0, maxRooms = 0;

        while (i < start.length) {
            if (start[i] < end[j]) {
                rooms++;
                maxRooms = Math.max(maxRooms, rooms);
                i++;
            } else {
                rooms--;
                j++;
            }
        }

        System.out.println("Minimum Meeting Rooms Required = " + maxRooms);
    }
}