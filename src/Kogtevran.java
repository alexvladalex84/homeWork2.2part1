public class Kogtevran extends Hogwarts{
   private int intelligence;                                 //ум
   private int wisdom;                                     //мудротсь
    private  int wit;                                       //остроумие
     private int creativity;                               //творчество

    public Kogtevran(String name, int thePowerOfFalconry, int transgress, int intelligence, int wisdom, int wit, int creativity) {
        super(name, thePowerOfFalconry, transgress);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public int calculationParameter() {
        return this.intelligence + this.wisdom + this.wit + this.creativity;
    }
    @Override
    public void printCompareOfParameterSpecific(String name1,String name2) {
        System.out.println(name1 + " Лучший Когтевранец чем " + name2);

    }

    public static void compareParameters(Kogtevran[] faculty ,String name1, String name2) {

        int total1 = 0;
        int total2 = 0;
        for (int i = 0; i < faculty.length; i++) {
            Kogtevran faculty1 = faculty[i];
            int total = faculty1.getIntelligence()+ faculty1.getWisdom() + faculty1.getWit() + faculty1.getCreativity() ;
            if (faculty1.getName().equals(name1)) {
                total1 = total;
                System.out.println(faculty1.getName() + total1);
            } else if (faculty1.getName().equals(name2)) {
                total2 = total;
                System.out.println(faculty1.getName() + total);
            }
        }
        if (total1 > total2) {
            System.out.println(name1 + " лучший Пуффиндуец , чем " + name2 + ".");
        } else if (total2 > total1) {
            System.out.println(name2 + " лучший Пуффиндуец , чем " + name1 + ".");
        }
    }
}
