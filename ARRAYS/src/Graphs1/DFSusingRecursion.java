package Graphs;
import java.util.*;
import java.io.*;

public class DFSusingRecursion {
	static class Edge{
		int vertex;
		int nbr;
		Edge(int vertex,int nbr)
		{
			this.vertex=vertex;
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
	graph[v1].add(new Edge(v1,v2));
	graph[v2].add(new Edge(v2,v1));
	}
	boolean visited[] =new boolean[vertices];
	for(int i=0;i<vertices;i++)
		if(visited[i]==false)
			dfs(graph,i,visited);
   
	}
	public static void dfs(ArrayList<Edge> graph[],int src,boolean visited[]) {
		visited[src]=true;
		System.out.print("->"+src);
		for(Edge e:graph[src])
		{ if(visited[e.nbr]==false)
		{    dfs(graph,e.nbr,visited);
			
		}
			
		}
		
	}

}

/*
input 5
4
0 1
0 2
1 3
1 4
output
->0->1->3->4->2

input
7
11
0 1
0 3
0 4
1 2
1 4
2 4
2 5
2 6
3 4
4 5
5 6
output
->0->1->2->4->3->5->6
*/