package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Graphs.getConnectedComponents.Edge;

public class isGraphConnected {
	static class Edge{ // for edge for edge object
		int src;
		int nbr;
		int wt;
		Edge(int src,int nbr,int wt){
			this.src=src;
			this.nbr=nbr;
			this.wt=wt;
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
		 int wt=Integer.parseInt(parts[2]);
		 graph[v1].add(new Edge(v1,v2,wt));
		 graph[v2].add(new Edge(v2,v1,wt));
		}
		boolean visited[]=new boolean[vertices];
		ArrayList<ArrayList<Integer>> comps= new ArrayList<>();
		for(int i=0;i<vertices;i++) {
			if(visited[i]==false) {
				ArrayList<Integer> comp=new ArrayList<>();
				getAllConnectedComponents(graph,i,visited,comp);
				comps.add(comp);
			}   
		}
		if(comps.size()==1)
			System.out.println("Graph is connected");
		else
			System.out.println("Graph is not conncted");
}
public static void getAllConnectedComponents(ArrayList<Edge>[] graph,int src,boolean visited[],ArrayList<Integer> comp) {
	visited[src]=true;
	comp.add(src);
	for(Edge e:graph[src]) {
		if(visited[e.nbr]==false) {
			getAllConnectedComponents(graph,e.nbr,visited,comp);
			
		}
		
	}
	
	}

}

/*
 intput
 7
5
0 1 10
2 3 10
4 5 10
5 6 10
4 6 10
output
Graph is not conncted

input 
7
8
0 1 10
1 2 10
2 3 10
0 3 40
3 4 2
4 5 3
5 6 3
4 6 8
output
Graph is connected
 */
