class Main {
  public static void main(String[] args) {
    Player newuser = new Player("Noob");
    newuser.levelupall();
    newuser.levelupluck();
    newuser.levelupluck();

    Player chad = new Player("Chad");
    chad.levelupstrength();
    chad.levelupstrength();
    chad.changeusername("Massive Chad");
    chad.viewstats();

    chad.changeusername(newuser.getusername() + "'s brother");
    chad.strength_stat = 20;
    chad.levelupstrength();
    chad.luck_stat = newuser.luck_stat;
    chad.levelupluck();
  }
}