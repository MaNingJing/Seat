public class Attendee {
    private String name;
    private char gender;
    private String email;
    private int age;
    private String seatNo;

    public Attendee (String name,char gender, String email,int age,String seatNo){
        this.name=name;
        this.gender=gender;
        this.email=email;
        this.age=age;
        this.seatNo=seatNo;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setGender(char gender){
        this.gender=gender;
    }
    public char getGender(){
        return gender;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void setSeatNo(String seatNo){
        this.seatNo=seatNo;
    }
    public String getSeatNo(){
        return seatNo;
    }

    @Override
    public String toString(){
        return "Attendee:"+"\n"+"Name: "+name+"\n"+"Gender: "+gender+"\n"+"Age: "+age+"\n"+"Email: "+email+"\n"+"Seat NO.: "+seatNo+"\n";
    }
}
