String str= "http://www.google.com?name=anusha&age=23&hobby=reading"
def var=str.tokenize("?")
def key
var.each{ 
 key=it.split("&")
}
key.each{ 
 println it
}