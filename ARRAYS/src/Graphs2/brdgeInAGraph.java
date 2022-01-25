package Graphs2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class brdgeInAGraph {
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
		for(int i=0;i<vertices;i++) {
			if(visited[i]==0) {
				dfs(graph,i,-1,timer,visited,timeOfInsertion,lowerInsertionTime);
			}
		}
		for(int i=0;i<vertices;i++)
		System.out.print(visited[i]);
		System.out.println();
		for(int i=0;i<vertices;i++)
		System.out.print(timeOfInsertion[i]);
		System.out.println();
		for(int i=0;i<vertices;i++)
		System.out.print(lowerInsertionTime[i]);
		}
		
public static void dfs(ArrayList<Edge> graph[],int node,int parent,int timer,int [] visited,int [] timeOfInsertion,int[] lowerInsertionTime) {
	visited[node]=1;
	timeOfInsertion[node]=timer;
			lowerInsertionTime[node]=timer;
			timer++;
	for(Edge e:graph[node]) {
		if(e.nbr==parent)
			continue;
	 
	if(visited[e.nbr]==0) {
		dfs(graph,e.nbr,node,timer,visited,timeOfInsertion,lowerInsertionTime);
		lowerInsertionTime[node]=Math.min(lowerInsertionTime[e.nbr], lowerInsertionTime[node]);
	if(lowerInsertionTime[e.nbr]>timeOfInsertion[node]) {
		System.out.println("The bride edge are"+node+"--"+e.nbr);
	}
	}
	else {
   lowerInsertionTime[node]=Math.min(timeOfInsertion[e.nbr], lowerInsertionTime[node]);
	
	}
} 
	
	return;
}

}

/*
 * input
11
13
0 1
0 3
1 2
2 3
3 4
4 5
4 6
5 7
6 7
7 8
8 9
8 10
9 10
output
The bride edge are7--8
The bride edge are3--4
11111111111
01234576789
00004444777



6
6
0 1
1 2
2 3
3 4
3 5
4 5
The bride edge are2--3
The bride edge are1--2
The bride edge are0--1
111111
012345
012333
 */


