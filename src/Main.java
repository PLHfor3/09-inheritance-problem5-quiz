import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Dog fluffy = new Dog("Fluffy", "pomeranian");
        fluffy.printPetInfo();
        ArrayList<Pet> petArrayList = new ArrayList<Pet>();
        Pet pet1 = new Pet("Floppy", "Rabbit");
        Pet pet2 = new Pet("Arty", "Pug");
        petArrayList.add(pet1);
        petArrayList.add(pet2);
        PetOwner owner1 = new PetOwner(pet1, "Jerry");
        owner1
    }
}
