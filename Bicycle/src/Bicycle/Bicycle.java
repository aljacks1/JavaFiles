package Bicycle;
/* 
An exercise from the Java tutorials meant to exemplify classes and objects
**/
public class Bicycle {
//a bicycle *has* a gear a speed and a cadence
	int gear;
	int speed;
	int cadence;
	
//a bicycle *can* change gear speed and cadence
	void changeGear(int newValue) {
		gear = newValue;
	}
	void changeSpeed (int newValue) {
		speed = newValue;
	}
	void changeCadence(int newValue) {
		cadence = newValue;
	}
	//this class is complete or can be added to with new methods like changeColor in the future
}
