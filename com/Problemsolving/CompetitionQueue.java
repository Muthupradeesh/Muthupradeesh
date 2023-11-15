package zsgs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CompetitionQueue {
	static Scanner sc= new Scanner(System.in);
	Queue<Participant> enteringQueue = new LinkedList<>();
	ArrayList<String> arr = new ArrayList<>();
	Timer programTimer=new Timer();
	
	public static void main(String[] args)
	{
		CompetitionQueue cq=new CompetitionQueue();
		cq.start();
		
	}
	public  void start()
	{
		while(true)
		{
			System.out.println("-------------------------------");
			System.out.println("Welcome to the competition");
			System.out.println("-------------------------------");
			System.out.println();
			System.out.println("1==>Add canditate");
			System.out.println("2==>Next canditate");
			System.out.println("3==>Canditate name list");
			System.out.println("4==>finished canditate");
			System.out.println("0==>Exit");
			int choise=sc.nextInt();
			switch(choise)
			{
			case 1:
			{
				System.out.println("Enter Canditate Name:");
         		String name =sc.next();
         		Participant candidate = new Participant(name);
         		enteringQueue.add(candidate);
         		System.out.println(name + " Added Successfully.");
         		
         		 if (enteringQueue.size() == 1) {
                        
                    }
         		 break;
			}
			case 2:
			{
				if(!enteringQueue.isEmpty())
				{
				Participant next=enteringQueue.poll();
				arr.add(next.getName());
                System.out.println("current participant : " + next.getName());
                } 
				else
				{
                 System.out.println("Participant list is Empty");
               }
                 break;
			 }
			case 3:
			{
				if(enteringQueue.isEmpty()) 
				{
         			System.out.println("No Participant in waiting..");
         		}
				else
         		{
         			int i=1;
	         		for(Participant name:enteringQueue) {
	         			System.out.println(i++ +"."+ name.getName());
	         		}
         		}
         		break;
			}
			case 4:
			{
				if(arr.isEmpty()) 
				{
         			System.out.println("no candidate in finished interviw..");
         		}
				else 
         		{
         			int i=1;
         			for(String str: arr)
         			{
         				System.out.println((i++) +"==>"+ str);
         			}
         		 
			  }
		    }
			case 0:
			{
				 System.out.println("Exiting the application.");
                 programTimer.cancel();
                 System.exit(0);
			}
			default:
			{
				System.out.println("Invalid Input...");
			}
	}

  }
 }
	public void programStart()
	{
		programTimer.schedule(new TimerTask()
		{

			public void run() 
			{
				 if (!enteringQueue.isEmpty()) 
				 {
	                    Participant nextCandidate = enteringQueue.poll();
	                    arr.add(nextCandidate.getName());
	                    System.out.println("finished" + nextCandidate.getName() );
	                    if (!enteringQueue.isEmpty())
	                    {
	                        programStart();
	                    }
	               }
				
			}
			
		}, 30000);
	}
	
}

