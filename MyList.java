public class MyList implements IDataStructure {

    double value;
    MyList next;

    public MyList(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public MyList getNext() {
        return next;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setNext(MyList next) {
        this.next = next;
    }

    @Override
    public void add(double val) {
        MyList curr = this;
        while (curr.next != null) curr = curr.next;
        curr.next = new MyList(val);
    }

    @Override
    public double max() {
        MyList curr = this;
        double max = value;
        while (curr != null) {
            if (curr.value > max) max = curr.value;
            curr = curr.next;
        }
        return max;
    }

    @Override
    public double min() {
        MyList curr = this;
        double min = value;
        while (curr != null) {
            if (curr.value < min) min = curr.value;
            curr = curr.next;
        }
        return min;
    }

    @Override
    public boolean contains(double val) {
        MyList curr = this;
        while (curr != null) {
            if (curr.value == val) return true;
            curr = curr.next;
        }
        return false;
    }

    @Override
    public void clear(double val) {
        this.next = null; //to wystarczy do wyczyszczenia listy
        value = val;
    }

    @Override
    public void sort() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        String s = Double.toString(value);
        MyList curr = this;
        while (curr.next != null) {
            s += "->" + curr.next.value;
            curr = curr.next;
        }
        return s;
    }

    void changeat(double from, double to) {
        if (!contains(from)) throw new IllegalArgumentException();

        MyList curr = this;
        while (curr.value != from) {
            curr = curr.next;
        }

        curr.value = to;


    }
}
