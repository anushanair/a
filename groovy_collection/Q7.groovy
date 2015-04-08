dirName ="file"
def nfile=new File("file1.txt")
new File(dirName).eachFile()
{
   file-> file.eachLine{line->nfile<<line<<"\n";}
}