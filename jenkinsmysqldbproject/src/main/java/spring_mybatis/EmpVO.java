package spring_mybatis;

public class EmpVO {
//eMPLOYEES 테이블 컬럼 = 변수
	String first_name, last_name, email, phone_number, hire_date, job_id;
	int employee_id, manager_id, department_id;
	double salary, commission_pct;
	
	public EmpVO() {}
	
	public EmpVO(int employee_id,String first_name, String last_name, String email, 
			String phone_number, String job_id,  int manager_id, double salary,int department_id ) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_number = phone_number;
		this.job_id = job_id;
		this.employee_id = employee_id;
		this.manager_id = manager_id;
		this.department_id = department_id;
		this.salary = salary;
	}

	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getHire_date() {
		return hire_date;
	}
	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getCommission_pct() {
		return commission_pct;
	}
	public void setCommission_pct(double commission_pct) {
		this.commission_pct = commission_pct;
	}
	@Override
	public String toString() {
		return "EmpVO [first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + ", phone_number="
				+ phone_number + ", hire_date=" + hire_date + ", job_id=" + job_id + ", employee_id=" + employee_id
				+ ", manager_id=" + manager_id + ", department_id=" + department_id + ", salary=" + salary
				+ ", commission_pct=" + commission_pct + "]";
	}

	
	
}
