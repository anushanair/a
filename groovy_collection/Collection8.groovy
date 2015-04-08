class Employee
{
  String Name;
  byte age;
  int salary;
}
Object[] obj=
[
new Employee(name:'Anusha',age:23 as byte,salary:350000),
new Employee(name:'Nimisha',age:19 as byte,salary:430000),
new Employee(name:'Sudhakaran',age:53 as byte,salary:500000),
new Employee(name:'Geetha',age:45 as byte,salary:300000),
new Employee(name:'Akanksha',age:23 as byte,salary:350000),
new Employee(name:'Pooja',age:22 as byte,salary:455000),
new Employee(name:'Mohit',age:24 as byte,salary:500000),
new Employee(name:'Varun',age:19 as byte,salary:55000),
]
8.times
{
print obj[it].Name+"\t"
print obj[it].age+"\t"
print obj[it].salary+"\n"
}
List l=[obj[0],obj[1]];
print l;