
create table User_Table(User_Id int generated always as identity start with 1 Primary key, 
User_Name varchar2(50), 
Email varchar2(50), 
Mobile_Number int, 
User_Password varchar2(50));

create table admin_detail (Admin_Id int Primary key, 
Admin_Name varchar2(50), 
Admin_Password varchar2(50));

create table application_details(foreign key(User_Id) references User_Table(User_Id),
Student_Name varchar2(50), 
Father_Name varchar2(50), 
DOB date,
Aadhar_Number int primary key,
SSLC_Mark int, 
HSC_Mark int,  
Address varchar2(100), 
City varchar2(50), 
U_State varchar2(40), 
Nationality varchar2(40),
U_Degree varchar(40));

create table course_details(Course_Id int primary key,
Course_Type varchar2(30) constraint course_type_cons check (Course_Type IN ('UG','PG')),
Course_Name varchar2(50));



create table Fees_List(Fees_Id int primary key,
foreign key(Course_Id) references course_details(Course_Id),
Admission_Fees int, 
Tuition_Fees int, 
Exam_Fees int);

