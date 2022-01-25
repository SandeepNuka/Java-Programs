package Graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class DetectingACycleInAGraph {
	static class Edge{
	   int vertex;
		Edge(int vertex)
		{ this.vertex=vertex;
			
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
	ArrayList<Edge> graph[]=new ArrayList[vertices];
	for(int i=0;i<vertices;i++) 
		graph[i]=new ArrayList<>();
	int edges=Integer.parseInt(br.readLine());
	for(int i=0;i<edges;i++) {
	String parts[] =br.readLine().split(" ");
	int v1=Integer.parseInt(parts[0]);
	int v2=Integer.parseInt(parts[1]);
	graph[v1].add(new Edge(v2));
	graph[v2].add(new Edge(v1));
	}
	Queue<pair> q=new LinkedList<>();
	boolean visited[]=new boolean[vertices];
	for(int i=0;i<vertices;i++)
	{ if(visited[i]==false) { 
	      boolean b= isCycleExist(graph,i,visited,q);
	      if(b==true) {
	    	  System.out.print("There exist a cycle");
	      return;
	      }
	   } 
	}
	System.out.println("there does not exist a cycle");
	}
public static boolean isCycleExist(ArrayList<Edge> graph[],int src,boolean visited[],Queue<pair> q) {
	
	q.add(new pair(0,src));
	visited[src]=true;
	while(!q.isEmpty())
	{
		pair parent=q.remove();
		for(Edge es:graph[parent.nbr]) {
			if(visited[es.vertex]==false)
			{ visited[es.vertex]=true;
			q.add(new pair(parent.nbr,es.vertex));
			}
			else
			{ if(es.vertex!=parent.parent) {
				   return true;
			}
			}
			
		}
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
input
5
4
0 1
0 2
1 4
1 3
output
there does not exist a cycle
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
*/