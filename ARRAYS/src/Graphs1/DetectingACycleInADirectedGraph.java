package Graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectingACycleInADirectedGraph {
	static class Edge{
		   int vertex;
			Edge(int vertex)
			{ this.vertex=vertex;
				
			}
		}
		
		public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int vertices=Integer.parseInt(br.readLine());
		ArrayList<Edge> graph[]=new ArrayList[vertices];
		for(int i=0;i<vertices;i++) 
			graph[i]=new ArrayList<>();
		int edges=Integer.parseInt(br.readLine());
		for(int i=0;i<edges;i++) {
		String parts[] =br.readLine().split(" ");
		int v1=Integer.parseInt(parts[0]);
		int v2=Integer.parseInt(parts[1]);
		graph[v1].add(new Edge(v2));
		}
		boolean visited[]=new boolean[vertices];
		
		
		      boolean b= isCycleExist(graph,0,visited);
		      if(b==true) {
		    	  System.out.print("There exist a cycle");
		      return;
		      }
		   
		
		System.out.println("there does not exist a cycle");
		}
	public static boolean isCycleExist(ArrayList<Edge> graph[],int src,boolean visited[]) {
		
	
		visited[src]=true;
		

			for(Edge es:graph[src]) {
				if(visited[es.vertex]==false)
				{ boolean s=isCycleExist(graph,es.vertex,visited);
				   if(s==true)
					   return true;
				} 
				else if(visited[es.vertex]==true)
					return true;
					    
			visited[src]=false;		
			}	
		return false;
			
		
	}
}


/*
  input
 
4
4
0 1
0 2
1 2
2 3
output
there does not exist a cycle

input
4
6
0 1
0 2
1 2
2 0
2 3
3 3
output
there exist a cycle

6
7
0 1
1 2
1 5
2 3
3 4
4 0
4 1
There exist a cycle

*/