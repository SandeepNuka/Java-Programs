package Graphs2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class cycleinADirectedGraph {
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
		for(int i=0;i<=vertices;i++) 
			graph[i]=new ArrayList<>();
		int edges=Integer.parseInt(br.readLine());
		for(int i=0;i<edges;i++) {
		String parts[] =br.readLine().split(" ");
		int v1=Integer.parseInt(parts[0]);
		int v2=Integer.parseInt(parts[1]);
		graph[v1].add(new Edge(v1,v2));
		}
	     int visited[]=new int[vertices+1];
	     Arrays.fill(visited, 0);
	     int dfsvisit[]=new int[vertices+1];
	     Arrays.fill(dfsvisit, 0);
	     for(int i=0;i<=vertices;i++) {
	    	 if(visited[i]==0) {
	    		 if(isCycleExistDfs(graph,i,visited,dfsvisit)) {
	    			 System.out.println("this graph contains a cycle");
	    			 return;
	    		 }
	    	 }
	     }
	     System.out.println("this graph does not contain a cycle");
		}
		public static boolean isCycleExistDfs(ArrayList<Edge> graph[],int src,int visited[],int dfsvisit[]) {
			visited[src]=1;
			dfsvisit[src]=1;
			for(Edge e:graph[src]) {
				if(visited[e.nbr]==0) {
					if(isCycleExistDfs(graph,e.nbr,visited,dfsvisit)==true) {
						return true;
					}
				}
				else if(dfsvisit[e.nbr]==1)
					return true;
			}
			dfsvisit[src]=0;
			return false;
		}
}


/*
 
input
9
10
1 2
2 3
3 4
3 6
4 5
6 5
7 2
7 8
8 9
9 7
output
this graph contains a cycle


4
6
0 1
0 2
1 2
2 0
2 3
3 3
this graph contains a cycle

4
4
0 1
0 2
1 2
2 3
this graph does not contain a cycle



*/