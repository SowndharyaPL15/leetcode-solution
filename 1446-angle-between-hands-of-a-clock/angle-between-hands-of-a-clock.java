class Solution {
    public double angleClock(int hour, int minutes) {
          double a=hour + minutes / 60.0;
          double b=(11.0 * a) % 12.0;
          return Math.min(b,12.0 - b) * 30.0;
    }
}