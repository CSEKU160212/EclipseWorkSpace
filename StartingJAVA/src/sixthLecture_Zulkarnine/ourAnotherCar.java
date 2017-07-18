
package sixthLecture_Zulkarnine;

import Fifth_Lecture_Zulkarnine.*;

/**
 * @author LIMON
 *
 */
public class ourAnotherCar extends CarClass implements CarInterface{
	public ourAnotherCar() {
	super();
	
	}

	@Override
	public void driveCar(int drivingTimeInSecond) {
	// TODO Auto-generated method stub
		runForSec(drivingTimeInSecond);
	
	}

	@Override
	public void addAmountOfFuel(int Amount) {
	// TODO Auto-generated method stub
	addfuel(Amount);
	}

	@Override
	public int getManufacturingYear() {
	// TODO Auto-generated method stub
	return manufacturingYear;
	}
	
	@Override
	public String getCarModelName() {
	// TODO Auto-generated method stub
	return getCarModelName();
	}
	}
