package task2_car_plane_interface;

public class Plane implements Vehicle{

	public String model_number()
	{
		return "Airbus 303";
	}
	@Override
	public int set_num_of_wheels() {
		// TODO Auto-generated method stub
		int no_of_wheels=8;
		return no_of_wheels;
	}

	@Override
	public int set_num_of_passengers() {
		// TODO Auto-generated method stub
		int num_of_passengers=190;
		return num_of_passengers;
	}

	@Override
	public boolean has_gas() {
		// TODO Auto-generated method stub
		return false;
	}

}
