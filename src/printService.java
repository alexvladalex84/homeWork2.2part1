public class printService {
    public static void print(Greeffirdor[] greeffirdor ){
        System.out.println("ФАКУЛЬТЕТ ГРИФФИНДОР");
        for (int i = 0; i < greeffirdor.length; i++) {
            Greeffirdor greeffirdor1 = greeffirdor[i];
            System.out.println(" Имя: " + greeffirdor1.getName()
                    + " , уровень магии: " +greeffirdor1.getThePowerOfFalconry()
                    + " , трансгрессия: " + greeffirdor1.getTransgress()
                    +  " , благородство: " +  greeffirdor1.getNobility()
                     + " , честь: " + greeffirdor1.getHonour()
                    + " , храбрость: " + greeffirdor1.getBravery());
    }
}
    public static void print(Slizerin[] slizerin ){
        System.out.println("ФАКУЛЬТЕТ СЛИЗЕРИН");
        for (int i = 0; i < slizerin.length; i++) {
            Slizerin slizerin1 = slizerin[i];
            System.out.println(" Имя: " + slizerin1.getName()
                              + " , уровень магии: " + slizerin1.getThePowerOfFalconry()
                             + " , трансгрессия: " + slizerin1.getTransgress()
                             + " , хитрость: " + slizerin1.getCunning()
                             + " , решительнотсь: " + slizerin1.getDetermination()
                             + " , амбициозность: " + slizerin1.getAmbition()
                             + " , находчивость: " + slizerin1.getResourcefulness()
                             + " , жажда власти: " + slizerin1.getLustForPower());
        }
    }
    public static void print(Puffendye[] puffendye){
        System.out.println("ФАКУЛЬТЕТ ПУФФЕНДУЙ");
        for (int i = 0; i < puffendye.length; i++) {
            Puffendye puffendye1 = puffendye[i];
            System.out.println(" Имя: " + puffendye1.getName()
                    + " , уровень магии: " + puffendye1.getThePowerOfFalconry()
                    + " , трансгрессия: " + puffendye1.getTransgress()
                    + " , трудолюбие: " + puffendye1.getHardWork()
                    + " , верность: " + puffendye1.getloyalty()
                    + " , честность: " + puffendye1.getHonesty());
        }
    }
    public static void print(Kogtevran[] kogtevran){
        System.out.println("ФАКУЛЬТЕТ КОГТЕВРАН");
        for (int i = 0; i < kogtevran.length; i++) {
            Kogtevran kogtevran1 = kogtevran[i];
            System.out.println(" Имя: " + kogtevran1.getName()
                    + " , уровень магии: " + kogtevran1.getThePowerOfFalconry()
                    + " , трансгрессия: " + kogtevran1.getTransgress()
                    + " , интелект: " + kogtevran1.getIntelligence()
                    + " , мудрость: " + kogtevran1.getWisdom()
                    + " , остроумие: " + kogtevran1.getWit()
                    + " , творчество: " + kogtevran1.getCreativity());
        }
    }


}
