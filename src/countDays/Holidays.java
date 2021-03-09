package countDays;

//Implementar forma de saber quais feriados caem no sabado e não fazer a contagem deles.

//Feriados 2021
public class Holidays {

    int totalHolidaysMonth;
    
    public int January() {
        
        //Array's com os dias de feriados do mês de janeiro
        Integer[] januaryHolidays = 
        {
            1, // sexta-feira - Ano novo

        };

        return totalHolidaysMonth = januaryHolidays.length;
        };
       
    public int February() {  
        
        Integer[] feabruaryHolidays =
        {
            15, // segunda-feira - carnaval
            16, // terça-feira - carnaval
            17 //quarta-feira - quarta feira de cinzas
        };
        
       return totalHolidaysMonth = feabruaryHolidays.length;
    };
       
    public int March(){
        
        Integer[] marchHolidays =
        {
            
        };
        
       return totalHolidaysMonth = marchHolidays.length;
    };
    
    public int April(){
        
        Integer[] aprilHolidays =
        {
            21, // quarta-feira - Tiradentes  
        };
        
       return totalHolidaysMonth = aprilHolidays.length;
    };
    
    public int May(){     
        
        Integer[] mayHolidays =
        {
            //01 // sábado - Dia mundial do trabalho
        };
        
       return totalHolidaysMonth = mayHolidays.length;
    };
    
    public int June(){
         
        Integer[] juneHolidays =
        {
            03, // quinta-feira - Corpus Christi
        };
        
       return totalHolidaysMonth = juneHolidays.length;
    };
    
    public int July(){
        
        Integer[] julyHolidays =
        {

        };
        
       return totalHolidaysMonth = julyHolidays.length;
    };
     
    public int August(){
        
        Integer[] augustHolidays =
        {
            
        };
       
       return totalHolidaysMonth = augustHolidays.length;
    };
    
    public int September(){   
        
        Integer[] septemberHolidays =
        {
            7, // terça-feira - Independência do Brasil
        };
        
       return totalHolidaysMonth = septemberHolidays.length;
    };
    
    public int October(){
        
        Integer[] octoberHolidays =
        {
            12, // terça-feira - Nossa Senhora Aparecida
            28, // quinta-feira - Dia do servidor público
        };
        
       return totalHolidaysMonth = octoberHolidays.length;
    };
    
    public int November(){
        
        Integer[] novemberHolidays =
        {
            2, // terça-feira - Finados
            15, // segunda-feira - Proclamação da República
            //20 //sábado - Dia da Consciência Negra
        };
        
       return totalHolidaysMonth = novemberHolidays.length;
    };
    
    public int December(){
        
        Integer[] decemberHolidays =
        {
          //25, // sabado - Natal
            31, // sexta-feira - Véspera Ano Novo
        };
        
       return totalHolidaysMonth = decemberHolidays.length;
    }
};