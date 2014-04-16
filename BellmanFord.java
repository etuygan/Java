
import java.util.Arrays;
import java.util.Vector;
import java.util.Scanner;

import java.util.Scanner;

public class BellmanFord { 
	
	public static int INF = Integer.MAX_VALUE;

public static void bellmanFord(int nnodes, String[] edges, int source, int [][] distances) {

	int[] distance = new int[nnodes]; //distances from the main source to all other nodes
     
    Arrays.fill(distance, INF); //all distances are initiated to infinity
     
    distance[source] = 0; //distance of main source to itself is 0

    for (int i = 0; i < nnodes; ++i){ // relax every edge in 'edges'
    	for (int j = 0; j < edges.length; ++j) {
          
    		// SOURCE == edges.get(j).source
    		if (distances[i][j] == INF) //there's no shorter path from main source to DESTINATION through SOURCE
    			continue;
            
    		// newDistance = distance from main source to DESTINATION through SOURCE
    		int newDistance = distances[i][j] + distance[i];
            
    		// DESTINATION == edges.get(j).destination)
    		if (newDistance < distances[i][j])
    			distances[i][j] = newDistance;
             }//for
    }//for
    for (int i = 0; i < nnodes; ++i){
    	for (int j = 0; j < edges.length; ++j){
    		// (distance[edges.get(i).destination] > distance[edges.get(i).source] + edges.get(i).weight) there's a negative edge weight cycle in the graph
    		if (distance[i] != INF && distances[i][j] > distances[i][j] + distance[i]) {
    			System.out.println("Cycles detected!");
    			return;
    	}//if
        }//for
    }//for
    // outputs the distances from the main source node to all other nodes of the graph
    for (int i = 0; i < edges.length; ++i)
    	for (int m = 0; m < distance.length; ++m){
    	 if (distance[i] == INF)
    		 System.out.println("There's no path between " + edges[i] + " and " + edges[m]);
    	 else
    		 System.out.println("The Longest distance between nodes " + edges[i]+ " and " + edges[m] + " is " + distances[i][m]);
    }//for
    }//method

public static void main(String[] args) {
	
	BellmanFord b = new BellmanFord();
	
	//b.bellmanFord(Integer.parseInt(args[0]), args[1], Integer.parseInt(args[2]), Integer.parseInt(args[3]));
	
	String[] edges = {"a","b","c","d","e"};
	int nnodes = 5;
	int source = 2;
	int[][] distances = {{0,2,3,0,0},{1,0,2,0,0},{0,1,0,0,-4},{0,2,3,0,1},{1,2,1,0,0}};
	
	System.out.println("Nodes:");
	Scanner scanIn = new Scanner(System.in);
	
		int N = scanIn.nextInt(); // Node numbers
		String[] E = new String[N]; // Edge names
		
		// Assigning edge names
		int count = N - 1;
		  for (int i = 0; i <= count; i++)
		  {
			  System.out.println("Edge-" + (i + 1) + " Node Name:");
			  E[i] = scanIn.next();
		  }
		  
		int[][] D = new int[N][N]; // Distances
		
		// Assigning distances
		int dCount = N -1;
		int jCount = N -1;
			for (int i = 0; i <= dCount; i++)
			{
				
				for (int j = 0; j <= jCount; j++ )
				{
					System.out.println("Source Node-" + (i + 1) + " Node Number: " + (j+1));
					D[i][j] = scanIn.nextInt();
					
				}
			}
			
		int S = 0; // Source
		System.out.println("Please choose a source: ");
		S = scanIn.nextInt();
		
		
		
		  
	scanIn.close();  
	
		
	
     b.bellmanFord(N, E, source, distances);
    
}
}//class
