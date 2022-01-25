package Graphs2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class DfsOfAGraph {
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
		ArrayList<Integer> dfsArray=new ArrayList<>();
		boolean visited[]=new boolean[vertices];
		for(int i=0;i<vertices;i++) {
			if(visited[i]==false) {
				dfs(graph,i,dfsArray,visited);
			}
		}
System.out.println("Dfs Traversal"+dfsArray);
	}
	public static void dfs(ArrayList<Edge>[] graph,int src,ArrayList<Integer> dfsArray,boolean[] visited) {
		visited[src]=true;
		dfsArray.add(src);
		for(Edge e:graph[src]) {
			if(visited[e.nbr]==false) {
				dfs(graph,e.nbr,dfsArray,visited);
				
			}
		}
	}
}


/*
input
7
6
0 1
1 3
1 6
3 5
5 6
2 4
output
Dfs Traversal[0, 1, 3, 5, 6, 2, 4]
*/