package jp.ac.uryukyu.ie.e185742;


public class Hero extends LivingThing{

    public Hero(){
        super("勇者", 10, 5);
    }

    @Override
    public void wounded(int damage){
        setHitPoint(getHitPoint() - damage);
        if( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("勇者%sは倒れた。\n", getName());
        }
    }
}
