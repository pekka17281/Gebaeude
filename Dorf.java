
public class Dorf
{
    Gebaeude dorfgebaeude[] = new Gebaeude[7];
    public Dorf()
    {
        dorfgebaeude[0] = new Einfamilienhaus(3,5, 5);
        dorfgebaeude[1] = new Einfamilienhaus(5,2, 10);
        dorfgebaeude[2] = new Einfamilienhaus(4,1, 13);
        dorfgebaeude[3] = new Einfamilienhaus(2.5,4, 4);
        dorfgebaeude[4] = new Einfamilienhaus(5,3, 10);
        dorfgebaeude[5] = new Einfamilienhaus(4.5, 2, 10);
        dorfgebaeude[6] = new Kathedrale(216, 136);
    }
    public int besucher()
    {
        int summe = 0;
        for(int i=0;i < dorfgebaeude.length;i++)
        {
            summe = summe + dorfgebaeude[i].anzahlBesucher();
        }
        return summe;
    }
    public void gebaeudeHinzufuegen(Gebaeude pGebaeude)
    {
        Gebaeude[] dorfgebaeudeNeu = new Gebaeude[dorfgebaeude.length+1];
        for(int i = 0; i<dorfgebaeude.length; i++)
        {
            dorfgebaeudeNeu[i]=dorfgebaeude[i];
        }
        dorfgebaeudeNeu[dorfgebaeudeNeu.length-1]=pGebaeude;
        dorfgebaeude = dorfgebaeudeNeu;
    }
    public void ersteVeränderung()
    {   
        gebaeudeHinzufuegen(new Einfamilienhaus(2, 1, 6));
        gebaeudeHinzufuegen(new Dom(163, 500));
    }
    
    public void zweiteVeränderung()
    {   
        gebaeudeHinzufuegen(new Hochhaus(3, 17, 20));
        gebaeudeHinzufuegen(new Hochhaus(3, 12, 10));
        gebauedeHinzufuegen(new Kathedrale(250, 120));
    }
}