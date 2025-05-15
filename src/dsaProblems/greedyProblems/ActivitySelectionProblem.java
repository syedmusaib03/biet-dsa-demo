package dsaProblems.greedyProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Activity {
    int start, finish;

    Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

public class ActivitySelectionProblem {
    public static void main(String[] args) {
        List<Activity> activities = Arrays.asList(

                new Activity(5, 7),
                new Activity(8, 9),
                new Activity(1, 4),
                new Activity(5, 9),
                new Activity(0, 6),
                new Activity(3, 5)
        );
        printMaxActivities(activities);
    }

    static void printMaxActivities(List<Activity> activities) {
        //sort the activvities according to their finish times
        activities.sort(new ActivityComparator());
        //First activity is always selected
        int lastSelected = 0;  //start at index 0
        // (1,4) (5,7) (8,9)
        System.out.println("(" + activities.get(lastSelected).start + "," + activities.get(lastSelected).finish + " )");
        //traverse the activities & find the next activity
        //start time of next should be greater than or equal to
        //finish time of the previous/last-selected activity
        for (int i = 1; i < activities.size(); i++) {
            if (activities.get(i).start >= activities.get(lastSelected).finish) {
                System.out.println("(" + activities.get(lastSelected).finish + "," + activities.get(i).finish + " )");
                lastSelected = i;
            }
        }
    }

    static class ActivityComparator implements Comparator<Activity> {
        public int compare(Activity a1, Activity a2) {
            //sort according to the finish values
            return a1.finish - a2.finish;   // Ascending Order
        }
    }
}
