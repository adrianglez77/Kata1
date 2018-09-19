package kata1;

import java.time.LocalDate;
import java.time.Month;


public class Kata1 {


    public static void main(String[] args) {
        LocalDate date;
        date = LocalDate.of(1996,Month.OCTOBER,11);
        Person persona = new Person("Adrian", date);
        System.out.println(persona.getName()+" tiene "+persona.getAge()+ " años");
    }
    
}
