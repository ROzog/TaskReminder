package pl.bartekrobert.taskreminder.views;

public class MainView {
    public void showWelcomeText(){
        System.out.println("Witaj w programie");
    }
    public void showLoginText(){
        System.out.println("Podaj swoj login: ");
    }
    public void showPasswordText(){
        System.out.println("Podaj swóje hasło: ");
    }
    public void showMainMenuTextFirstPart(){
        System.out.println("Cześć: Wstawić imie usera");
        System.out.println("Zadania na dzisiaj: ");
    }
    public void showMainTextSecondPart(){
        System.out.println("Co chcesz dzisiaj zrobić?");
        System.out.println("1: Dodać dowe zadanie");
        System.out.println("2: Oznaczyć jakies zadanie jako zrobione");
        System.out.println("3: Wyjść z programu");
    }


}
