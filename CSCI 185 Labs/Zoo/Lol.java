public class Lol {
    private String game_name;
    private Champion[] champions;

    Lol(String game_name,Champion[] champions){
    this.game_name=game_name;
    for(int i=0;i<champions.length;i++){
    this.champions[i]= new Champion(champions[i]);
    }
    }
    public void setGame(String game_name){
    this.game_name= game_name;
    }
    public String getGame(){
    return game_name;
    }
    public void setChampions(Champion[] alt_champions){
    this.champions= new Champion[champions.length];
    for(int i=0; i<alt_champions.length;i++){
    this.champions[i]=new Champion(champions[i]);
    }
    }
    public Champion[] getChampions(){
    Champion[] temp=new Champion[this.champions.length];
    for(int i=0; i<temp.length;i++){
    temp[i]= new Champion(this.champions[i]);
    }
    return temp;
    }
    public String toString(){
    String S="Game info:"+game_name;
    for(int i=0; i<this.champions.length;i++){
    S+= "Champion #"+ (i+1)+":\n" + this.champions[i].toString()+"\n\n";
    }
    return S;
    }
    }