public class Student 
{
    // data/attributes
    private Name name;
    private String ic;
    private String address;
    private String schoolname;
    float[] marks = new float[5];
    private Tutor tutor;

    public Student(String firstName) 
    {
        name.setFName(firstName);
    }
    public Student(String firstName, String lastName) 
    {
        name.setFName(firstName);
        name.setLName(lastName);
    }
    public Student(String firstName, String middleName, String lastName) 
    {
        name.setFName(firstName);
        name.setMName(middleName);
        name.setLName(lastName);
    }

    // set/get

    public Name getName()
    {
        return name;
    }

    String getIc()
    {
        return ic;
    }

    String getAddress() 
    {
        return address;
    }

    String getschoolname() 
    {
        return schoolname;
    }

    Tutor getTutor() 
    {
        return tutor;
    }

    public void setMark(float mark, int i)
    {
        marks[i] = mark;
    }

    void setIc(String ic)
    {
        this.ic = ic;
    }

    void setAddress(String address)
    {
        this.address = address;
    }

    void setschoolname(String schoolname)
    {
        this.schoolname = schoolname;
    }

    void setTutor(Tutor tutor)
    {
        this.tutor = tutor;
    }

    // method or operations

    float calcAvg()
    {
        float sum = 0;
        for (int i =0; i < 5; i++){
            sum += marks[i];
        }
        return sum/5;
    }

    public float calcMin()
    {
        float min=marks[0];
        for(int i=0;i<5;i++)
        {
            if(min>marks[i])
            min=marks[i];
        }
        return min;
    }    
}
