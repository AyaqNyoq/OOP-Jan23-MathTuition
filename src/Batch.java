public class Batch 
{
    private int currsz = 0;
    private Student[] students = new Student[0];

    void addStudent(Student s)
    {
        students[currsz++] = s;
    }

    Student[] getStudents()
    {
        return students;
    }

    public int getCurrsz()
    {
        return currsz;
    }

    public boolean find(String name)
    {
        for(int i=0;i<currsz;i++)
        {
            if ((name==students[i].getName().getFName()) || (name==(students[i].getName().getMName())) || (name==(students[i].getName().getLName())))
            {
                return true;
            }
        }
       
        return false;
    }

    public void displayAll()
    {
        for (int i = 0; i < students.length; i++)
        {
            if(this.students[i] != null) 
            {
                System.out.println("Name: " + students[i].getName().getFName() + " " + students[i].getName().getMName() + " " + students[i].getName().getLName());
                System.out.println("IC: " + students[i].getIc());
                System.out.println("School name: " + students[i].getschoolname());
                System.out.println("Average marks: " + students[i].calcAvg());
                System.out.println("Min marks: " + students[i].calcMin());
            }
            else
            {
                break;
            }
        }


    }

}
