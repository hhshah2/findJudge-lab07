import java.util.*;

public class Judge
{
   public int findJudge(int pop, int[][]people)
   {   
       int [] trust = new int[pop+1];
       int population = people.length;
        
       for(int i = 0;i<population;i++)
       {
           int[] item = people[i];
           trust[item[0]]--;
           trust[item[1]]++;
       }

       for(int i = 1;i<=pop;i++)
       {
           if(trust[i]==pop-1)
           {
               return i;
           }
       }
       return -1;
   }
   public static void main(String[] args)
   {    
       int A = 4;
       int B = 2;
       int C = 3;

       int [][]set1 = {{1,2}};
       int [][]set2 = {{1,3},{2,3}};
       int [][]set3 = {{1,3},{2,3},{3,1}};
       int [][]set4 = {{1,2},{2,3}};
       int [][]set5 = {{1,3},{1,4},{2,3},{2,4},{4,3}};

       Judge judgeFinder = new Judge();

       int set01 = judgeFinder.findJudge(B,set1);
       int set02 = judgeFinder.findJudge(C,set2);
       int set03 = judgeFinder.findJudge(C,set3);
       int set04 = judgeFinder.findJudge(A,set4);
       int set05 = judgeFinder.findJudge(A,set5);

       System.out.println("set1 "+ set01);
       System.out.println("set2 "+ set02);
       System.out.println("set3 "+ set03);
       System.out.println("set4 "+ set04);
       System.out.println("set5 "+ set05);
   }
}