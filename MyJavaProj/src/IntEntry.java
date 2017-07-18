class IntEntry extends TextEntry {

 public IntEntry(String prompt) {
  super(prompt);
 }
public int getIntValue() {
  return Integer.parseInt(getValue());
 }
public void setIntValue(int n){
	setValue(Integer.toString(n));
}
}
