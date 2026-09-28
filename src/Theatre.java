public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Джонни", "Депп", Gender.MALE, 177);
        Actor actor2 = new Actor("Энн", "Хэтуей", Gender.FEMALE, 180);
        Actor actor3 = new Actor("Сэм", "Рокуэл", Gender.MALE, 174);


        Director director1 = new Director("Стивен", "Спилберг", Gender.MALE);
        Director director2 = new Director("Гай", "Ричи", Gender.MALE);

        Person musicAuthor = new Person("Людвиг", "Бетховен", Gender.MALE);
        Person choreographer = new Person("Анна", "Хореографова",Gender.FEMALE);

        Show show = new Show("Большое шоу", 360, director1);
        Opera opera = new Opera("Кармен", 120, director2, musicAuthor,
                "Либретто оперы", 10);
        Ballet ballet = new Ballet("Лебединое озеро", 180, director2, musicAuthor,
                "Либретто балета", choreographer);

        show.addActor(actor1);
        show.addActor(actor2);
        show.addActor(actor3);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor2);

        show.printListOfActors();
        opera.printListOfActors();
        ballet.printListOfActors();

        System.out.println("Замена актера в опере " + opera.title
                + ". Актер " + actor3 + " заменяется на " + actor1);
        opera.changeActor(actor1, "Рокуэл");
        opera.printListOfActors();

        System.out.println("Замена актера в балете " + ballet.title
                + ". Актер с фамилией ДиКаприо заменяется на " + actor1);
        ballet.changeActor(actor2, "ДиКаприо");

        System.out.println("-".repeat(30));
        System.out.println("Вывод либретт спектаклей:");
        opera.printLibretto();
        ballet.printLibretto();
    }
}