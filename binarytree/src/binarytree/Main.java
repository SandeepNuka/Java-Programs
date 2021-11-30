package binarytree;

public class Main {

	public static void main(String[] args) {
		TreeTraversal tree=new TreeTraversal();

		tree.add(50);
		tree.add(90);
        tree.add(80);
		tree.add(45);
		tree.add(26);
		tree.add(83);
		tree.add(55);
		tree.add(29);
		tree.add(88);
		tree.add(120);

		System.out.println("preOrderTraversal");
		tree.preOrderTraversal(tree.root);
		System.out.println("\n");
		
		tree.VerticalOrder(tree.root);
    
	}

	

}
