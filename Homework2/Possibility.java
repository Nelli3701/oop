public class Possibility {
    //Сделать возможность у животных летать, если это животное птица, проявлять ласку,
    // если это домашнее животное и дрессировать, если это животное собака.
    public static void possibilities(Animal[] animals) {
        for(Animal animal : animals) {
            if (animal instanceof Fly) {
                ((Fly) animal).fly();
            }
            if(animal instanceof ShowAffection) {
                ((ShowAffection) animal).showAffection();
            }
            if(animal instanceof Train) {
                ((Train) animal).train();
            }
            System.out.println();
        }
    }
}
