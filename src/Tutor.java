public class Tutor
{ 
    // attributes
    private Name name;
    private String ic;
    private String address;
    private int numyearexp;
    private String qualification;

    public Tutor(String firstName) 
    {
        name.setFName(firstName);
    }
    public Tutor(String firstName, String lastName) 
    {
        name.setFName(firstName);
        name.setLName(lastName);
    }
    public Tutor(String firstName, String middleName, String lastName) 
    {
        name.setFName(firstName);
        name.setMName(middleName);
        name.setLName(lastName);
    }

    // set/get

    Name getName()
    {
        return name;
    }

    void setIc(String ic)
    {
        this.ic = ic;
    }

    void setAddress(String address)
    {
        this.address = address;
    }

    void setNumYearExp(int numyearexp)
    {
        this.numyearexp = numyearexp;
    }

    void setQualification(String qualification)
    {
        this.qualification = qualification;
    }

    String getIc() 
    {
        return ic;
    }

    String getAddress() 
    {
        return address;
    }

    int getNumYearExp() 
    {
        return numyearexp;
    }

    String getQualification() 
    {
        return qualification;
    }
}
