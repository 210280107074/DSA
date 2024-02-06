public class linklist {
    public class LL {
        private Node head;
        private Node tail;
        private int size;

        public LL() {
            this.size = 0;
        }

        private class Node {
            int value;
            Node next;

            public Node(int value) {
                this.value = value;
            }
            public Node(){
                Node node = new Node();
            }

            public Node(int value, Node next) {
                this.value = value;
                this.next = next;
            }
        }

        public void insertFirst(int value) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = head;
            }
            size = size + 1;
        }
        public void insertEnd(int value){
            Node newNode = new Node(value);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
        public int deleteFirst(){
            int value = head.value;
            head = head.next;
            return value;
        }
        public Node get(int index){
            Node temp = head;
            for(int i=0;i<index;i++){
                temp = temp.next;
            }
            return temp;
        }
        public int deleteEnd(){
            int value = tail.value;
            tail = get(size - 2);
            tail.next = null;
            return value;
        }
        public int deleteFromIndex(int index){
            Node prev = get(index-1);
            int value = prev.next.value;
            prev.next = prev.next.next;
            return value;
        }
        public boolean isHappy(int number){
            int slow = number;
            int fast = number;
            do{
                slow = findSquare(number);
                fast = findSquare(findSquare(number));
            }while(slow != fast);
            if(slow == 1){
                return true;
            }
            else{
                return false;
            }
        }
        public  static Node getMid(Node node){
            Node slow = node;
            Node fast = node;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
        public int findSquare(int number){
            int ans = 0;
            while(number>0){
                int rem = number % 2;
                ans = ans + rem*rem;
                number = number / 10;
            }
            return ans;
        }
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            System.out.println("END");
        }
    }

    public static void main(String[] args) {
        linklist.LL list = new linklist().new LL();
        list.insertFirst(15);
        list.insertEnd(555);
        list.insertEnd(551);
        list.insertEnd(550);
        list.insertEnd(58);
        list.insertEnd(56);
        list.deleteFirst();
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteEnd());
        System.out.println(list.deleteFromIndex(2));
        list.display();
    }
}
