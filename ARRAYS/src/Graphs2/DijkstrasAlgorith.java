package Graphs2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class DijkstrasAlgorith {
	static class Edge{
		int vertex;
		int nbr;
		int wt;
		Edge(int vertex,int nbr,int wt)
		{
			this.vertex=vertex;
			this.nbr=nbr;
			this.wt=wt;
		}
	}
	static class pair implements Comparable<pair>{
		int weight;
		int vert;
		pair(int weight,int vert)
		{
			this.weight=weight;
			this.vert=vert;
		}
		public int compareTo(pair o) {
		      return this.weight-o.weight;}
	}
	

	public static void main(String[] args) throws Exception {
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
	int wt=Integer.parseInt(parts[2]);
	graph[v1].add(new Edge(v1,v2,wt));
	graph[v2].add(new Edge(v2,v1,wt));
	}
	PriorityQueue<pair> pq=new PriorityQueue<>();
	int distance[]=new int[vertices+1];
	Arrays.fill(distance, 2000);
	shortestDistanceFromSrcToEveryNode(graph,0,pq,distance);
	}
public  static void shortestDistanceFromSrcToEveryNode(ArrayList<Edge>[] graph,int src, PriorityQueue<pair> pq,
			int[] distance) {
	     distance[src]=0;
	     pq.add(new pair(0,src));
	     while(!pq.isEmpty())
	     { pair p=pq.poll();
	        for(Edge e:graph[p.vert]) {
	        	if(e.wt+distance[p.vert]<distance[e.nbr]) {
	        		distance[e.nbr]=e.wt+distance[p.vert];
	        		pq.add(new pair(distance[e.nbr],e.nbr));
	        	}
	        }
	   
	    		
	     }
	
	     for(int j=0;j<distance.length;j++)
	    	 System.out.print(distance[j]+" ");
}
}

/*
 input
9
14
0 1 4
0 7 8
1 2 8
1 7 11
2 3 7
2 8 2
2 5 4
3 4 9
3 5 14
4 5 10
5 6 2
6 7 1
6 8 6
7 8 7
output
0 4 12 19 21 11 9 8 14  distance from source to every other node

input
7
8
0 1 2
0 2 3
1 3 0
2 3 3
3 4 1
4 5 6
4 6 8
5 6 5
output
0 2 3 2 3 9 11 

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
output
0 2 6 7 17 22 19 2000 
 */
