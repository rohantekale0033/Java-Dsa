package graph;

import java.util.ArrayList;
 
public class Dfs {
	
	static void dfs(ArrayList<ArrayList<Integer>> graph,
            boolean[] visited,
            int current){
            
		    visited[current]=true;
		    
		    System.out.println(current);
		    
		    for(int neighbour:graph.get(current)) {
		    	if(!visited[neighbour]) {
		    		dfs(graph, visited, neighbour);
		    	}
		    }
            }

	public static void main(String[] args) {
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
		
		 
		boolean visited[]=new boolean[4];
		dfs(graph, visited, 0);
		 
			
		}
		
		
		

	}


