import java.util.Scanner;

public class LinkedList
{
    class Node {
        int data;
        Node link;
    }
    private Node first;
    private Scanner sc=new Scanner(System.in);

    public void insertFront()
    {
        Node front;
        System.out.println("Enter an Element");
        int elem=sc.nextInt();
        Node newnode=new Node();
        newnode.data=elem;
        newnode.link=null;
        if(first==null)
        {
            first=newnode;
        }
        else
        {
            newnode.link=first;
            first=newnode;
        }
    }

}