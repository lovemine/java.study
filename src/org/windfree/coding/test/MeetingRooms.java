package org.windfree.coding.test;

import java.util.Arrays;

class Interval implements  Comparable<Interval>{
    int start;
    int end;
    Interval(){
        this.start = 0;
        this.end =0;
    }
    Interval(int s, int e){
        this.start = s;
        this.end = e;
    }


    public int compareTo(Interval o) {
        if (this.start > o.start) {
            return 1;
        } else {
            return -1;
        }
    }
    @Override
    public String toString() {
        return "start:" + this.start + " end:" + this.end;
    }
}
public class MeetingRooms {

    public static void main(String[] args) {
        MeetingRooms rooms = new MeetingRooms();
        Interval interval1 = new Interval(15,20);
        Interval interval2 = new Interval(5,10);
        Interval interval3 = new Interval(0,30);
        Interval[] intervals = new Interval[3];
        intervals[0] = interval1;
        intervals[1] = interval2;
        intervals[2] = interval3;
        Arrays.sort(intervals);
        rooms.print(intervals);
        boolean result = rooms.solve(intervals);
        System.out.println("result:" + result);

    }
    public boolean solve(Interval[] intervals) {
        for(int i = 1; i < intervals.length;i++) {
            if(intervals[i-1].end > intervals[i].start) {
                return false;
            }
        }
        return true;
    }

    private void print(Interval[] intervals) {
        for(int i = 0; i < intervals.length;i++) {
            System.out.println(intervals[i]);
        }

    }
}
