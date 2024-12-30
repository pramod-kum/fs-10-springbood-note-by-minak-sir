package BetterCode;

public class Rectangle implements IShape{

    private int length;
    private int breath;

    public Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    @Override
    public void printArea()
    {
        System.out.println(length*breath);
    }
}
