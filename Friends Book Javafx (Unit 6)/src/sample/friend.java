package sample;


public class friend {

     String friendName;
     String friendBirthdate;
     String friendGender;
     String friendEmailAddress;


    public friend(String friendName, String friendBirthdate, String friendGender, String friendEmailAddress) {
        this.friendName = friendName;
        this.friendBirthdate = friendBirthdate;
        this.friendGender = friendGender;
        this.friendEmailAddress = friendEmailAddress;
    }

    public String toString() {
        return friendName;
    }

    public String getFriendBirthdate(){ return friendBirthdate; }

    public String getFriendGender(){ return friendGender;}

    public String getFriendEmailAddress(){return friendGender;}
}