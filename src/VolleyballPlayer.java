public class VolleyballPlayer extends Player implements ForceCalculate{
    private int number;
    private   int block;
   private int finish;


    @Override
    public int calculateForce() {
        int force=this.block+this.finish;
        return force;
          }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

       public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getFinish() {
        return finish;
    }

    public void setFinish(int finish) {
        this.finish = finish;
    }

    public VolleyballPlayer(String name, int age, int number, int block, int finish) {
        super(name, age);
        this.number = number;
        this.block = block;
        this.finish = finish;
    }

    @Override
    public String toString() {
        return "Volleyball player details:" +
                "\nnumber->" + getNumber() +
                "\nage->" + getAge() +
                "\nblock->" + getBlock() +
                "\nfinish->" +getFinish()+'\n';
    }
}
