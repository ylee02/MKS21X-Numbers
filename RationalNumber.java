public RationalNumber {
  private int num;
  private int denom;
  private double ans;
  public RationalNumber(int x, int y) {
    if (y != 0) {
      num = x;
      denom = y;
      ans = (double) x / y;
    }
  }
  public int getNum() {
    return num;
  }
  public int getDenom() {
    return denom;
  }
  public double getRat() {
    return ans;
  }
  public double compareTo(RationalNumber r) {
    return 1.0;
  }
  public String toString();
    return num + "/" + denom;
  }
}
