package binarytree;

public class TreeTraversal {

	 public int min=0;
    public int max=0;
	  Node root;

	    TreeTraversal()
	    {
	    	root=null;
	    }
	    void add(int key)
	    {
	    	root=create_Bst(root,key);
	    }

	     Node create_Bst(Node node,int data)
	    {
 	    	if(node==null){
	    	   node= new Node(data);
	    	    return node;
	            }
	    	
	    	 if(data<node.data)
	    	 node.left=create_Bst(node.left,data);
	      
	         else if(data>node.data)
	         node.right=create_Bst(node.right,data);


	     return node;
	    }



	    public void preOrderTraversal(Node node)
	    {
	    	if(node==null)
	    		return;

	    	System.out.print(node.data+" ");
	    	preOrderTraversal(node.left);
	    	preOrderTraversal(node.right);
	    }
	    public   void inOrderTraversal(Node node)
	    {
	    	if(node==null)
	    		return;

	    	inOrderTraversal(node.left);
	    	System.out.print(node.data+" ");
	    	inOrderTraversal(node.right);
	    }

	   
	   void keysearch(int ele)
	   {  
	   	  root=elefinder(root,ele);

	   	    if(root==null)
	   	    	System.out.println("elenot found");
	   	    else
	   	    	System.out.println("elefound");

	   }


	      Node elefinder(Node  node,int ele)
	     {
	     	if(node==null || node.data==ele)
	     		return node;

	     	 if( ele<node.data)
	     	 	return elefinder(node.left,ele);
	     	 else
	     	 	return elefinder(node.right,ele);
	     	 
	     	 
	     }

	    
	    void delete(int key)
	    {
	    	root=requireddel(root,key);
	    }

	    Node requireddel(Node node ,int key)
	    {
	    	  if(node==null)
	    	  	return null;
	    	  else if( key < node.data)
	    	  node.left=  requireddel(node.left,key);
	    	  else if (key > node.data)
	    	  	node.right= requireddel(node.right,key);
	    	  else
	    	  {
	             if(node.left==null)
	               return node.right;

	              else if( node.right==null)
	              	return node.left;


	              node.data=getminimal(node.right);

	                 node.right=requireddel(node.right,node.data);


	    	  }
	    	  return node;
	    }



	     int getminimal(Node node)
	     {
	     	int minimalvalue=node.data;
	     	while(node.left!=null)
	     	{   minimalvalue=node.left.data;
	     		node=node.left;
	     	}
	       return minimalvalue;
	       }
	     
	     
	     void printVerticalLine(Node node,int line_no,int hd)
	     {
	    	 if(node==null)
	    		 return;
	    	  if(hd==line_no)
	    		  System.out.print(node.data+" ");
	    	 printVerticalLine(node.left,line_no,hd-1);
	    	 printVerticalLine(node.right,line_no,hd+1);
	    	 
	     }
          
	     void VerticalOrder(Node node)
	     {
	    	 int line_no;
	    
	    	 findminmax(node,min,max,0);
	    	 for( line_no=min;line_no<=max;line_no++);
	    	 {
	    		 printVerticalLine(node,line_no,0);
	    		 System.out.println("");
	    	 }
	    		 }
	     
	    public void findminmax(Node node,int min,int max,int hd)
	     {
	    	 if(node==null)
	    		 return;
	    	 if(hd<min)
	    		 min=hd;
	    	 else if(hd>max)
	    		 max=hd;
	    	 findminmax(node.right,min,max,hd-1);
	    	 findminmax(node.left,min,max,hd+1);
	    	
	     }


}
