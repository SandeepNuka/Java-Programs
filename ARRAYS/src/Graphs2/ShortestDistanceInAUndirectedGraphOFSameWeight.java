package Graphs2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import Graphs2.topologicalSort.Edge;

public class ShortestDistanceInAUndirectedGraphOFSameWeight {
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
		graph[v2].add(new Edge(v2,v1,wt));
		}
		Queue<Integer> q=new LinkedList<>();
		ArrayList<Integer> ar=new ArrayList<>();
	   int distance[]=new int [vertices+1];
	   for(int i=0;i<=vertices;i++)
		   distance[i]=Integer.MAX_VALUE;
	   shortestPath(graph,1,q,distance);
	   for(int i=1;i<=vertices;i++)
	   { ar.add(distance[i]);
	   }
	   System.out.println("distance from src to everynode"+ar);
	   
		}
		public static void shortestPath(ArrayList<Edge>[] graph,int src,Queue<Integer> q,int[] distance) {
			distance[src]=0;
			q.add(src);
			while(!q.isEmpty()) {
				Integer node=q.remove();
				for(Edge e:graph[node]) {
						if(distance[node]+e.wt<distance[e.nbr]) { // here 1 indicates weight of every edge
							distance[e.nbr]=distance[node]+e.wt;
							q.add(e.nbr);
						}
					
				}
			}
			
		}
}


/*

input
9
11
0 1
0 3
1 2
1 3
2 6
3 4
4 5
5 6
6 7
6 8
7 8
output
distance from src to everynode[0, 1, 2, 1, 2, 3, 3, 4, 4]


5
6
1 2 2
1 4 1
2 5 5
2 3 4
3 4 3
3 5 1
distance from src to everynode[0, 2, 4, 1, 5]


*/