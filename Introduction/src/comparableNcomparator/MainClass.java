package comparableNcomparator;

import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(13, "Ram"));
		students.add(new Student(35, "Ram"));
		students.add(new Student(78, "Taran"));
		students.add(new Student(13, "Biji"));
		students.add(new Student(50, "Mom"));
		
//		Collections.sort(students, new SortByNameThenMarks());
//		Collections.sort(students, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				if(o1.name.equals(o2.name)) {
//					return o1.marks - o2.marks;
//				} else {
//					return o1.name.compareTo(o2.name);
//				}
//			}
//		});
		
//		Collections.sort(students, (o1, o2) ->{
//				// TODO Auto-generated method stub
//				if(o1.name.equals(o2.name)) {
//					return o1.marks - o2.marks;
//				} else {
//					return o1.name.compareTo(o2.name);
//				}
//			});
		
		Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());
		
		
		
		students.forEach(System.out::println);
	}

}

//class SortByNameThenMarks implements Comparator<Student>{
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		if(o1.name.equals(o2.name)) {
//			return o1.marks - o2.marks;
//		} else {
//			return o1.name.compareTo(o2.name);
//		}
//	}
//}


