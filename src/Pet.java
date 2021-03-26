public class Pet
{
    private String name;
    private String species;

    public Pet()
    {
        
    }

    public Pet(String n, String s)
    {
        name = n;
        species = s;
    }

    public String getName()
    {
        return name;
    }

    public String getSpecies()
    {
        return species;
    }

    public void printPetInfo()
    {
        System.out.println(name + " is a " + species);
    }
}
