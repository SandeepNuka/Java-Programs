package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

import Graphs.findAllPaths.Edge;

public class SmallestLargestCeilFloorKthlargestpath {

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
	static class pair implements Comparable<pair>{
		int wsf;
		String psf;
		pair(int wsf,String psf){
			this.wsf=wsf;
			this.psf=psf;
		}
		public int compareTo(pair o) {
		      return this.wsf-o.wsf;}
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
		int criteria=Integer.parseInt(br.readLine());
		int k=Integer.parseInt(br.readLine());
		multisolver(graph,src,des,visited,criteria,k,src+"",0);
		System.out.println("smallest path ="+spath+"@a"+swt);
		System.out.println("largest path ="+lpath+"@a"+lwt);
		System.out.println("ceil path(just larger path  than 40 ="+cpath+"@a"+cwt);
		System.out.println("floor path(just smaller path than 40 ="+fpath+"@a"+fwt);
		System.out.println(k+"th larges path ="+pq.peek().psf+"@"+pq.peek().wsf);

}
static String spath;
static int swt=Integer.MAX_VALUE;
static String lpath;
static int  lwt=Integer.MIN_VALUE;
static String cpath;
static int cwt=Integer.MAX_VALUE;
static String fpath;
static int fwt=Integer.MIN_VALUE;
static PriorityQueue<pair> pq=new PriorityQueue<>();
public static void multisolver(ArrayList<Edge>[] graph,int src,int des,boolean visited[],int criteria,int k,String psf,int wt) {
	if(src==des) {
		if(wt<swt)
		{
			swt=wt;
			spath=psf;
		}
		if(wt>lwt)
		{
			lwt=wt;
			lpath=psf;
		}
		if(wt<cwt &&  wt> criteria)
		{
			cwt=wt;
			cpath=psf;
		}
		if(wt>fwt && wt<criteria)
		{
			fwt=wt;
			fpath=psf;
		}
		
	  if(pq.size()<k) {
		pq.add(new pair(wt,psf));  
	  }
	  else
		  if(wt>pq.peek().wsf) {
			  pq.remove();
			  pq.add(new pair(wt,psf));
		  }
	}
		visited[src]=true;
		for(Edge e:graph[src]) {
			if(visited[e.nbr]==false)
				multisolver(graph,e.nbr,des,visited,criteria,k,psf+e.nbr,wt+e.wt);
		}
		visited[src]=false;
	}
	
	
}


/*  ------output-------------
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
0
6
40
3


smallest path =0123456@a38
largest path =0346@a50
ceil path(just larger path  than 40 =03456@a48
floor path(just smaller path than 40 =0123456@a38
3rd larges path=012346@40

*/