package Graphs2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;


/*
 Steps for kosaraju algorithm
 1)sort all the node in order of finishing time(topological sort)
 2)transpose the graph
 3)Dfs according to finishing time
 */

public class kosarajuAlgorithmForStronglyConnectedComponents {
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
		
		}
		kosaraju(graph,vertices);
			

		}
		public static void kosaraju(ArrayList<Edge>graph[],int vertices) {
		int visited[]=new int[vertices];
		Stack<Integer> st=new Stack<Integer>();
		for(int i=0;i<vertices;i++)
			if(visited[i]==0)
				dfs(i,st,graph,visited);
		
		ArrayList<ArrayList<Integer>> transpose=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<vertices;i++)
			transpose.add(new ArrayList<Integer>());
		
		for(int i=0;i<vertices;i++) {
			visited[i]=0;
			for(Edge e:graph[i]) {
				transpose.get(e.nbr).add(i);
			}
		}
		
		
		while(st.size()>0) {
			int node=st.peek();
			st.pop();
			if(visited[node]==0) {
				System.out.print("Scc: ");
				revDfs(node,transpose,visited);
				System.out.println();
			}
		}
		
		}
		
		public static void dfs(int node,Stack<Integer> st,ArrayList<Edge>[] graph,int[] visited) {
			visited[node]=1;
			for(Edge e:graph[node]) {
				if(visited[e.nbr]==0) {
					dfs( e.nbr,st,graph,visited);
				}
			}
			st.push(node);
		}
		
		public static void revDfs(int node,ArrayList<ArrayList<Integer>> transpose,int[] visited) {
			visited[node]=1;
					System.out.print(node+ " ");
			for(Integer it:transpose.get(node)) {
				if(visited[it]==0) {
					revDfs(it,transpose,visited);
				}
			}
		}
}




/*
 input
5
5
0 1
1 2
1 3
2 0
3 4
output
Scc: 0 2 1 
Scc: 3 
Scc: 4 

 */
