package Graphs2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class CycleInUndirectedGraph {
	static class Edge{ // for edge for edge object
		int src;
		int nbr;
		
		Edge(int src,int nbr){
			this.src=src;
			this.nbr=nbr;
			
		}
	}
	static class pair {
		int node;
		int parent;
		pair(int node,int parent){
			this.node=node;
			this.parent=parent;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int vertices=Integer.parseInt(br.readLine());
		ArrayList<Edge>[] graph=new ArrayList[vertices+1]; // creating arraylist array of type edge size of vertices
		for(int i=0;i<vertices+1;i++)
			graph[i]=new ArrayList<>();// every position of array we are creating  empty arraylist
		int edges=Integer.parseInt(br.readLine());
		for(int i=0;i<edges;i++)
		{
		 String[] parts=br.readLine().split(" ");
		 int v1=Integer.parseInt(parts[0]);
		 int v2=Integer.parseInt(parts[1]);
		 graph[v1].add(new Edge(v1,v2));
		 graph[v2].add(new Edge(v2,v1));
		}
		boolean visited[]=new boolean[vertices+1];
		Queue<pair> p=new LinkedList();
		for(int i=0;i<vertices;i++) {
			if(visited[i]==false) {
				boolean cycle=isCycleExist(graph,i,p,visited);
				if(cycle==true) {
					System.out.println("Cycle present in this graph");
					return;
				}
			}
		}
		System.out.println("Cycle not present in this graph");
	}
	public static boolean isCycleExist(ArrayList<Edge>[] graph,int src,Queue<pair> q,boolean[] visited) {
		q.add(new pair(src,-1));
		visited[src]=true;
		while(!q.isEmpty()) {
			
		pair pa=q.remove();
		int node=pa.node;
		int parent=pa.parent;
			for(Edge e:graph[node]) {
				if(visited[e.nbr]==false) {
					visited[e.nbr]=true;
					q.add(new pair(e.nbr,node));
				}
				else if(parent!=e.nbr)
					return true;
			}
		}
		
		
		
		return false;
	}
}


/*
 input
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
output
Cycle present in this graph

5
5
0 1
0 2
1 3
1 4
2 3
Cycle present in this graph

4
3
1 2
1 4
2 3
Cycle not present in this graph


*/