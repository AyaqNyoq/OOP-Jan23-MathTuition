public class Name
{
    //private cannot access outside of class
    private String fname;
    private String lname;
    private String mname;
    
    public Name(String fname, String mname, String lname)
    {   //constructor. no return type. name same as class.
        
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }
    
    public void setFName(String fname)
    {   //'this' referss to the class attributes
        this.fname = fname;
    }
    
    public void setMName(String mname)
    {   //'this' referss to the class attributes
        this.mname = mname;
    }
    
    public void setLName(String lname)
    {   //'this' referss to the class attributes
        this.lname = lname;
    }
    
    public String getFName()
    {
        return fname;
    }
    
    public String getMName()
    {
        return mname;
    }
    
    public String getLName()
    {
        return lname;
    }
}