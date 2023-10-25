import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);

        System.out.println("Hur många kilometer bort från jobbet bor du?");
        int avstånd = tangentbord.nextInt();

        if(avstånd>=50){
            System.out.println("Bor du ensam eller med en sambo?");
            System.out.println("1. Ensam");
            System.out.println("2. Med en sambo");
            int lev = tangentbord.nextInt();
            
            if(lev==1){
                System.out.println("Hur många år vet du jobbet kommer att vara?");
                int år = tangentbord.nextInt();

                if(år>=1){
                    System.out.println("Du har rätt till skatteavstånd");
                }else{
                    System.out.println("Du har inte rätt till skatteavdrag");
                }
            }else if(lev==2){
                System.out.println("Hur många år vet du jobbet kommer att vara?");
                int år = tangentbord.nextInt();
                if(år>=3){
                    System.out.println("Du har rätt till skatteavstånd");
                }else{
                    System.out.println("Du har inte rätt till skatteavdrag");
                }

            }else{
                System.out.println("Du angav ett ogiltigt alternativ");
            }

        }else{
            System.out.println("Du har inte rätt till skatteavdrag");
        }


    }
}
