package pojo;
// Generated Feb 6, 2019 1:16:08 PM by Hibernate Tools 4.3.1



/**
 * Members generated by hbm2java
 */
public class Members  implements java.io.Serializable {


     private int memberId;
     private String firstname;
     private String lastname;
     private String state;

    public Members() {
    }

    public Members(int memberId, String firstname, String lastname, String state) {
       this.memberId = memberId;
       this.firstname = firstname;
       this.lastname = lastname;
       this.state = state;
    }
   
    public int getMemberId() {
        return this.memberId;
    }
    
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }




}


