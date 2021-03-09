package countDays;


import java.time.DayOfWeek;
import static java.time.DayOfWeek.SUNDAY;
import static java.time.DayOfWeek.SATURDAY;
import java.time.LocalDate;


public class BusinessDays {

    Holidays holidays = new Holidays();
    int weekendDays;

    public int countweekends(int year, int month, int day)
    {   
        int businessDays;
        //Variavel mesBase - Guarda data que será usada para o resto da função
        LocalDate mesBase = LocalDate.of(year, month, day);
        mesBase.getDayOfMonth();
        
        //Laço que roda até o último dia do mes - mesBase.lengthOfMonth
        for(int currentDay = day; currentDay <= mesBase.lengthOfMonth(); currentDay++)
        {
        //Data que se inicia com a dataBase anterior, mas que incrementamos os dias
        LocalDate mes = LocalDate.of(year, month, currentDay);
        DayOfWeek dayOfweek = DayOfWeek.from(mes);
            
            //Conta os sábados e domingos do mês corrente. 
            if(dayOfweek == SUNDAY || dayOfweek == SATURDAY)
            {
               weekendDays++;
            } 
          
        }
        
       //Retorna dias úteis do mês
       return businessDays = mesBase.lengthOfMonth() - weekendDays - holidays.January();

    }

    //TESTE USANDO OBJ
  /*  public int countweekends(LocalDate mesBase)
    {
        int businessDays;

        LocalDate alterMonth = mesBase;

        for(mesBase.getDayOfMonth(); mesBase.getDayOfMonth() <= mesBase.lengthOfMonth(); mesBase.plusDays(1))
        {
            //Data que se inicia com a dataBase anterior, mas que incrementamos os dias
            //LocalDate mes = LocalDate.of(year, month, currentDay);
            DayOfWeek dayOfweek = DayOfWeek.from(mesBase);

            //Conta os sábados e domingos do mês corrente.
            if(dayOfweek == SUNDAY || dayOfweek == SATURDAY)
            {
                weekendDays++;
            }

        }

        //Retorna dias úteis do mês (sabados, domingos e feriados)
        return businessDays = mesBase.lengthOfMonth() - weekendDays - holidays.January();

    }*/

    
}

  
