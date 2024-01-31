public class Lecturer extends Academician{
    private String doorNo;

    public Lecturer(String nameSurname,
                    String phoneNumber,
                    String email,
                    String lecture,
                    String title,
                    String doorNo) {
        super(nameSurname, phoneNumber, email, lecture, title);
        this.doorNo = doorNo;
    }
    public String getDoorNo() {
        return doorNo;
    }
    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public void senateMeeting() {
        System.out.println("Senato toplantı açıklaması");
    }
    public void makingExam() {
        System.out.println("Sınav yapma açıklaması");
    }
    @Override
    public void givingLecture() {
        System.out.println(this.getNameSurname() + " isimli öğretmen derse girdi");
    }
    @Override
    public void login(String clock) {
        System.out.println(this.getNameSurname() + " isimli öğretmen giriş yaptı");
    }
}
