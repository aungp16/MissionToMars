/**
 *  Created Patrick Aung on 8/25/18
 */

public class U2 extends Rocket {

    private final int ROCKET_WEIGHT = 18000;
    private final int MAX_WEIGHT = 29000;
    private final int ROCKET_COST = 120000000;

    public U2(){
        super.setRocketWeight(ROCKET_WEIGHT);
        super.setMaxWeight(MAX_WEIGHT);
        super.setCargoWeight(0);
        super.setTotalWeight(ROCKET_WEIGHT);
        super.setRocketCost(ROCKET_COST);
    }

    public boolean launch(){ return (4*(getCargoWeight()/getMaxWeight()) <= Math.random()*10); }
    public boolean land(){ return (8*(getCargoWeight()/getMaxWeight()) <= Math.random()*10); }

}