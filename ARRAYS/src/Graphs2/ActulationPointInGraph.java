package Graphs2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

import Graphs2.brdgeInAGraph.Edge;

public class ActulationPointInGraph {
	static class Edge{
		   int vertex;
		   int nbr;
			Edge(int vertex,int nbr)
			{ this.vertex=vertex;
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
		int  visited[]=new int[vertices];
		Arrays.fill(visited, 0);
		int timeOfInsertion[]=new int[vertices];
		Arrays.fill(timeOfInsertion, 0);
		int lowerInsertionTime[]=new int[vertices];
		Arrays.fill(lowerInsertionTime, 0);
		int timer=0;
		LinkedHashSet<Integer> hs=new LinkedHashSet<>();
		for(int i=0;i<vertices;i++) {
			if(visited[i]==0) {
				dfs(graph,i,-1,timer,visited,timeOfInsertion,lowerInsertionTime,hs);
			}
		}
		
		System.out.println("Actulation points are"+hs);
		for(int i=0;i<vertices;i++)
		System.out.print(visited[i]);
		System.out.println();
		for(int i=0;i<vertices;i++)
		System.out.print(timeOfInsertion[i]);
		System.out.println();
		for(int i=0;i<vertices;i++)
		System.out.print(lowerInsertionTime[i]);
		}
	public static void dfs(ArrayList<Edge>[] graph,int node,int parent,int timer,int[] visited,int[] timeOfInsertion,int[] lowerInsertionTime,LinkedHashSet<Integer> hs) {
		visited[node]=1;
		timeOfInsertion[node]=lowerInsertionTime[node]=timer++;
		int child=0;// if the grah is connected with different coponents
		
		for(Edge e:graph[node]) {
			if(e.nbr==parent)
				continue;
			if(visited[e.nbr]==0) {
				dfs(graph,e.nbr,node,timer,visited,timeOfInsertion,lowerInsertionTime,hs);
				lowerInsertionTime[node]=Math.min(lowerInsertionTime[node], lowerInsertionTime[e.nbr]);
				
				if(lowerInsertionTime[e.nbr]>=timeOfInsertion[node]&& parent!=-1) {
					hs.add(node);	
				}
				if(lowerInsertionTime[e.nbr]>=timeOfInsertion[node]&& parent==-1)
				child++;
			}
			else
				lowerInsertionTime[node]=Math.min(timeOfInsertion[e.nbr], lowerInsertionTime[node]);
				
			
		}
		if(parent==-1 && child>1)
			hs.add(node);
	}

}


/*
 input
12
14
0 1
0 3
1 2
2 3
3 4
4 5
5 6
5 8
6 7
7 8
7 9
9 10
9 11
10 11
output
Actulation points are[9, 7, 5, 4, 3]
111111111111
0123456788910
000045555888




9
10
0 1
0 5
1 2
1 4
2 3
3 4
5 6
5 8
6 7
7 8
output  if the parett conncted with differnt component
Actulation points are[1, 5, 0]
111111111
012341234
011111111
 */
