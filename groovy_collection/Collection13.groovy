String x="ANUSHA S NAIR"
x.eachWithIndex{p,index->
List l=x.findAll{it==p}
print p+l.size()+"\t";
}