function ret_date()
{
  var d=new Date();
  var day=d.getDate();
  var mon=(d.getMonth()+1);
  var year=d.getFullYear();
  var dt=day+"/"+mon+"/"+year;
  alert("DATE= "+dt);
}

function ret_time()
{
  var d=new Date();
  var hr=d.getUTCHours();
  var m=d.getUTCMinutes();
  var s=d.getUTCSeconds();
  var time=hr+":"+m+":"+s;
  alert("TIME= "+time);
}
function ret_time2()
{
  var d=new Date();
  var hr=d.getUTCHours();
  var m=d.getUTCMinutes();
  var s=d.getUTCSeconds();
  var time=hr+":"+m+":"+s;
  return time;
}
function ret_DateTime()
{
  var d=new Date();
  var day=d.getDate();
  var mon=(d.getMonth()+1);
  var year=d.getFullYear();
  var dt=day+"/"+mon+"/"+year;

  var hr=d.getUTCHours();
  var m=d.getUTCMinutes();
  var s=d.getUTCSeconds();
  var time=hr+":"+m+":"+s;
  dtt=dt+" | "+time;
  alert("FULL DATE: "+ dtt);
}


