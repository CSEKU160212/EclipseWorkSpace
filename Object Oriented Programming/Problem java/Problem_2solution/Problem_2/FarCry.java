package Problem_2;


public class FarCry {
String name;
private String type;

public FarCry(String name) {
this.name=name;
}
public String getType(){
	return type;
}
public void setType(String type)
{
	this.type=type;
}


public String toString(){
return "Game Name: "+name+"\nGame Type: "+getType();
}

}