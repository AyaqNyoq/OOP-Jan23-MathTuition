public class TutorList 
{
    private int currsz = 0;
    private Tutor[] tutors = new Tutor[0];

    void addTutor(Tutor new_tutor)
    {
        tutors[currsz++] = new_tutor;
    }

    public boolean find(String name)
    {
        for(int i=0;i<currsz;i++)
        {
            if ((name==tutors[i].getName().getFName()) || (name==(tutors[i].getName().getMName())) || (name==(tutors[i].getName().getLName())))
            {
                return true;
            }
        }
        return false;
    }
    
    Tutor[] getTutors()
    {
        return tutors;
    }
}
