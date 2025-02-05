class Student {
    private String name;
    private long prn;
    private String branch;
    private String batch;
    private float cgpa;

    // Constructor
    public Student(String name, long prn, String branch, String batch, float cgpa) {
        setName(name);
        setPRN(prn);
        setBranch(branch);
        setBatch(batch);
        setCGPA(cgpa);
    }

    // Getters and Setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPRN(long prn) {
        this.prn = prn;
    }

    public long getPRN() {
        return prn;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getBatch() {
        return batch;
    }

    public void setCGPA(float cgpa) {
        this.cgpa = cgpa;
    }

    public float getCGPA() {
        return cgpa;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + getName() + 
                           " | PRN: " + getPRN() + 
                           " | Branch: " + getBranch() + 
                           " | CGPA: " + getCGPA() +
                           " | Batch: " + getBatch());
    }
}
