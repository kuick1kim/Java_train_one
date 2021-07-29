package chap15.three;

public class Student {
	public int sno;
	public String name;

	public Student (int sno, String name) {
		this.sno =sno;
		this.name = name;
		
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return(sno == student.sno) && (name.equals(student.name));
		} else {
			return super.equals(obj);			
		}		
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

}
