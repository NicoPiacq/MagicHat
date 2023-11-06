import java.util.Random;

public class MagicHat {

    public static void main(String[] args) {
        String[] students = new String[] {
            "Paolo Lauria",
            "Luigi Palladino",
            "Francesca Daniele",
            "Giovanni Rinaldi",
            "Sara Sessa",
            "Francesco Moxedano",
            "Alessandro Esposito",
            "Giorgia Melillo",
            "Fabio Manna",
            "Bryan Agustin",
            "Salvatore Orecchio",
            "Gianluca Marano",
            "Marco Suriano",
            "Ciro Matarese",
            "Valentina Issich",
            "Michelangelo Muscatiello",
            "Giacomo Santi",
            "Karim",
            "Martina Casucci",
            "Alessio Del Punta",
            "Tommaso Mugnai",
            "Nicola Piacquaddio",
            "Bechir Labidi",
            "Mario Rega",
            "Federico Quai",
            "Donato Dipalma",
            "Alberto Cenni",
            "Renato Eva",
            "Daniele Schiavo"
        };

        final int NUM_HOUSES = 4;
        final int DIM_HOUSES = students.length/NUM_HOUSES + 1;
        final int REST = students.length%NUM_HOUSES;
        String[] gryffindor = new String[DIM_HOUSES];
        String[] slytherin = new String[DIM_HOUSES];
        String[] hufflepuff = new String[DIM_HOUSES];
        String[] ravenclaw = new String[DIM_HOUSES];
        int iG = 0, iS = 0, iH = 0, iR = 0;
        Random hat = new Random();
        int destiny;

        
        for(int i = 0; i < (students.length - REST); i++) {
            boolean assigned = false;
            do {
                destiny = hat.nextInt(NUM_HOUSES);
                switch(destiny) {
                    case 0: // GRYFFINDOR
                        if(iG < DIM_HOUSES-1) {
                            gryffindor[iG] = students[i];
                            assigned = true;
                            iG++;
                        }
                        break;
                    case 1: // SLYTHERIN
                        if(iS < DIM_HOUSES-1) {
                            slytherin[iS] = students[i];
                            assigned = true;
                            iS++;
                        }
                        break;
                    case 2: // HUFFLEPUFF
                        if(iH < DIM_HOUSES-1) {
                            hufflepuff[iH] = students[i];
                            assigned = true;
                            iH++;
                        }
                        break;
                    case 3: // RAVENCLAW
                        if(iR < DIM_HOUSES-1) {
                            ravenclaw[iR] = students[i];
                            assigned = true;
                            iR++;
                        }
                        break;                    
                }             
            } while(!assigned);
        }

        for(int i = (students.length - REST); i < students.length; i++) {
            boolean assigned = false;
            do {
                destiny = hat.nextInt(NUM_HOUSES);
                switch(destiny) {
                    case 0: // GRYFFINDOR
                        if(iG < DIM_HOUSES) {
                            gryffindor[iG] = students[i];
                            assigned = true;
                            iG++;
                        }
                        break;
                    case 1: // SLYTHERIN
                        if(iS < DIM_HOUSES) {
                            slytherin[iS] = students[i];
                            assigned = true;
                            iS++;
                        }
                        break;
                    case 2: // HUFFLEPUFF
                        if(iH < DIM_HOUSES) {
                            hufflepuff[iH] = students[i];
                            assigned = true;
                            iH++;
                        }
                        break;
                    case 3: // RAVENCLAW
                        if(iR < DIM_HOUSES) {
                            ravenclaw[iR] = students[i];
                            assigned = true;
                            iR++;
                        }
                        break;                    
                }             
            } while(!assigned);            
        }

        // STAMPO LE CASE
        System.out.println("\n== GRYFFINDOR ==");
        for(int i = 0; i < iG; i++) {
            System.out.println(gryffindor[i]);
        }

        System.out.println("\n== SLYTHERIN ==");
        for(int i = 0; i < iS; i++) {
            System.out.println(slytherin[i]);
        }

        System.out.println("\n== HUFFLEPUFF ==");
        for(int i = 0; i < iH; i++) {
            System.out.println(hufflepuff[i]);
        }

        System.out.println("\n== RAVENCLAW ==");
        for(int i = 0; i < iR; i++) {
            System.out.println(ravenclaw[i]);
        }        
    }

}