package Linkedlist;

 public class Linkedlist {
     class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node Tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(Head == null){
            Head= Tail= newNode;
            return;
        }
        size++;
        newNode.next = Head;
        Head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(Head == null){
            Head= Tail= newNode;
            return; 
        }
        Tail.next = newNode;
        newNode = Tail;
        size++;
    }

    public void print(){
       
        if(Head == null){
            System.out.println("null");
            return;
        }

        Node temp = Head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void removeFirst(){

        if(Head == null || Head.next == null){
            Head = Tail = null;
            System.out.println("List is empty");
            return;
        }
        Node temp = Head;
        Head = temp.next;
        size--;
    }

    public void removeLast(){
        if(Head == null || Head.next == null){
           System.out.println("Empty list");
           return;
        }
        Node temp = Head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        size--;
        return;
    }
    public void reversell(){
        Node curr=Head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Head = prev;
    }

    public static Node findmidNode(Node Head){
        Node slow = Head;
        Node fast= Head;
        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Boolean checkPalindrom(){

        if(Head==null || Head.next==null){
            return true;
         }

        // get mid
        Node mid = findmidNode(Head);
        // reverse the ll
        Node curr= mid;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = Head;
        // check for palindrome

        while(right !=null){
            if(right.data != left.data){
                return false;
            }
             right= right.next;
            left=left.next;
        }
        return true;
    }

    public Boolean cyclicll(){
        Node fast= Head;
        Node slow=Head;

        while(fast!=null && fast.next!= null){
            slow= slow.next;
            fast= fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    } 

    public void removecycle(){
        boolean cycle = false;
        //detect cycle
        Node slow=Head;
        Node fast=Head;
        while(fast!=null && fast.next!=null){
           slow = slow.next;
           fast= fast.next.next;

           if(slow==fast){
              cycle = true;
              break;
           }
        }

        if(cycle== false){
           return;
        }

        // find meeting point
        slow = Head;
        Node prev = null;

        while(slow != fast){
            prev = fast;
            slow=slow.next;
            fast= fast.next;
        }
        prev.next= null;
    }

    //delete M nodes after n nodes;
    public void deleteNodes(){
        Node fa = Head;
       
    }

    public static void main(String[] args) {
        int m =2;
        int n = 2;
        Linkedlist ll = new Linkedlist();
        ll.print();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.print();
        ll.deleteNodes();
        ll.print();

       
    }
}
