package Graphs2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import Graphs2.CycleInUndirectedGraphUsingDfs.Edge;

public class biparticleGraphBfs {
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
	
		int  color[]=new int [vertices+1];
		Arrays.fill(color, -1);
		Queue<Integer> q=new LinkedList<>();
		for(int i=0;i<=vertices;i++)
		{ if(color[i]==-1) { 
		      boolean b= isGraphBipartileBfs(graph,i, color,q);
		      if(b==false) {
		    	  System.out.print("this is not a biparticle graph");
		      return;
		      }
		   } 
		}
		System.out.println("this is bipartile graph");
		}
public static boolean isGraphBipartileBfs(ArrayList<Edge> graph[],int src,int color[],Queue<Integer> q ) {
	color[src]=1;
	q.add(src);
	while(!q.isEmpty()) {
	Integer node=q.remove();
	for(Edge e:graph[node]) {
		if(color[e.nbr]==-1) {
			color[e.nbr]=1-color[node];
			q.add(e.nbr);
		}
		else if(color[e.nbr]==color[node]) 
		return false;
	}
	}
	return true;
}
}
/*
input
8
8
1 2
2 3
2 7
3 4
4 5
5 6
5 8
6 7
output
this is bipartile graph

7
7
1 2
2 3
2 4
3 6
4 5
5 6
6 7
this is not a biparticle graph
7
6
1 2
2 3
4 5
4 7
5 6
6 7
this is bipartile graph

8
7
1 2
2 3
4 5
4 7
5 6
6 8
7 8
this is not a biparticle graph


 */
