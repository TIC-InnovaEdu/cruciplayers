public class Word {
    private String text;
    private int x;
    private int y;
    private boolean isHorizontal;

    public Word(String text, int x, int y, boolean isHorizontal) {
        this.text = text;
        this.x = x;
        this.y = y;
        this.isHorizontal = isHorizontal;
    }

    public String getText() {
        return text;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isHorizontal() {
        return isHorizontal;
    }
}