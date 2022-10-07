package encapsulation;

 class Main_Encapsulation1 {

	public static void main(String[] args) {
		
		// calling setter method using object of class
		
		Encapsulation1 e = new Encapsulation1();
		e.setId(101);
		e.setCollege_name("anudip");
		e.setCourse_name("java");
		
		// calling getter method using object of class
		
		System.out.println("id is :- "+ e.getId());
		System.out.println("college name is :- "+ e.getCollege_name());
		System.out.println("course name is :- "+ e.getCourse_name());

	}

}
