class Student {
    private String name;
    private long prn;
    private String branch;
    private float cgpa;

    // Constructor
    public Student(String name, long prn, String branch, float cgpa) {
        setName(name);
        setPRN(prn);
        setBranch(branch);
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
                           " | CGPA: " + getCGPA());
    }
}
