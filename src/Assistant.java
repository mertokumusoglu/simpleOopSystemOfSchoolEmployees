public class Assistant extends Academician {
    private String officeHour;

    public Assistant(String nameSurname,
                     String phoneNumber,
                     String email,
                     String lecture,
                     String title,
                     String officeHour) {
        super(nameSurname, phoneNumber, email, lecture, title);
        this.officeHour = officeHour;
    }

    public String getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }
    public void makingQuiz() {
        System.out.println("Quiz yapma açıklaması");
    }
    @Override
    public void givingLecture() {
        System.out.println(this.getNameSurname() + " isimli asistan derse girdi");
    }
    @Override
    public void login(String clock) {
        System.out.println(this.getNameSurname() + " isimli asistan giriş yaptı");
    }
}
