
#ifndef STUDENT_H_
#define STUDENT_H_
#include<string>
using namespace std;
 namespace st{

class Student{
	string name;
	int rollNumber;
	float marks;
	char grade;
public:
	void setName(string name);
	void setRollN(int No);
	void setMarks(float Marks);
	void calculateGrade();
	void  printRecord();

};
}

#endif /* STUDENT_H_ */
