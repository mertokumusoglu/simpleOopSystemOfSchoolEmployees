public abstract class Academician extends Employee{
    private String lecture;
    private String title;

    public Academician(String nameSurname, String phoneNumber, String email,String lecture, String title) {
        super(nameSurname, phoneNumber, email);
        this.lecture = lecture;
        this.title = title;
    }

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public abstract void givingLecture();

    public abstract void login(String clock);
}