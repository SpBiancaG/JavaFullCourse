public class Human {
    private
    String m_name;
    int m_age;
    double m_weight;

    Human(String name, int age, double weight)
    {
        this.m_age=age;
        this.m_name=name;
        this.m_weight=weight;
    }

    public String toString(){
        String string=this.m_age+" "+m_name+" "+m_weight;
        return string;
    }

}
