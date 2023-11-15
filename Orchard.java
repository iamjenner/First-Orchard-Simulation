public class Orchard{
  
  private int red;
  private int blue;
  private int green;
  private int yellow;
  private int raven;
  private int basket;
  private static int numWins;
  private static int totalGames;

  public Orchard(){
    red = 4;
    blue = 4;
    green = 4;
    yellow = 4;
    raven = 0;
    basket = 0;
    numWins = 0;
    totalGames= 0;
  }

  public String playGame(){
    int x = (int)(Math.random()*6)+1;
    red = 4;
    blue = 4;
    green = 4;
    yellow = 4;
    raven = 0;
    basket = 0;
    while(basket != 16){
      if(x==1 && red!=0){
        red--;
        basket++;
      }
      else if(x==2 && blue!=0){
        blue--;
        basket++;
      }
      else if(x==3 && green!=0){
        green--;
        basket++;
      }
      else if(x==4 && yellow!=0){
        yellow--;
        basket++;
      }
      else if(x==5){
        raven++;
        if(raven == 5){
          totalGames++;
          return "You lost.";
        }
      }
      else{
        if(x==6){
        if(red >= blue && red>=green && red >= yellow){
          red--;
          basket++;
        }
        else if(blue >= red && blue >= green && blue >= yellow){
          blue--;
          basket++;
        }
        else if(green >= red && green >= blue && green >= yellow){
          green--;
          basket++;
        }
        else{
          yellow--;
          basket++;
        }
        }
      }
      x = (int)(Math.random()*6)+1;
    }
    numWins++;
    totalGames++;
    return "You win.";
  }

  public double winProbability(){
    return (double)(numWins)/totalGames;
  }
}
