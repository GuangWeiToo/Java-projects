public class Champion {
    private String name,archtype;
Champion(String n, String archtype){
    this.name=n;
    this.archtype=archtype;
}
//copy
Champion(Champion other){
    this.name=other.name;
    this.archtype=other.archtype;
}
public void setName(String name){
	this.name=name;
}
public String getName(){
return name;
}
public void setArchtype(String archtype){
 this.archtype=archtype;
}
public String getArchtype(String archtype){
 return archtype;
}
public String toString(){
 return "\n Champion:"+name+"\n Archtype:"+archtype;
}
}
