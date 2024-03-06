package Day_2.Pre_Lunch;

/** 
 * @author Sumanta
 * @version 1.0
 * @since 2021
 * 
 */
public class Student_Java_Docs {
    /** 
     * Represents the id of the student
     */
    private int id;
    /**
     * Represents the name of the student
     */
    private String name;
    /**
     * Represents the address of the student
     */

    private String address;

    /** 
     *  @return the id of the student
     */

    public int getId() {
        return id;
    }

    /** 
     * Set the id of the student
     */

    public void setId(int id) {
        this.id = id;
    }
    /** 
     * @return  the name of the student
     */

    public String getName() {
        return name;
    }
    /** 
     * Set the name of the student
     */


    public void setName(String name) {
        this.name = name;
    }
    /** 
     * @return the address of the student
     */

    public String getAddress() {
        return address;
    }
    /** 
     * Set the address of the student
     */

    public void setAddress(String address) {
        this.address = address;
    }  

    /**
     * @return the string representation of the object in a specific format
     */
    @Override
    public String toString() {
        return "Student_Java_Docs [id=" + id + ", name=" + name + ", address=" + address + "]";
    }


    public static void main(String[] args) {
        Student_Java_Docs s1=new Student_Java_Docs();
        s1.setId(1);
        s1.setName("Rahul");
        s1.setAddress("Delhi");
        System.out.println(s1);
        
        Student_Java_Docs s2=new Student_Java_Docs();
        s2.setId(2);
        s2.setName("Rohit");
        s2.setAddress("Mumbai");
        System.out.println(s2);


        
    }
    
}
