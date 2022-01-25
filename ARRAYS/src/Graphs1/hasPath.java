package Graphs;
import java.util.*;
import java.io.*;


public class hasPath {
	static class Edge{
		int src;
		int nbr;
		int wt;
		Edge(int src,int nbr,int wt){
			this.src=src;
			this.nbr=nbr;
			this.wt=wt;
		}
	}
	private static boolean Haspath;

	public static void main(String[] args) throws Exception{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int vertices=Integer.parseInt( br.readLine());
	  ArrayList<Edge>[] graph =new ArrayList[vertices];
	  for(int i=0;i<vertices;i++)
		  graph[i]=new ArrayList<>();
	  
	  int edges=Integer.parseInt(br.readLine());
	  for(int i=0;i<edges;i++) {
		  String[] parts=br.readLine().split(" ");
		  int v1=Integer.parseInt(parts[0]);
		  int v2=Integer.parseInt(parts[1]);
		  int wt=Integer.parseInt(parts[2]);
		  graph[v1].add(new Edge(v1,v2,wt));
		  graph[v2].add(new Edge(v2,v1,wt));
	  }
	  int src=Integer.parseInt(br.readLine());
	  int des=Integer.parseInt(br.readLine());
	  boolean visited[] =new boolean[vertices];
	  boolean haspathExist=haspath(graph,src,des,visited);
	         if(haspathExist==true)
	        	 System.out.println("path exist");
	         else
	        	 System.out.println("path dooes not exist");
	  }
public static boolean haspath(ArrayList<Edge>[] graph,int src,int des,boolean visited[]) {
	boolean hasnbrpath = false;
	if(src==des)
		return true;
	
	visited[src]=true;
	for(Edge e:graph[src]) {
		 if(visited[e.nbr]==false) {// checking neighbor visited or not 
		   hasnbrpath = haspath(graph,e.nbr,des,visited);
		 if(hasnbrpath==true)
			 return true;
		 }
		 visited[src]=false;
	   }
	return false;
}
	}


