public class Main {

    public static void main(String[] args) {
	Person person = new Person ();
	person.birthDate =25;
	person.name = "Pawel";
	person.lastName = "Martys";
        System.out.println (person.birthDate);
        System.out.println (person.name);
        System.out.println (person.lastName);
        System.out.println (person.person);
        System.out.println (person );

        Person person1 = new Person ();
        person1.birthDate = 28;
        person1.name = "łukasz";
        person1.lastName = "Wisniewski";

        System.out.println (person1.birthDate);
        System.out.println (person1.name);
        System.out.println (person1.lastName);
        System.out.println (person1.person);
        System.out.println (person1 );

        System.out.println (person.name);

        person.setName ( "Wojtek" );
        System.out.println (person.name);


        System.out.println (person.getName ());


    }
}
