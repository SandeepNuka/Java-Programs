package Graphs2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

import Graphs2.cycleinADirectedGraph.Edge;

public class topologicalSort {
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
		ArrayList<Integer> ar=new ArrayList<>();
		Stack<Integer>st=new Stack<>();
		boolean visited[]=new boolean[vertices+1];
		for(int i=0;i<vertices;i++) {
			if(visited[i]==false) {
				topo(graph,i,visited,st);
			}
		}
		while(!st.isEmpty()) {
			ar.add(st.pop());
		}
		System.out.println("topological order i s"+ar);
		}
		
	public static void topo(ArrayList<Edge> graph[],int src,boolean visited[],Stack<Integer> st) {
	    visited[src]=true;
	    for(Edge e:graph[src]) {
	    	if(visited[e.nbr]==false) {
	    		topo(graph,e.nbr,visited,st);
	    	}
	    }
	st.push(src);
	}
}



/*
6
6
2 3
3 1
4 0
4 1
5 0
5 2
topological order i s[5, 4, 2, 3, 1, 0]



*/