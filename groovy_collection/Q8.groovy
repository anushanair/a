def nfile=new File('file1.txt')
def file=new File('file1.txt')
int var=0;
file.eachLine{line->print line
   var++
   if(var%2!=0)
   nfile<<var<<" "<<line<<"\n";
}
