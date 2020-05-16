import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Person person = context.getBean("trenirovka", Person.class);
        System.out.printf("%s - %d", person.getName(), person.getAge()+1);
        System.out.println();

        Animal animal = context.getBean("animal", Animal.class);
        System.out.printf("%s - %d", animal.getName(), animal.getAge());

    }
}
