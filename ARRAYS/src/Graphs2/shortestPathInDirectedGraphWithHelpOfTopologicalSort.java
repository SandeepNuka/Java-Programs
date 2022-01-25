package Graphs2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class shortestPathInDirectedGraphWithHelpOfTopologicalSort {
	static class Edge{
		   int vertex;
		   int nbr;
		   int wt;
		   
			Edge(int vertex,int nbr,int wt)
			{ this.vertex=vertex;
			   this.nbr=nbr;
			   this.wt=wt;
			   
				
			}
		}
		

		public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int vertices=Integer.parseInt(br.readLine());
		ArrayList<Edge> graph[]=new ArrayList[vertices+1];
		for(int i=0;i<=vertices;i++) 
			graph[i]=new ArrayList<>();
		int edges=Integer.parseInt(br.readLine());
		for(int i=0;i<edges;i++) {
		String parts[] =br.readLine().split(" ");
		int v1=Integer.parseInt(parts[0]);
		int v2=Integer.parseInt(parts[1]);
		int wt=Integer.parseInt(parts[2]);
		graph[v1].add(new Edge(v1,v2,wt));                                       
	
		}
		Queue<Integer> q=new LinkedList<>();
		Stack<Integer>st=new Stack<>();
		ArrayList<Integer> ar=new ArrayList<>();
	   int distance[]=new int [vertices];
	   boolean visited[]=new boolean[vertices];
	   for(int i=0;i<vertices;i++)
		   distance[i]=Integer.MAX_VALUE;
	   
	   topologicalSort(graph,0,st,visited);// here we get topologica order in stack
		  shortestPath(graph,st.pop(),distance,q);
	  for(int i=0;i<vertices;i++) {
		  ar.add(distance[i]);
	  }
	  System.out.println("the distance from source to everyothernode is"+ar);
}
public static void shortestPath(ArrayList<Edge> graph[],int src,int distance[],Queue<Integer> q) {
	distance[src]=0;
	q.add(src);
	while(!q.isEmpty()) {
		Integer node=q.remove();
		for(Edge e:graph[node]) {
				if(distance[node]+e.wt<distance[e.nbr]) { 
					distance[e.nbr]=distance[node]+e.wt;
					q.add(e.nbr);

			}
			
		}
	}
}
		
		
		
public static void topologicalSort(ArrayList<Edge> graph[],int src,Stack<Integer> st,boolean visited[]) {
	visited[src]=true;
	for(Edge e: graph[src]) {
		if(visited[e.nbr]==false) {
		topologicalSort(graph,e.nbr,st,visited);
		}
	}
	st.push(src);
}
}

/*
 * stack outpt for topological order from top to buttom
 6
7
0 1
0 4
1 2
2 3
4 2
4 5
5 3
stack outpt for topological order from top to buttom
[3, 2, 1, 5, 4, 0]

inptut
6
7
0 1 2
0 4 1
1 2 3
2 3 6
4 2 2
4 5 4
5 3 1
output
the distance from source to everyothernode is[0, 2, 3, 6, 1, 5]

 
 7
9
0 1 2
0 2 6
1 3 5
2 3 8
3 5 15
3 4 10
4 5 6
4 6 2
5 6 6
0 2 6 7 17 22 19
 */
