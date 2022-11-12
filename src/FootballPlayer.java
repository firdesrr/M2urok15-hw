public class FootballPlayer extends Player implements ForceCalculate {

   private int tackling;//1,2,...10
   private int speed;//1,2,3,....,10
   private int scoring;//1,2,...,10

    @Override
    public int calculateForce() {
        int force=this.tackling+this.speed+this.scoring;
        return force;
    }



    public int getTackling() {
        return tackling;
    }

    public void setTackling(int tackling) {
        this.tackling = tackling;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getScoring() {
        return scoring;
    }

    public void setScoring(int scoring) {
        this.scoring = scoring;
    }

    public FootballPlayer(String name, int age, int tackling, int speed, int scoring) {
        super(name, age);
        this.tackling = tackling;
        this.speed = speed;
        this.scoring = scoring;
    }

    @Override
    public String toString() {
        return "Football player details:" +
                "\nname->'" + getName() +
                "\nage->" + getAge() +
                "\ntackling->" + getTackling() +
                "\nspeed->" + getSpeed() +
                "\nscoring->" + getScoring() +'\n';
    }
}
