public class Slizerin extends Hogwarts {
    private int cunning;                       // хитрость
    private int determination;                  // решительнотсь
    private int ambition;                         // амбициозность
    private int resourcefulness;                    //находчивость
    private int lustForPower;                        //жажда власти

    public Slizerin(String name, int thePowerOfFalconry, int transgress, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, thePowerOfFalconry, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public int calculationParameter() {
        return this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
    }
    @Override
    public void printCompareOfParameterSpecific(String name1,String name2) {
        System.out.println(name1 + " Лучший Слизеринец чем " + name2);

    }

    public static void compareParameters(Slizerin[] faculty, String name1, String name2) {
        int total1 = 0;
        int total2 = 0;
        for (int i = 0; i < faculty.length; i++) {
            Slizerin faculty1 = faculty[i];
            int total = faculty1.getCunning() + faculty1.getDetermination() + faculty1.getAmbition() + faculty1.getResourcefulness() + faculty1.getLustForPower();
            if (faculty1.getName().equals(name1)) {
                total1 = total;
                System.out.println(faculty1.getName() + total1);
            } else if (faculty1.getName().equals(name2)) {
                total2 = total;
                System.out.println(faculty1.getName() + total);
            }
        }
        if (total1 > total2) {
            System.out.println(name1 + " лучший Слизеринец , чем " + name2 + ".");
        } else if (total2 > total1) {
            System.out.println(name2 + " лучший Слизеринец , чем " + name1 + ".");
        }
    }
}




