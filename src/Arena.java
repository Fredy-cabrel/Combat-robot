public class Arena {
    private Figter nom_f;

    public Arena(){}
    public Figter fight(Figter F1,Figter F2){
        while (F1.getVie_f()>0 && F2.getVie_f()>0){
            F1.fire_f(F2);
            F2.fire_f(F1);
        }
        F2.isDead();
        return F1;
    }
}



/*public class Arena {
    public Arena(){}
    public Robot fight(Robot Rob1,Robot Rob2){
        while (Rob1.getVie()>0 && Rob2.getVie()>0){
            Rob1.fire(Rob1, Rob2);
            Rob2.fire(Rob2, Rob1);
        }
        Rob2.isDead();
        return Rob1;
    }
}*/