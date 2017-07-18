public class Die {
  private int numFaces;  // maximum face value
  private int faceValue;  // current value showing on the die
  
  //  Constructor: Sets the initial face value.
  public Die(int _numFaces)  {
    numFaces = _numFaces;
    roll();
  }
  
  //  Rolls the die
  public void roll() {
    faceValue = (int)(Math.random() * numFaces) + 1;
  }
  
  //  Face value setter/mutator.
  public void setFaceValue (int value)  {
    if (value <= numFaces)
      faceValue = value;
  }
  //  Face value getter/accessor.
  public int getFaceValue() {
    return faceValue;
  }
  
  //  Face value getter/accessor.
  public int getNumFaces() {
    return numFaces;
  }
  
  //  Returns a string representation of this die.
  public String toString() {
    return "number of Faces " + numFaces +
      " current face value " + faceValue;
 }
}