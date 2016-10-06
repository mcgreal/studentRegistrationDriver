package Com.CiaranMcGreal.CT417.Assign1_Driver;

import java.util.*;
import Com.CiaranMcGreal.CT417.Assign1.*;
import org.joda.time.DateTime;

public class Driver {

	public static void main(String[] args){
		
		//Three student objects are created
		Student jack = new Student("Jack Frost", "20", "13/01/96", "12345687");
	    Student john = new Student("John Doe", "21", "25/06/95", "14425589");
	    Student jim = new Student("Jim Power", "22", "01/05/94", "11325675");	
	    
	    //Student array lists are created
	    ArrayList<Student> elec = new ArrayList<Student>();
	    ArrayList<Student> tele = new ArrayList<Student>();
	    
	    ArrayList<Student> prog = new ArrayList<Student>();
	    ArrayList<Student> mach = new ArrayList<Student>();
	    
	    ArrayList<Student> pM = new ArrayList<Student>();
	    ArrayList<Student> manAcc = new ArrayList<Student>();
	    
	    //Module objects are created
	    Module electronics = new Module("Electronics", "EE123", elec);
	    Module telecoms = new Module("Telecommunications", "EE189", tele);
	    
	    Module programming = new Module("Programming", "CT167", prog);
	    Module machineLearning = new Module("Machine Learning", "CT195", mach);
	    
	    Module projectManagement = new Module("Project Management", "ME198", pM);
	    Module managementAccounting = new Module("Management Accounting", "CM142", manAcc);
	    
	    //Module array lists are created
	    ArrayList<Module> eng = new ArrayList<Module>();
	    ArrayList<Module> csIT = new ArrayList<Module>();
	    ArrayList<Module> comm = new ArrayList<Module>();
	    
	    //Start and end dates of the programmes are created
	    DateTime engStartDate = new DateTime();
		DateTime engEndDate = new DateTime();
		DateTime csITStartDate = new DateTime();
		DateTime csITEndDate = new DateTime();
		DateTime commStartDate = new DateTime();
		DateTime commEndDate = new DateTime();

		//Three programmes are created: Engineering, Computer Science & IT, Commerce
	    Programme engineering = new Programme("Engineering", eng, engStartDate, engEndDate);
	    Programme computerScience = new Programme("Computer Science & IT", csIT, csITStartDate, csITEndDate);
	    Programme commerce = new Programme("Commerce", comm, commStartDate, commEndDate);
	    
	    //Jack is added to the student array lists elec and tele
	    elec.add(jack);
	    tele.add(jack);
	    
	    //John is added to the student array lists prog and mach
	    prog.add(john);
	    mach.add(john);
	    
	    //Jim is added to the student array lists pM and manAcc
	    pM.add(jim);
	    manAcc.add(jim);
	    
	    //The modules are added to the respective module array lists
	    eng.add(electronics);
	    eng.add(telecoms);
	    
	    csIT.add(programming);
	    csIT.add(machineLearning);
	    
	    comm.add(projectManagement);
	    comm.add(managementAccounting);
	    
	    //The printStudents, printModules and printProgramme methods are called
	    printStudents(elec);
	    printModules(eng);
	    printProgramme(engineering);
	    
	    printStudents(prog);
	    printModules(csIT);
	    printProgramme(computerScience);
	    
	    printStudents(pM);
	    printModules(comm);
	    printProgramme(commerce);
	}
	
	//The printStudents method prints out the students in the specified student array list
	public static String printStudents(ArrayList<Student> students){
		int i = 0;
		String output="";
		
		for(i=0; i<students.size(); i++){
			output+=students.get(i).getStudName() + "\n";
		}
		System.out.println("Student Name: " +output);
		return output;
	}
	
	//The printModules method prints out the modules in the specified module array list
	public static String printModules(ArrayList<Module> modules){
		int j=0;
		String output="";
		
		for(j=0; j<modules.size(); j++){
			output+=modules.get(j).getModule()+ "\n";
		}
		System.out.println("Module(s): " +output);
		return output;
	}
	
	//The printProgramme prints out the course name of the specified programme
	public static void printProgramme(Programme programme){
		System.out.println("Course Title: " +programme.getCourseName());
		System.out.println("---------");
	}
}