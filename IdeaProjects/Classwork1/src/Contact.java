public class Contact {
    private String secondName;
    private String name;
    private String phone;

    public Contact(String secondName, String name, String phone) {
        this.secondName = secondName;
        this.name = name;
        this.phone = phone;
    }

    public void print() {
        System.out.printf("%s%s:%s", name, secondName, phone);
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public static void main(String[] args) {

    }
}