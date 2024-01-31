public class Computing extends CivilServant{
    private String duty;

    public Computing(String nameSurname,
                     String phoneNumber,
                     String email,
                     String department,
                     String shift,
                     String duty) {
        super(nameSurname,phoneNumber,email,department,shift);
        this.duty = duty;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }
    public void networkInstallation() {
        System.out.println("network kurulum açıklaması");
    }
    public void working() {
      System.out.println(this.getNameSurname() + " isimli bilgi işlem sorumlusu çalışmaya başladı");
    }

}
