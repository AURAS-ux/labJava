package src;

// import java.util.ArrayList;
// import java.util.Collections;

public class TestClass {	
	public static void main(String[] args) {
		DataManager dataManager = new DataManager();
		
		dataManager.gradeStudents();
		dataManager.manager.reportAllCourses();
		dataManager.manager.reportAllStudentsGrades();
		dataManager.manager.reportAllCourses();
		try {
			dataManager.manager.RemoveCurs(new Curs("PLCP 1"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Dupa stergere:");
		dataManager.manager.reportAllCourses();
		
		dataManager.manager.reportAllStudentsGrades();
		
		try {
			dataManager.manager.EditCurs(new Curs("Limba engleza"), new Curs("Limba engleza II", "descriere", new Profesor("Ana", "Maria"), dataManager.createRandomSetOfStudents()));
			dataManager.manager.reportAllCourses();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// dataManager.sorteazaStudentiDupaGrupa();
		// ArrayList<Student>studenti=new ArrayList<>();
		// for(Student s:dataManager.dataSetOfStudent){
		// 	studenti.add(s);
		// }
		
		// Collections.sort(studenti);
		// for(Student s:studenti){
		// 	System.out.println(s);
		// }
		// SortareCursDupaNume s1=new SortareCursDupaNume();
		// dataManager.manager.cursuri.sort(s1);
		// for(Curs c:dataManager.manager.cursuri){
		// 	System.out.println(c.nume);
		// }
	}
}
