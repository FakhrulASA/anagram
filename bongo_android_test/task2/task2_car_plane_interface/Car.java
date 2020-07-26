package task2_car_plane_interface;

public class Car implements Vehicle{

	public String model_number()
	{
		return "Toyota 202";
	}
	@Override
	public int set_num_of_wheels() {
		int no_of_wheels=4;
		return no_of_wheels;
	}

	@Override
	public int set_num_of_passengers() {
		// TODO Auto-generated method stub
		int num_of_passengers=6;
		return num_of_passengers;
	}

	@Override
	public boolean has_gas() {
		// TODO Auto-generated method stub
		return true;
	}

}
