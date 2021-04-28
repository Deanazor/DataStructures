
package redblacktree;

import java.util.Scanner;


public class RedBlackTree {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Creating object of RedBlack Tree */
        RBTree rbt = new RBTree(Integer.MIN_VALUE); 
        System.out.println("Red Black Tree Test\n");          
        char ch;
        /*  Perform tree operations  */
        int choice =0;
        do       
        {
            System.out.println("\nRed Black Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. search");
            System.out.println("3. count nodes");
            System.out.println("4. check empty");
            System.out.println("5. clear tree");
            System.out.println("6. exit");
 
            choice = scan.nextInt(); 
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                rbt.insert( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to search");
                System.out.println("Search result : "+ rbt.search( scan.nextInt() ));
                break;                                          
            case 3 : 
                System.out.println("Nodes = "+ rbt.countNodes());
                break;     
            case 4 : 
                System.out.println("Empty status = "+ rbt.isEmpty());
                break;     
            case 5 : 
                System.out.println("\nTree Cleared");
                rbt.makeEmpty();
                break;         
            case 6 : 
                break;
            default : 
                System.out.println("Wrong Entry \n ");
                break;    
            }
            /*  Display tree  */
            System.out.print("\nPost order : ");
            rbt.postorder();
            System.out.print("\nPre order : ");
            rbt.preorder();
            System.out.print("\nIn order : ");
            rbt.inorder(); 
 
            
        } while (choice < 6); 
        System.out.println("Arief Pujo Arianto");
        System.out.println("18/430253/PA/18766");
    }
    
    
}
