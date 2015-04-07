function date1()
{
 return new Date();
}
function cal()
{
  var d = date1();
  document.write(d.getDate()+" "+d.getMonth()+" "+d.getFullYear()+" "+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
}
