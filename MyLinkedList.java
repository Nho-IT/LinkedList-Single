public class MyLinkedList {
    public static class Node{
        int value;
        Node next;
        Node(int value) {
            this.value = value;
            //Ở đây không gán next = null vì mặc định
            //  không gán giá trị thì = null rồi
        }
    }

    //Phương thức in LinkedList single ra màn hình
    public static void printLinkedList(Node head) {
        if(head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if(temp != null) {
                    System.out.print("->");
                }else {
                    System.out.println();
                }
            }
        }
    }

    //Thêm phần tử vào đầu LinkedList
    public static Node addToHead(Node head, int value) {
        Node newNode = new Node(value);
        if(head != null) {
            newNode.next = head;
            
        }
        return newNode;
    }

    //Thêm phần tử vào cuối LinkedList
    public static Node addToTail(Node headNode, int value) {
        Node newNode = new Node(value);
        if(headNode == null) {
            return newNode;
        } else {
            Node lastNode = headNode;
            while(lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return headNode;

    }

    //Thêm phần tử vào vị trí index bất kỳ
    public static Node addToIndex(Node headNode, int value, int index) {
        if(index == 0) {
            addToHead(headNode, value);
        } else {
            Node newNode = new Node(value);
            Node curNode = headNode;
            int count = 0;
            while(curNode != null) {
                count++;
                if(count == index) {
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
            }
        }
        return headNode;
    }


    //Xóa phần tử ở đầu
    public static Node removeAtHead(Node headNode) {
        if(headNode != null) {
            return headNode.next;// phần tử đầu = headNode.next ở hàm main
        }
        return headNode;
    }

    //Xóa phần tử ở cuối
    public static Node removeAtTail(Node headNode) {
        if(headNode == null) {
            return null;
        } 
        Node lastNode = headNode;
        Node preNode = null;
        while(lastNode.next != null) {
            preNode = lastNode;
            lastNode = lastNode.next;
        }

        if(preNode == null) {
            return null;
        } else {
            preNode.next = lastNode.next;// lúc này tất nhiên lastNode.next = null
        }
        return headNode;

    }

    //Xóa phần tử bằng index bất kỳ
    public static Node removeAtIndex(Node headNode, int index) {
        if(headNode == null || index < 0) return null;
        if(index == 0) removeAtHead(headNode);

        Node curNode = headNode;
        Node preNode = null;
        int count = 0;
        while(curNode.next != null) {
            if(count == index) {
                preNode.next = curNode.next;
            }
            preNode = curNode;
            curNode = curNode.next;
            count ++;

        }
        return headNode;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;

        printLinkedList(n1);
        n1 = addToHead(n1, 0);
        printLinkedList(n1);
        n3 = addToTail(n1, 4);
        printLinkedList(n1);
        addToIndex(n1, 1, 2);
        printLinkedList(n1);

        removeAtIndex(n1, 1);
        printLinkedList(n1);
        
        removeAtTail(n1);
        printLinkedList(n1);
        
    }
}
