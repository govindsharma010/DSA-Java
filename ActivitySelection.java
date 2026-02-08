import java.util.*;

public class ActivitySelection {
    // blue Print of a job
        static class Job{
            int deadline;
            int profit;
            int id;
            public Job(int i, int d, int p){
                id = i;
                deadline = d;
                profit = p;
            }
        }

        public static void main(String args[]){
            int jobsInfo[][] = {{3,50}, {1,15}, {2,20}, {2,30}};
            // creating arraylist to store Job Objects
            ArrayList<Job> jobs = new ArrayList<>();
            // now we have to - converted the jobsInfo array 
            // into Job objects and added them to this list.
            for(int i=0; i<jobsInfo.length; i++){
                jobs.add(new Job (i, jobsInfo[i][0], jobsInfo[i][1]));
            }

        //  Collections.sort(jobs, (a,b) -> b.profit - a.profit); // descending order and if a-b then it will ascending 
          // descending order of profit 
 // OR
          jobs.sort((a,b) -> Integer.compare(b.profit, a.profit));
          ArrayList<Integer> seq = new ArrayList<>();
          int time = 0;
          for(int i=0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
             if(curr.deadline> time){
                seq.add(curr.id);
                time++;
             }
          }
          // print seq 
          System.out.println("max jobs =" + seq.size());
          for(int i=0; i<seq.size(); i++){
          System.out.println(seq.get(i)+ " ");
          }
          System.out.println();
        }

        /* 
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        // end time basis sort
       
        int activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        //now sort this 2d array wrt end time;
        // using comparator
        Arrays.sort(activities, Comparator.comparingInt(o->o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new  ArrayList<>();
        
        //1st activity
        // [0] = index [1] = start time [2] = endtime
        maxAct = 0;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=0; i<end.length; i++){
         if(activities[i][1] >= lastEnd){
            // activity select
            maxAct++;
            ans.add(activities[i][0]);
            lastEnd = activities[i][2];
         }
        }
        System.out.println("max activities " + maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A" +ans.get(i) + " ");
        }*/
       
        
    }

