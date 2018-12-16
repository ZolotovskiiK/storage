public class Range {
    private double from;
    private double to;

    private Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    private double getLength() {
        return this.to - this.from;
    }

    private boolean isInside(double x) {
        return this.from <= x && x <= this.to;
    }

    private int arithmeticMean() {
        double a = this.from;
        double b = this.to;
        int count = 0;
        int i = (int) a;

        while (i < b) {
            if (i % 2 == 0) {
                ++count;
            }
            ++i;
        }
        return count;
    }

    public static void main(String[] args) {
        Range range = new Range(2, 15);
        boolean result = range.isInside(7.6);
        System.out.println(result);
        System.out.println(range.getLength());
        System.out.println(range.arithmeticMean());
    }
}
