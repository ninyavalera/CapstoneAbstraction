package verdida.mcm.edu.ph.capstonetrytry;

public class User {
    //Student user
    private String name;
    private String sex;
    private String address;
    private String edulvl;// academic lvl
    private String subject;
    private int id=00000000;//student id
    private String bio;
    //Teacher user
    private int id1=00000000;
    private String name1;
    private String sex1;
    private String address1;
    private String spec1;//subject specialization
    private String edulvl1;// highest academic lvl attained
    private double rate1;
    private int hrs1=0;
    private int min1=0;
    private String bio1;


    public User(int id, String name, String bio, String sex, String address, String edulvl, String subject){
        this.name=name;
        this.id=id;
        this.sex=sex;
        this.address=address;
        this.edulvl=edulvl;
        this.subject=subject;
        this.bio=bio;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSex(){
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getEdulvl(){
        return this.edulvl;
    }

    public void setEdulvl(String edulvl) {
        this.edulvl = edulvl;
    }
    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getBio(){
        return this.bio;
    }
    public void setBio(String bio){
        this.bio=bio;
    }


    public User(int id1, String name1, String bio1, String sex1, String address1, String spec1, String edulvl1, double rate1, int hrs1, int min1){
        this.address1=address1;
        this.edulvl1=edulvl1;
        this.hrs1=hrs1;
        this.min1=min1;
        this.id1=id1;
        this.name1 =name1;
        this.rate1=rate1;
        this.sex1=sex1;
        this.spec1=spec1;
        this.bio1=bio1;
    }
    public String getName1(){
        return this.name1;
    }
    public void setName1(String name1) {
        this.name1 = name1;
    }
    public String getSex1(){
        return this.sex1;
    }
    public void setSex1(String sex1) {
        this.sex1 = sex1;
    }
    public String getAddress1(){
        return this.address1;
    }
    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    public String getSpec1(){
        return this.spec1;
    }
    public void setSpec1(String spec1) {
        this.spec1 = spec1;
    }
    public String getEdulvl1(){
        return this.edulvl1;
    }
    public void setEdulvl1(String edulvl1) {
        this.edulvl1 = edulvl1;
    }
    public double getRate1(){
        return this.rate1;
    }
    public void setRate1(double rate1) {
        this.rate1 = rate1;
    }
    public int getHrs1(){
        return this.hrs1;
    }
    public void setHrs1(int hrs1) {
        this.hrs1 = hrs1;
    }
    public int getMin1(){
        return this.min1;
    }
    public void setMin1(int min1) {
        this.min1 = min1;
    }
    public String getBio1(){
        return this.bio1;
    }
    public void setBio1(String bio1) {
        this.bio1 = bio1;
    }
}
