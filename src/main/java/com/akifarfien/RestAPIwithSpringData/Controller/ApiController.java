package com.akifarfien.RestAPIwithSpringData.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.PostMapping;

import com.akifarfien.RestAPIwithSpringData.Repository.StudentRepo;
import com.akifarfien.RestAPIwithSpringData.bean.College;
import com.akifarfien.RestAPIwithSpringData.bean.Student;
import com.akifarfien.RestAPIwithSpringData.bean.University;

@RepositoryRestController
public class ApiController {
	
	@Autowired
	StudentRepo repo;
	
	@PostMapping("/students/create")
	public Student createRecords() {
		
		University uni0 = new University(1, "University of Delhi", 33445678001L);
		University uni1 = new University(2, "Indian Institute of Technology", 75878284262L);
		University uni2 = new University(3, "Savitribai Phule Pune University", 8590063401L);
		University uni3 = new University(4, "Lovely Professional University", 570206366636L);
		University uni4 = new University(5, "Dr. A.P.J. Abdul Kalam Technical University", 4612094762L);
		University uni5 = new University(6, "SRM Institute of Science and Technology", 865626033L);
		
		
		College col0 = new College(1, 6872346, "Netaji Subhash Institute of Technology", uni0);
		College col1 = new College(2, 8874583, "Delhi Technical University", uni0);
		College col2 = new College(3, 2044576, "IIT - Kanpur", uni1);
		College col3 = new College(4, 3113450, "IIT - Mumbai", uni1);
		College col4 = new College(5, 9007557, "IIT - Jammu", uni1);
		College col5 = new College(6, 6848738, "ABMSP's Anantrao Pawar College of Engineering and Research", uni2);
		College col6 = new College(7, 1257647, "ASM's College of Commerce Science and Information Technology, Pune", uni2);
		College col7 = new College(8, 7887764, "Lovely Professional University", uni3);
		College col8 = new College(9, 9874988, "Harcourt Butler Technological Institute", uni4);
		College col9 = new College(10, 998644, "Institute of Engineering & Technology (IET)", uni4);
		College col10 = new College(11, 3452340, "Hindustan College of Science and Technology", uni4);
		College col11 = new College(12, 6849347, "SRM - Chennai", uni5);
	
		Student stud0 = new Student(1, "Aisha", "Coumputer Science Engineering", col0);
		
		Student stud1 = new Student(2, "Shubham", "Mech. Engineering", col0);
		Student stud2 = new Student(3, "Menna", "Electronics & Communication Engineering", col0);
		
		Student stud3 = new Student(4, "Abhinav", "Coumputer Science Engineering", col1);
		Student stud4 = new Student(5, "Meraj", "Automobile", col1);
		Student stud5 = new Student(6, "Swapnil", "Electronics & Communication Engineering", col1);
		Student stud6 = new Student(7, "Aman", "Electronics & Communication Engineering", col1);
		
		Student stud7 = new Student(8, "Akif Arfien", "Electronics & Communication Engineering", col2);
		Student stud8 = new Student(9, "Hemant Kumar", "Coumputer Science Engineering", col2);
		Student stud9 = new Student(10, "Aisha", "Coumputer Science Engineering", col2);
		
		Student stud10 = new Student(11, "Shivam", "IT", col3);
		Student stud11 = new Student(12, "Vaibhav Gade", "Electronics & Communication Engineering", col4);
		
		Student stud12 = new Student(13, "Aisha", "Coumputer Science Engineering", col5);
		Student stud13 = new Student(14, "Aisha", "Coumputer Science Engineering", col5);
		Student stud14 = new Student(15, "Aisha", "Coumputer Science Engineering", col5);
		
		Student stud15 = new Student(16, "Aisha", "Coumputer Science Engineering", col5);
		Student stud16 = new Student(17, "Aisha", "Coumputer Science Engineering", col5);
		
		Student stud17 = new Student(18, "Aisha", "Coumputer Science Engineering", col5);
		Student stud18 = new Student(19, "Aisha", "Coumputer Science Engineering", col5);
		
		List<Student> list = new ArrayList<Student>();
		
		list.add(stud0);
		list.add(stud1);
		list.add(stud2);
		list.add(stud3);
		list.add(stud4);
		list.add(stud5);
		list.add(stud8);
		list.add(stud6);
		list.add(stud7);
		list.add(stud9);
		list.add(stud10);
		list.add(stud11);
		list.add(stud12);
		list.add(stud13);
		list.add(stud14);
		list.add(stud15);
		list.add(stud16);
		list.add(stud17);
		list.add(stud18);
		/*
		 * list.add(stud0); list.add(stud0); list.add(stud0); list.add(stud0);
		 * list.add(stud0); list.add(stud0); list.add(stud0); list.add(stud0);
		 */
		
		repo.saveAll(list);

		return stud0;
	}

}
