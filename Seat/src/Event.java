
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class Event {
    String eventID;
    String eventName;
    String eventVenue;
    LocalDate eventDate;
    ArrayList<Attendee> eventattendees=new ArrayList<>();
    Scanner reader=new Scanner(System.in);
    //constructor
    public Event(String eventID,String eventName,String eventVenue,LocalDate eventDate,ArrayList<Attendee> eventattendees){
        this.eventID=eventID;
        this.eventName=eventName;
        this.eventVenue=eventVenue;
        this.eventDate=eventDate;
        this.eventattendees=eventattendees;
    }
    public Event() {
		
	}
	
    public String geteventID(){
        return eventID;
    }

    public String geteventName(){
        return eventName;
    }

    public String geteventVenue(){
        return eventVenue;
    }

    public LocalDate eventDate(){
        return eventDate;
    }

    public ArrayList<Attendee> geteventattendees(){
        return eventattendees;
    }

    //setter
    public void seteventID(String eventID){
        this.eventID=eventID;
    }

    public void seteventName(String eventName){
        this.eventName=eventName;
    }

    public void seteventVenue(String eventVenue){
        this.eventVenue=eventVenue;
    }

    public void seteventDate(LocalDate eventDate){
        this.eventDate=eventDate;
    }

    public void seteventattendees(ArrayList<Attendee> eventattendees){
        this.eventattendees=eventattendees;
    }

    //method
    public void organizeEvent(int choose){
        switch(choose){

            case 1:
                System.out.println("How many attendees you want to add?");
                int num=reader.nextInt();
                reader.nextLine();
                
                for(int i=0;i<num;++i){
                    System.out.println("Enter name of the attendee:");
                    String name=reader.nextLine();
                    System.out.println("Enter gender of the attendee:");
                    char gender=reader.nextLine().charAt(0);
                    System.out.println("Enter email of the attendee:");
                    String email=reader.nextLine();
                    System.out.println("Enter age of the attendee:");
                    int age=reader.nextInt();
                    reader.nextLine();
                    System.out.println("Enter seat of the attendee:");
                    String seatNo=reader.nextLine();
                    eventattendees.add(new Attendee(name,gender,email,age,seatNo));
                    
                

            }break;

            case 2:
                System.out.println("How many do you want to remove?");
                int oo=reader.nextInt();
                reader.nextLine();
                for(int i=0;i<oo;++i){
                    System.out.println("Enter name of the attendee:");
                    String sb=reader.nextLine();
                    for(Attendee attendee:eventattendees){
                        if(sb.equals(attendee.getName())){
                            eventattendees.remove(attendee);
                            System.out.println("\n"+sb+"is removed from list now");
                            break;
                        }
                        else{
                            System.out.println(sb+"is not found in the list");
                            break;
                        }
                    }
                    
                
            }break;

            case 3:
                System.out.println("How many people you want to update?");
                int ee=reader.nextInt();
                for(int i=0;i<ee;++i){
                    System.out.println("Enter the name you want to update:");
                    String nametofind=reader.nextLine();
                    reader.nextLine();
                    for(Attendee attendee:eventattendees){
                        if(nametofind.equals(attendee.getName())){
                            System.out.println("Enter the new name or null if you do not want to update:");
                            String newname=reader.nextLine();
                            if(!newname.equals("null")){
                                attendee.setName(newname);
                            }
                            System.out.println("Enter the new gender if you want to update:");
                            String gender=reader.nextLine();
                            if(gender.equals("M")){
                                attendee.setGender('M');
                            }
                            else if(gender.equals("W")){
                                attendee.setGender('W');
                            }
                            System.out.println("Enter the new email or null if you do not want to update:");
                            String newemail=reader.nextLine();
                            if(!newemail.equals("null")){
                                attendee.setEmail(newemail);
                            }
                            System.out.println("Enter the new age or 0 if you do not want to update:");
                            int newage=reader.nextInt();
                            reader.nextLine();
                            if(newage!=0){
                                attendee.setAge(newage);
                            }
                            System.out.println("now name:"+attendee.getName()+"now gender:"+attendee.getGender()+"now email:"+attendee.getEmail()+"now age"+attendee.getAge());
                            break;
                        }
                        else{
                            System.out.println(nametofind+"is not found in the list");
                            break;
                        }
                    }
                    
                
            }break;

            case 4:
                System.out.println("How many puople you want to check?");
                int mm=reader.nextInt();
                reader.nextLine();
                for(int i=0;i<mm;++i){
                    for(Attendee attendee:eventattendees){
                        System.out.println("Enter the name:");
                        String namee=reader.nextLine();
                        if(attendee.getName().equals(namee)){
                            System.out.println("Name:"+attendee.getName()+"\nGender:"+attendee.getGender()+"\nEmail:"+attendee.getEmail()+"\nAge:"+attendee.getAge());
                            break;
                        }
                        else{
                            System.out.println(namee+"is not found in the list");
                            break;
                        }
                    }
                    
                
            }break;

            case 5:
                break;
        }



    }

    public String toString(){
        return ("eventID:"+eventID+"\neventName:"+eventName+"\neventVenue:"+eventVenue+"\neventDate:"+eventDate+
        "\neventattendees:"+eventattendees.toString());

    }

}
