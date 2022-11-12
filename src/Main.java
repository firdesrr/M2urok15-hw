import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void playMatch(Team  team1, Team team2) {
        int force1 = 0;
        int force2 = 0;
        Random random = new Random();
        int random1 = random.nextInt(5) + 1;
        int random2 = random.nextInt(5) + 1;
        force1 = team1.calculateForce() + random1;
        force2 = team2.calculateForce() + random2;
        if (force1 == force2) {
            System.out.println("Results from the match --> THE MATCH ENDED IN A DRAW!");
        } else if (force1 > force2) {
            System.out.println("Results from the match --> FOOOTBALL TEAM  " + team1.getName() + " WON!!!");
        } else {
            System.out.println("Results from the match --> FOOOTBALL TEAM " + team2.getName() + " WON!!!");
        }
    }

    public static void main(String[] args) {

        List<FootballPlayer> footballplayers1 = new ArrayList<>();
        List<FootballPlayer> footballplayers2 = new ArrayList<>();
        FootballPlayer player1 = new FootballPlayer("Mihaylov", 19, 10, 10, 10);
        FootballPlayer player2 = new FootballPlayer("Kremenliev", 18, 10, 10, 10);
        FootballPlayer player3 = new FootballPlayer("Ivanov", 18, 10, 10, 10);
        FootballPlayer player4 = new FootballPlayer("Kiriakov", 19, 10, 10, 10);
        FootballPlayer player5 = new FootballPlayer("Lechkov", 19, 10, 10, 10);
        FootballPlayer player6 = new FootballPlayer("Kostadinov", 18, 10, 10, 10);
        FootballPlayer player7 = new FootballPlayer("Balikov", 18, 10, 10, 10);
        FootballPlayer player8 = new FootballPlayer("Stoichkov", 19, 10, 10, 10);
        FootballPlayer player9 = new FootballPlayer("Penev", 19, 10, 10, 10);
        FootballPlayer player10 = new FootballPlayer("Sirakov", 18, 10, 10, 10);
        FootballPlayer player11 = new FootballPlayer("Yordanov", 18, 10, 10, 10);


        footballplayers1.add(player1);
        footballplayers1.add(player2);
        footballplayers1.add(player3);
        footballplayers1.add(player4);
        footballplayers1.add(player5);
        footballplayers1.add(player6);
        footballplayers1.add(player7);
        footballplayers1.add(player8);
        footballplayers1.add(player9);
        footballplayers1.add(player10);
        footballplayers1.add(player11);

        Team<FootballPlayer> footballteam1 = new Team("Национален отбор на България", "Димитър Пенев", footballplayers1, 150000.50);

        FootballPlayer fpl1 = new FootballPlayer("Юрген Колер", 19, 1, 1, 1);
        FootballPlayer fpl2 = new FootballPlayer("Томас Хелмер", 18, 1, 1, 1);
        FootballPlayer fpl3 = new FootballPlayer("Гуидо Бухвалд", 18, 1, 1, 1);
        FootballPlayer fpl4 = new FootballPlayer("Андреас Мьолер", 19, 1, 1, 1);
        FootballPlayer fpl5 = new FootballPlayer("Томас Хеслер", 19, 1, 1, 1);
        FootballPlayer fpl6 = new FootballPlayer("Мартин Вагнер", 18, 1, 1, 1);
        FootballPlayer fpl7 = new FootballPlayer("Юрген Клинсман", 18, 1, 1, 1);
        FootballPlayer fpl8 = new FootballPlayer("Бодо Илгнер", 19, 1, 1, 1);
        FootballPlayer fpl9 = new FootballPlayer("Лотар Матеус ", 19, 1, 1, 1);
        FootballPlayer fpl10 = new FootballPlayer("Руди Фьолер", 18, 1, 1, 1);
        FootballPlayer fpl11 = new FootballPlayer("Томас Бертолд", 18, 1, 1, 1);


        footballplayers2.add(fpl1);
        footballplayers2.add(fpl2);
        footballplayers2.add(fpl3);
        footballplayers2.add(fpl4);
        footballplayers2.add(fpl5);
        footballplayers2.add(fpl6);
        footballplayers2.add(fpl7);
        footballplayers2.add(fpl8);
        footballplayers2.add(fpl9);
        footballplayers2.add(fpl10);
        footballplayers2.add(fpl11);

        Team<FootballPlayer> footballteam2 = new Team<>("Национален отбор на Германия", " Берти Фогтс", footballplayers2, 150000.50);

        System.out.println(footballteam1.getName() + " has force= " + footballteam1.calculateForce());
        System.out.println(footballteam2.getName() + " has force= " + footballteam2.calculateForce());
        playMatch(footballteam1, footballteam2);

        List<VolleyballPlayer> volleyballPlayers1 = new ArrayList<>();
        List<VolleyballPlayer> volleyballPlayers2 = new ArrayList<>();
        VolleyballPlayer vplayer1=new VolleyballPlayer("Ivanov",20,7,5,5);
        VolleyballPlayer vplayer2=new VolleyballPlayer("Petrov",20,8,5,5);
        VolleyballPlayer vplayer3=new VolleyballPlayer("Stoyanov",20,9,1,5);
        VolleyballPlayer vplayer4=new VolleyballPlayer("Vasilev",19,10,2,4);
        volleyballPlayers1.add(vplayer1);
        volleyballPlayers1.add(vplayer2);
        volleyballPlayers2.add(vplayer3);
        volleyballPlayers2.add(vplayer4);
        Team<VolleyballPlayer> vteam1=new Team<>("Svetkavitca","Valentin Dobrev",volleyballPlayers1,12000.50);
        Team<VolleyballPlayer> vteam2=new Team<>("Beroe","Valentin Dobrev",volleyballPlayers2,12000.50);
        System.out.println( );
        System.out.println(vteam1.getName() + " has force= " + vteam1.calculateForce());
        System.out.println(vteam2.getName() + " has force= " + vteam2.calculateForce());
        playMatch(vteam1, vteam2);
    }
}

