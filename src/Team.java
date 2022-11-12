import java.util.ArrayList;
import java.util.List;

public class Team <T> implements ForceCalculate {
    private String name;
   private String coach;
  private List<T> players = new ArrayList<>();
   private double budget;

   @Override
   public int calculateForce() {
      int force=0;

      for (T player : players) {
          if (player instanceof FootballPlayer) {
              force+=((FootballPlayer) player).calculateForce();
          }
          else if (player instanceof VolleyballPlayer){
              force+=((VolleyballPlayer) player).calculateForce();
          }
      }
         return force;
      }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoach() {
      return coach;
   }

   public void setCoach(String coach) {
      this.coach = coach;
   }

   public List<T> getPlayers() {
      return players;
   }

   public void setPlayers(List<T> players) {
      this.players = players;
   }

   public double getBudget() {
      return budget;
   }

   public void setBudget(double budget) {
      this.budget = budget;
   }

   public Team(String name, String coach, List<T> players, double budget) {
     this.name=name;
      this.coach = coach;
      this.players = players;
      this.budget = budget;
   }

   @Override
   public String toString() {
      return "Team details:" +
              "\nname->'" + getName() +
              "\ncoach->'" + getCoach() +
              "\nplayers->" + getPlayers() +
              "\nbudget->" + getBudget() +'\n';
   }
}
