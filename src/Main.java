public class Main {
    public static void main(String[] args) {

        Greeffirdor[] greeffirdor = {
                new Greeffirdor(" Гарри Поттер ", 5, 5, 5, 5, 5),
                new Greeffirdor(" Гермиона Грейнджер ", 3, 3, 3, 3, 3),
                new Greeffirdor(" Рон Уизли ", 4, 4, 4, 4, 4)
        };
        Slizerin[] slizerin = {
                new Slizerin(" Драко Малфой ", 6, 3, 3, 3, 3, 3, 3),
                new Slizerin(" Грегори Гойл ", 3, 5, 5, 5, 5, 5, 5),
                new Slizerin(" Грэхэм Монтегю ", 5, 4, 4, 4, 4, 4, 4)
        };
        Puffendye[] puffendye = {
                new Puffendye(" Захария Смит ", 6, 6, 6, 6, 6),
                new Puffendye(" Седрик Диггори ", 7, 7, 7, 7, 7),
                new Puffendye(" Джастин Финч-Флетчли ", 5, 5, 5, 5, 5)};
        Kogtevran[] kogtevran = {
                new Kogtevran(" Чжоу Чанг ", 5, 5, 5, 5, 5, 5),
                new Kogtevran(" Падма Патил ", 7, 7, 7, 7, 7, 7),
                new Kogtevran(" Маркус Белби", 8, 8, 8, 8, 8, 8)

        };
        Greeffirdor greeffirdorGermionaGr = new Greeffirdor(" Гермиона Грейнджер ", 3, 3, 3, 3, 3);
        Greeffirdor greeffirdorGarryPotter = new Greeffirdor(" Гарри Поттер ", 5, 5, 5, 5, 5);
        Kogtevran kogtevranPadmaPatil = new Kogtevran(" Падма Патил ", 7, 7, 7, 7, 7, 7);

        System.out.println("Реализован метод, который выводит на экран описание студента");
        printService.print(greeffirdor);
        printService.print(slizerin);
        printService.print(puffendye);
        printService.print(kogtevran);
        separator();
        System.out.println("Реализованы методы, которые выводят на экран результат сравнения двух учеников одного факультета по свойствам только это факультета ");
        greeffirdorGarryPotter.compare(greeffirdorGermionaGr);
        greeffirdorGermionaGr.compare(greeffirdorGarryPotter);
        separator();
        System.out.println("Реализован метод, который сравнивает двух любых учеников по присущим всем ученикам школы характеристикам. ");
        kogtevranPadmaPatil.compare(greeffirdorGermionaGr);

    }


        public static void separator() {
        System.out.println("+++++++++++++++");
    }
}


