package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Graphs.isGraphConnected.Edge;

public class perFectFriends {
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
		int pairs=0;
		for(int i=0;i<comps.size();i++)
			for(int  j=i+1;j<comps.size();j++)
				pairs=pairs+comps.get(i).size()*comps.get(j).size();
		System.out.println("perfect friends pairs  ="+pairs);
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
 input
 7
5
0 1 10
2 3 10
4 5 10
5 6 10
4 6 10
output
perfect friends pairs  =16

 */
