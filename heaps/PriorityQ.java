package heaps;

import java.util.PriorityQueue;

public class PriorityQ {
    public static class Student implements Comparable<Student> {
        String name;
        int rank;
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        //when we have to compare two objects
        @Override
        public int compareTo(Student o) {
            return this.rank - o.rank;
        }
    }

    static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("Siddhant" , 8));
        pq.add(new Student("Farhan" , 7));
        pq.add(new Student("Naman" , 1));
        pq.add(new Student("Karan" , 4));


       while (!pq.isEmpty()){
           System.out.println(pq.peek().name + "->" + pq.peek().rank);
           pq.remove();
       }


    }
}
