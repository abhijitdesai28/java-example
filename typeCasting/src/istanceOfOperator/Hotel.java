package istanceOfOperator;

public class Hotel
{
   Food orderFood(int choise)
    {
        if (choise == 1) {
            Idly i = new Idly();
            return i;
        } else if (choise==2) {
            Dosa d= new Dosa();
            return d;
        }
        else {
            Vada v= new Vada();
            return v;
        }

    }
}
