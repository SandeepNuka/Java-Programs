package Graphs2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Graphs2.kosarajuAlgorithmForStronglyConnectedComponents.Edge;

public class bellmanFord {
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
		bellmanFordAlgo(graph,0,vertices);
		
		
	}
		private static void bellmanFordAlgo(ArrayList<Edge>[] graph, int src,int vertices) {
			int dis[]=new int[vertices];
			for(int i=0;i<vertices;i++) {
				dis[i]=1000000;
			}
			dis[src]=0;
		for(int i=0;i<vertices;i++) {
			for(int j=0;j<vertices;j++) {
			for(Edge e:graph[j]) {
				if(dis[e.vertex]+e.wt<dis[e.nbr]) {
					dis[e.nbr]=dis[e.vertex]+e.wt;
				}
			}
			}
		}
	int fl=0;
	for(Edge e:graph[0]) {
		if(dis[0]+e.wt<dis[e.nbr]) {
			fl=1;
		System.out.println("Negative cycle");
		break;
		}
	}
	if(fl==0) {
		for(int i=0;i<vertices;i++) {
			System.out.println(i+"  "+dis[i]);
		}
	}
}	
}


/*
 * input
 
6
7
0 1 5
1 2 -2
1 5 -3
2 4 3
3 2 6
3 4 -2
5 3 1
output
0  0
1  5
2  3
3  3
4  1
5  2
*/