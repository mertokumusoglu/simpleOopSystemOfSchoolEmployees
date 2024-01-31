public abstract class CivilServant extends Employee{
    private String department;
    private String shift;

    public CivilServant(String nameSurname, String phoneNumber, String email, String department, String shift) {
        super(nameSurname, phoneNumber, email);
        this.department = department;
        this.shift = shift;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
    public abstract void working();
}
