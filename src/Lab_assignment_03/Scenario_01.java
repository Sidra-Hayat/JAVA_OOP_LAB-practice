package Lab_assignment_03;

public class Scenario_01 {

        public static void main(String[] args) {
Person_s1a[] p=new Person_s1a[2];
p[0]=new Student_s1b("ali",4.0);

Professor_s1c p2=new Professor_s1c("Ahmad",69);
                p[1]=p2;
p2.setNumberOfPublications(100);
                System.out.println(p[0].getName()+"is outstanding: "+p[0].isOutstanding());
                System.out.println(p[1].getName()+"is outstanding: "+p[1].isOutstanding());

//for(Person_s1 person:p){
//        System.out.println(person.getName()+" is outstanding: "+ person.isOutstanding());
//                }


}
        }

