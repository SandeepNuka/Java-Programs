package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

import Graphs.findAllPaths.Edge;

public class HamiltonyonPathOrHamiltonyonCycle {
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
		int src=Integer.parseInt(br.readLine());
		HashSet<Integer> hs=new HashSet<>();
		findpathsSrcToDes(graph,src,hs,src+"",src);
		}
   public static void findpathsSrcToDes(ArrayList<Edge>[] graph,int src,HashSet<Integer> hs,String psf,int osrc){
      
	   if(hs.size()==graph.length-1) {
    	   boolean cycle=false;
    	   for(Edge es:graph[src]) {
    		   if(es.nbr==osrc) {
    			   cycle=true;
    		   break;}
    	            }
    	   if(cycle==true)
    		   System.out.println("this is hamiltonyon cycle"+psf);
    	   else
    		   System.out.println("this is hamiltonyon path"+psf);
    	 
           }
         
       hs.add(src);
       for(Edge e:graph[src]) {
    	   if(hs.contains(e.nbr)==false)
    		   findpathsSrcToDes(graph,e.nbr,hs,psf+e.nbr,osrc);
       }
       hs.remove(src);
       }
   

}

/* 
 input
 7
9
0 1 10
0 3 10
1 2 10
2 3 10
3 4 10
2 5 10
4 5 10
4 6 10
5 6 10
0
output
this is hamiltonyon path0123456
this is hamiltonyon path0123465
this is hamiltonyon cycle0125643
this is hamiltonyon cycle0346521
 */
