package graph;

 
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BfsAlgorithm {

	public static void main(String[] args) {
		//create graph 
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		for(int i =0;i<4;i++) {
			graph.add(new ArrayList<>());
		}
		
		graph.get(0).add(1);
		graph.get(0).add(2);
		
		graph.get(1).add(0);
		graph.get(1).add(3);
		
		graph.get(2).add(0);
		
		graph.get(3).add(1);
	   
	   Queue<Integer> queue = new LinkedList<>();
       boolean visited[]=new boolean[5];
       queue.add(0);
       visited[0]=true;
       
       while(!queue.isEmpty()) {
    	   int current=queue.remove();
    	   System.out.println(current);
    	   
    	   for(int neighbour : graph.get(current)) {
    		   if(!visited[neighbour]) {
    			   visited[neighbour]=true;
    			   queue.add(neighbour);
    		   }
    	   }
    	   
       }
        
	}

}
