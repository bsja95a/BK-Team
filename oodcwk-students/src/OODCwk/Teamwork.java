package OODCwk;


/**
 * Details of your team
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Teamwork
{
    private String[] details = new String[7];
    
    public Teamwork()
    {   // in each line replace the contents of the String 
        // with the details of your team
        // It will help us if the surname of programmer1 comes
        // alphabetically before the surname of programmer2
        details[0] = "BK TEAM";
        details[1] = "Awan";
        details[2] = "Burhan";
        details[3] = "14029985";
        details[4] = "Chandracant";
        details[5] = "Karan";
        details[6] = "13048811";
    }
    
    public String[] getTeamDetails()
    {
        return details;
    }
    
    public void displayDetails()
    {
        for(String temp:details)
        {
            System.out.println(temp.toString());
        }
    }
}
        
