package dev.patika.java101.fightergame;

public class Ring {
	
	Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {

        if (checkWeight()) {
            while (f1.getHealth() > 0 && f2.getHealth() > 0) {
            	
                	
                System.out.println("======== NEW ROUND ===========");
               
                
                int chance = Math.round((float)Math.random());
                System.out.println("chance : "+chance);
                if(chance == 0){
                        f2.setHealth(f1.hit(f2));
                        if (isWin())break;
                        
                        f1.setHealth(f2.hit(f1));
                        if (isWin()) break;
                }
                if(chance == 1){
                        f1.setHealth(f2.hit(f1));
                        if (isWin()) break;
                        
                        f2.setHealth(f1.hit(f2));
                        if (isWin()) break;
                }
                printScore();
        }
        }
    	else {
            System.out.println("The weights of the athletes do not match.");
        }
    }
        

    public boolean checkWeight() {
        return (f1.getWeight() >= minWeight && f1.getWeight() <= maxWeight) && (f2.getWeight() >= minWeight && f2.getWeight() <= maxWeight);
    }

    public boolean isWin() {
        if (f1.getHealth() == 0) {
            System.out.println("Winner: " + f2.getName());
            return true;
        } else if (f2.getHealth() == 0){
            System.out.println("Winner: " + f2.getName());
            return true;
        }

        return false;
    }
    

    public void printScore() {
    	
        System.out.println("------------");
        System.out.println(f1.getName() + " Remaining life \t:" + f1.getHealth());
        System.out.println(f2.getName() + " Remaining life \t:" + f2.getHealth());
    }

}
