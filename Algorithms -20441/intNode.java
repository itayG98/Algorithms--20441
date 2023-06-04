public class intNode {
    private int _value;
    private intNode _next;

    public intNode(int _value) {
        this._value = _value;
        this._next = null;
    }

    public intNode(int _value, intNode _next) {
        this._value = _value;
        this._next = _next;
    }

    public int get_value() {
        return _value;
    }

    public void set_value(int _value) {
        this._value = _value;
    }

    public intNode get_next() {
        return _next;
    }

    public void set_next(intNode _next) {
        this._next = _next;
    }


}
