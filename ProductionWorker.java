public class ProductionWorker extends Employee{
    private int shift;

    public ProductionWorker(int empno, String ename, int salary,int shift) {
        super(empno, ename, salary);
        this.shift = shift;
    }
	public ProductionWorker() {
		super();
	}
	public String getShift() {
        if (shift == 1)
            return "Day";
        else if (shift == 2)
            return "Night";
        else
            return "INVALID SHIFT";
    }
    public void setShift(int shift) {
        this.shift = shift;
    }
    public String toString() {
    	String res = "";
    	if (shift == 1) {
    	res = "\tShift : Day";
			}
		else if (shift == 2)
			{
		res = "\tShift : Night";
    	}
    	return super.toString()  + " " +res;
    	
    }

}