package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component("console")
public class GridExamConsole implements ExamConsole {

	@Autowired
	//@Qualifier("exam2")
	private Exam exam;
	
	public GridExamConsole() {
		System.out.println("constructor");
	}

	 public GridExamConsole(Exam exam) {
		System.out.println("overloaded constructor");
		this.exam = exam;
	}

	@Override
	public void print() {
		if(exam==null)	{
		System.out.println("忙式式式式式式式式式成式式式式式式式式式忖");
		System.out.println("弛  total  弛   avg   弛");
		System.out.println("戍式式式式式式式式式托式式式式式式式式式扣");
	 	 System.out.printf("弛  %3d    弛  %3.2f  弛\n",0, 0.0);
	 	System.out.println("戌式式式式式式式式式扛式式式式式式式式式戎");
		} else {
		System.out.println("忙式式式式式式式式式成式式式式式式式式式忖");
		System.out.println("弛  total  弛   avg   弛");
		System.out.println("戍式式式式式式式式式托式式式式式式式式式扣");
	 	 System.out.printf("弛  %3d    弛  %3.2f  弛\n",exam.total(), exam.avg());
	 	System.out.println("戌式式式式式式式式式扛式式式式式式式式式戎");
		}
	}


	@Override
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		System.out.println("setter");
		this.exam=exam;
	}

}
