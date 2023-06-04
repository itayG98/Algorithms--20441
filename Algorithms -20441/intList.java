public class intList {

    private intNode _head;

    public intList() {
        this._head = null;
    }
    public intList(intNode _head) {
        this._head = _head;
    }

    public intList(int val) {
        this(new intNode(val));
    }


    public void addNode(int val) {
        if (_head == null) {
            _head = new intNode(val);
            return;
        } else if (_head.get_next() == null) {
            _head.set_next(new intNode(val));
            return;
        }
        intNode curr;
        for (curr = _head; curr.get_next() != null; curr = curr.get_next()) {
        }
        curr.set_next(new intNode(val));
    }

    public void printList() {

        for (intNode curr = _head; curr != null; curr = curr.get_next()) {
            System.out.print(curr.get_value() + " ");
        }
    }

    public intList secret(int k) {
        intNode c = _head;
        intNode p = null;
        intNode temp = null;
        intNode q = null;
        intNode n = null;
        intNode j = null;
        int t = 0;

        while (c != null) {
            t = k;
            j = c;
            p = null;

            while (c != null && t > 0) {
                temp = c.get_next();
                c.set_next(p);
                p = c;
                c = temp;
                t--;
            }
            if (n == null)
                n = p;
            if (q != null)
                q.set_next(p);
            q = j;
            q.set_next(c);
            t = k;
            while (c != null && t > 0) {
                p = c;
                c = c.get_next();
                t--;
            }
            q = p;
        }
        return new intList(n);
    }
}
