package multilevel;

public class Main_Restaurant {

	public static void main(String[] args) {
		
		
		Mughal_Restaurant r1= new Mughal_Restaurant ("RAJ DARBAR");
		Chinese_Restaurant c1= new Chinese_Restaurant("CHINA TOWN");
		Confinental_Restaurant d1=new Confinental_Restaurant("TAJ");
		
		
		r1.specialItem("BIRYANI");
		c1.specialItem("CHINES RICE");
		d1.specialItem("PASTA");
		
		}

}
