import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        director.setNumberOfShows(director.getNumberOfShows() + 1);
    }

    void printListOfActors() {
        System.out.println(title + ", cписок актеров:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
        System.out.println("-".repeat(25));
    }

    void addActor(Actor actor) {
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
        } else {
            System.out.println("Данный актер уже принимает участие в спектакле.");
        }
    }

    void changeActor(Actor newActor, String surnameCurrentActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surnameCurrentActor)) {
                listOfActors.set(i, newActor);
                return;
            }
        }

        System.out.println("Актера, которого вы хотите поменять нет в спектакле.");
    }
}
