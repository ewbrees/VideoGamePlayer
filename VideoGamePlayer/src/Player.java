public class Player {
  String username;
  int strength_stat;
  int speed_stat;
  int luck_stat;

  public Player (String username) {
    this.username = username;  //username is chosen
    strength_stat = 1;
    speed_stat = 1;  //all stats start at one
    luck_stat = 1;
  }

  public void levelupall() {
    strength_stat++;
    speed_stat++;
    luck_stat++;
    System.out.println(username + "'s Strength is now " + strength_stat);
    System.out.println(username + "'s Speed is now " + speed_stat);
    System.out.println(username + "'s Luck is now " + luck_stat);
  }

  public void levelupstrength() {
    strength_stat++;
    System.out.println(username + "'s Strength is now " + strength_stat);
  }

  public void levelupspeed() {
    speed_stat++;
    System.out.println(username + "'s Speed is now " + speed_stat);
  }

  public void levelupluck() {
    luck_stat++;
    System.out.println(username + "'s Luck is now " + luck_stat);
  }

  public void changeusername(String newusername) {
    String oldusername = username;
    username = newusername;
    System.out.println(oldusername + "'s new username is " + username);
  }

  public void viewstats() {
    System.out.println(username + " has " + strength_stat + " Strength, " + speed_stat + " Speed, " + luck_stat + " Luck");
  }

  public int getstrength() {
    return strength_stat;
  }

  public int getspeed() {
    return speed_stat;
  }

  public int getluck() {
    return luck_stat;
  }

  public String getusername() {
    return username;
  }
}