package Graphs2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import Graphs2.CycleInUndirectedGraph.Edge;
import Graphs2.CycleInUndirectedGraph.pair;



public class CycleInUndirectedGraphUsingDfs {
	static class Edge{
		   int vertex;
		   int nbr;
			Edge(int vertex,int nbr)
			{ this.vertex=vertex;
			   this.nbr=nbr;
				
			}
		}
		static class pair{
			int parent;
			int nbr;
			pair(int parent,int nbr)
			{
				this.parent=parent;
				this.nbr=nbr;
			}
		}

		public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int vertices=Integer.parseInt(br.readLine());
		ArrayList<Edge> graph[]=new ArrayList[vertices+1];
		for(int i=0;i<vertices+1;i++) 
			graph[i]=new ArrayList<>();
		int edges=Integer.parseInt(br.readLine());
		for(int i=0;i<edges;i++) {
		String parts[] =br.readLine().split(" ");
		int v1=Integer.parseInt(parts[0]);
		int v2=Integer.parseInt(parts[1]);
		graph[v1].add(new Edge(v1,v2));
		graph[v2].add(new Edge(v2,v1));
		}
	
		boolean visited[]=new boolean[vertices+1];
		for(int i=0;i<=vertices;i++)
		{ if(visited[i]==false) { 
		      boolean b= isCycleExistDfs(graph,i,-1, visited);
		      if(b==true) {
		    	  System.out.print("There exist a cycle");
		      return;
		      }
		   } 
		}
		System.out.println("there does not exist a cycle");
		}
public static boolean isCycleExistDfs(ArrayList<Edge>[] graph,int src,int parent,boolean[] visited) {
	visited[src]=true;
	for(Edge e:graph[src]) {
		if(visited[e.nbr]==false) {
			visited[e.nbr]=true;
			boolean cycle=isCycleExistDfs(graph,e.nbr,src,visited);
			if(cycle==true)
				return true;
		}
		else if(e.nbr!=parent)
			return true;
	}
	
	
	return false;
}
}


/*
 input
5
5
0 1
0 2
1 3
1 4
2 3
output
There exist a cycle

4
3
1 2
1 4
2 3
there does not exist a cycle

11
10
1 2
2 4
3 5
5 6
5 10
6 7
7 8
8 9
8 11
9 10
There exist a cycle
 */
