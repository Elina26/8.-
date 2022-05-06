public class WorkingStudent extends Student {

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    private String organization;

    public WorkingStudent(String surname, String name, String patronymic, int age, String facultyName, String organization) {
        super(surname, name, patronymic, age, facultyName);
        this.organization = organization;
    }

    public WorkingStudent(Human human, String facultyName, String organization) {
        super(human, facultyName);
        this.organization = organization;
    }
}
