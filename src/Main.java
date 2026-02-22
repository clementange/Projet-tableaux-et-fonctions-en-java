import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double [] tableauNotes = new double [10];
        double note = 0;
        int index = 0;
        int nombreNotes = 0;

        while(note != -1) {
            System.out.print("Entrer des notes de 0 à 20 \nEntrer -1 pour mettre fin au progarmme : ");
            note = scanner.nextDouble();

            if(note == -1){
                System.out.println("Au revoir !");
                break;
            }
            else if (note >= 0 && note <= 20){
                if (index < tableauNotes.length) {
                    tableauNotes[index]=note;
                    index++;
                    nombreNotes++;
                } else {
                    System.out.println("Tableau plein ! Maximum 10 notes");
                    break;
                }
            }
            else{
                System.out.println("Note invalide !");
            }
        }

        if(nombreNotes == 0){
            System.out.println("Vous n'avez saisi aucune note ! ");
            scanner.close();
            return;
        }

        double sommeNote = 0;
        for(int i = 0; i < nombreNotes; i++){
            sommeNote = sommeNote + tableauNotes[i];
        }

        double moyenne = sommeNote / nombreNotes;

        for(int i = 0; i < nombreNotes; i++){
            System.out.println("Note " + (i+1) +" : "+ tableauNotes[i]);
        }

        System.out.println("Votre moyenne est de: "+ moyenne);

        int moyenneEnEntier = (int) moyenne;

        switch (moyenneEnEntier){
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println(moyenne+ " Excellent !");
                break;
            case 14:
            case 15:
                System.out.println(moyenne+ " Très bien !");
                break;
            case 13:
            case 12:
                System.out.println(moyenne+ " Bien !");
                break;
            case 11:
            case 10:
                System.out.println(moyenne+ " Passable !");
                break;
            default:
                if (moyenneEnEntier < 10){
                System.out.println(moyenneEnEntier+ " Échec !");
                break;
                 }
                else{
                System.out.println(moyenneEnEntier+ " Moyenne invalide ! ");
                }
        }
        scanner.close();

    }
}