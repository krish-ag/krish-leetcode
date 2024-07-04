class Node {
    String data;
    Node prev;
    Node next;

    public Node(String str) {
        this.data = str;
    }

    public void display() {
        System.out.println(this.data);
        if (this.next != null) this.next.display();
    }
}


class BrowserHistory {
    Node ptr;
    public Node head;


    public BrowserHistory(String homepage) {
        this.head = new Node(homepage);
        this.ptr = this.head;
    }

    public void visit(String url) {
            this.ptr.next = new Node(url);
            this.ptr.next.prev = this.ptr;
            this.ptr = this.ptr.next;
    }

    public String back(int steps) {
        while (steps > 0){
            if (this.ptr.prev == null) break;
            this.ptr = ptr.prev;
            steps--;
        }
        return this.ptr.data;
    }

    public String forward(int steps) {
        while (steps > 0) {
            if (this.ptr.next == null) break;
            this.ptr = this.ptr.next;
            steps--;
        }
        return this.ptr.data;
    }
}


/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */