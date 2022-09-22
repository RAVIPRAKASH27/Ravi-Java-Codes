

public class Average_Population {

	public static void main(String[] args) {
		
		int previous_population=175000;
		int current_population=262500;
		int difference_decade=current_population-previous_population;
		int percent_decade=(difference_decade*100)/previous_population; 
		int percent_year=(percent_decade/10);
		System.out.println("average percent increase in population  per year:"+percent_year+"%");
		
	}

}
