package Graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import Graphs.DFSusingRecursion.Edge;

public class BfsUsingQueue {
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
	ArrayList<Edge> graph[]=new ArrayList[vertices+1];
	for(int i=0;i<=vertices;i++) 
		graph[i]=new ArrayList<>();
	int edges=Integer.parseInt(br.readLine());
	for(int i=0;i<edges;i++) {
	String parts[] =br.readLine().split(" ");
	int v1=Integer.parseInt(parts[0]);
	int v2=Integer.parseInt(parts[1]);
	graph[v1].add(new Edge(v1,v2));
	graph[v2].add(new Edge(v2,v1));
	}
	boolean visited[] =new boolean[vertices+1];
	Queue<Edge> q=new LinkedList<>();
	for(int  i=1;i<=vertices;i++)
	{    if(visited[i]==false) {
		    bfs(graph,i,q,visited);
	}
	}
			
	}
	
	public static void bfs(ArrayList<Edge> graph[],int src,Queue<Edge> q,boolean visited[]) {
		q.add(new Edge(src,src));
		visited[src]=true;
		while(!q.isEmpty()) {
			Edge e=q.remove();
			System.out.print("->"+e.nbr);
			for(Edge es:graph[e.nbr])
			{  if(visited[es.nbr]==false) {
				visited[es.nbr]=true;
				 q.add(new Edge(es.vertex,es.nbr));
				 }
				
			}
			
			
		}
		
	}
}

/*
 input 
6
8
1 2
1 3
2 4
2 5
3 5
4 5
4 6
5 6
output
->0->1->2->3->4->5
input
7
6
1 2
2 3
2 7
3 5
7 5
4 6
output
->1->2->3->7->5->4->6
 */
