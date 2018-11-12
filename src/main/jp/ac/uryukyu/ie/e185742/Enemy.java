package jp.ac.uryukyu.ie.e185742;



public class Enemy extends LivingThing {

    public Enemy(){
        super("スライム", 6, 3);
    }

    @Override
    public void wounded(int damage){
        setHitPoint(getHitPoint() - damage);
        if( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }

}
