package Graphs;
import java.util.*;
import java.io.*;


public class findAllPaths {
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
		int src=Integer.parseInt(br.readLine());
		int des=Integer.parseInt(br.readLine());
		findpathsSrcToDes(graph,src,des,visited,src+"");
		}
   public static void findpathsSrcToDes(ArrayList<Edge>[] graph,int src,int des,boolean[] visited,String psf){
       
       if(src==des) {
    	 System.out.println(psf);  
    	 return;
           }
       visited[src]=true;
       for(Edge e:graph[src]) {
    	   if(visited[e.nbr]==false)
    		   findpathsSrcToDes(graph,e.nbr,des,visited,psf+e.nbr);
       }
       visited[src]=false;
       }
      
	}


