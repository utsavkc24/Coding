/*Linked List*/
public class List {
    public static void main(String[] args) {
        LinkedListNode listNode = new LinkedListNode();
        ListNode head =  listNode.insertAtBeg(0);
        for (int i = 1; i <= 10; i++)
            listNode.insertAtEnd(head,i);

        //listNode.reverseLinkedList();
        //listNode.printList(head);
        listNode.segregateEvenOdd(head);
        listNode.printList(head);
        //System.out.println("The middle element in linked list is : " + listNode.printMiddle());
        //System.out.println("The nth element from last in linked list is : " + listNode.printNthFromEnd(2));

    }
}

class ListNode {
    int data;
    ListNode next;

    ListNode(int x) {
        data = x;
    }
}

class LinkedListNode {

    public ListNode insertAtBeg(int value) {
        ListNode head = null;
        ListNode listNode = new ListNode(value);
        listNode.next = head;
        head = listNode;

        return head;
    }

    public void insertAtEnd(ListNode head,int value) {
        ListNode listNode = new ListNode(value);

        if (head == null) {
            head = listNode;
        } else {
            ListNode curr = head;

            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = listNode;
        }

    }

    public void printList(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            if (curr.next == null)
                System.out.print(curr.data);
            else
            System.out.print(curr.data + "->");

            curr = curr.next;
        }
        System.out.println();
    }
    public int printMiddle(ListNode head){
        if (head == null)
            return -1;
        ListNode turtle = head;
        ListNode rabbit = head;

        while (rabbit != null && rabbit.next != null){
            turtle = turtle.next;
            rabbit = rabbit.next.next;
        }
        return turtle.data;
    }
    public int printNthFromEnd(ListNode head, int n){
        if (head == null){
            return -1;
        }
        ListNode first = head;
        ListNode second = head;

        for (int i = 0; i < n; i++){
            if (first == null)
                return -1;

            first = first.next;
        }


        while (first != null){
            first = first.next;
            second = second.next;
        }

        return second.data;
    }
    public void reverseLinkedList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }
    public void segregateEvenOdd(ListNode head){
        ListNode eS,eE,oS,oE;
        eS = eE = oS = oE = head;

        ListNode curr = head;
        while (curr.next != null){
            int x = curr.data;

            if (x % 2 == 0){
                if (eS == null){
                    eS = curr;
                    eE = eS;
                }else {
                    eE.next = curr;
                    eE = eE.next;
                }
            }else {
                if (oS == null){
                    oS = curr;
                    oE = oS;
                }else{
                    oE.next = curr;
                    oE = oE.next;
                }
                curr = curr.next;
            }

            if (eS == null || oS == null){
                return;
            }
            eE.next = oS;
            oS.next = null;
        }
    }
}
