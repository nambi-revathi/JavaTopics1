package has_A_relationship;                 //Aggregation

public class HotelDriver {

	public static void main(String[] args) {
		Hotel h=new Hotel("MeghanasFoods","Bangalore");
		System.out.println(h.hname);
		System.out.println(h.address);
		h.connection(new Swiggy("Revathi",34567,"Bangalore"));
		System.out.println(h.s.cname);
		System.out.println(h.s.cno);
		System.out.println(h.s.address);
		
	}

}
