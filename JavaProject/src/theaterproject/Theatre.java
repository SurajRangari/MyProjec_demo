package theaterproject;

public class Theatre {
	private int t_id;
	private String t_name;
	Movie m;
	 int getT_id() {
		return t_id;
	}
     void setT_id(int t_id) {
		this.t_id = t_id;
	}
	 String getT_name() {
		return t_name;
	}
	 void setT_name(String t_name) {
		this.t_name = t_name;
	}
	 Movie getM() {
		return m;
	}
	 void setM(Movie m) {
		this.m = m;
	}
	@Override
	public String toString() {
		return "Theatre [t_id=" + t_id + ", t_name=" + t_name + ", m=" + m + "]";
	}
	
	

}
