package lab6;

public class activity1_Person {

    protected String name ; protected String id ; protected int phone ;

    public activity1_Person() {
        name = "sidra" ; id = "sp24_bcs_093" ; phone = 12345 ;
    }

    public activity1_Person(String a , String b , int c)
    { name = a ; id = b ; phone = c ;}

    public void setName(String a){ name = a ;}

    public void setId(String j){id = j ;}

    public void setPhone(int a) { phone = a ;}

    public String getName() {return name ;}

    public String getid() {return id ;}

    public int getPhone() {return phone ;}

    public void display( ){
        System.out.println("Name : " + name + "ID : " + id + "Phone : " +
                phone ) ;
    }

    }
