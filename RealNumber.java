public RealNumber {
  private double ans;
  public RealNumber(double r) {
    ans = r;
  }
  public double getAns() { 
    return ans;
  }
  public double compareTo(RealNumber r) {
    return 1.0;
  }
  public String toString() {
    return ans + "";
  }
}
    
