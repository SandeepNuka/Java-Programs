package Graphs2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class bfsOfAGraph {
	static class Edge{ // for edge for edge object
		int src;
		int nbr;
		
		Edge(int src,int nbr){
			this.src=src;
			this.nbr=nbr;
			
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int vertices=Integer.parseInt(br.readLine());
		ArrayList<Edge>[] graph=new ArrayList[vertices]; // creating arraylist array of type edge size of vertices
		for(int i=0;i<vertices;i++)
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
		ArrayList<Integer> bfsArray=new ArrayList<>();
		boolean visited[]=new boolean[vertices];
		Queue<Integer> q=new LinkedList<>();
		for(int i=0;i<vertices;i++) {
			if(visited[i]==false)
			{
			 dfs(graph,i,bfsArray,q,visited);	
			}
		}
System.out.println("Bfs Traversal is"+bfsArray);
}
	public static void dfs(ArrayList<Edge>[] graph,int src,ArrayList<Integer> bfsArray,Queue<Integer> q,boolean visited[]) {
		q.add(src);
		visited[src]=true;
		while(!q.isEmpty()) {
			Integer node=q.poll();
			bfsArray.add(node);
			for(Edge e:graph[node]) {
				if(visited[e.nbr]==false)
				{ q.add(e.nbr);
				  visited[e.nbr]=true;
					
				}
			}
			
		}
			
	}
}



/*
 
input
7
6
0 1
1 2
1 6
2 4
4 6
3 5
output
Bfs Traversal is[0, 1, 2, 6, 4, 3, 5]

*/