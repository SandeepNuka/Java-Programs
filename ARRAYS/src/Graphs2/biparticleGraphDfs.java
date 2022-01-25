package Graphs2;
// it this code does not work properly so dont use

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import Graphs2.biparticleGraphBfs.Edge;

public class biparticleGraphDfs {
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
		
		for(int i=0;i<=vertices;i++)
		{  if(color[i]==-1) {
		   if(!isGraphBipartileDfs(graph,i,color)) {
				System.out.println("the graph is not bipartile");
			    return;
			                                         }
		}
			
		}
		System.out.println("the graph is bipartile graph");
		}
public static boolean isGraphBipartileDfs(ArrayList<Edge> graph[],int  src,int color[]) {
	if(color[src]==-1)
		color[src]=1;
	for(Edge e:graph[src]) {
		if(color[e.nbr]==-1) {
			color[e.nbr]=1-color[src];
			if(!isGraphBipartileDfs(graph,e.nbr,color)) {
				return false;
				
			}
			else if(color[e.nbr]==color[src]) 
			return false;
	}
	}
	
	return true;	
}

}



/*
 * input
8
7
1 2
2 3
4 5
4 7
5 6
6 8
7 8
output
the graph is not bipartile

 */
