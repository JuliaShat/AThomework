package SimplePaint;

public enum Dimension {
    WIDTH(800), HEIGHT(500);

    private int size;

    Dimension(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}


