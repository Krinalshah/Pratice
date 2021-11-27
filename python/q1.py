
def createclass(func):
    def f(*args,**kwargs):
      print(args)  
      print(kwargs) 
      print("open file")
      fun(*args,**kwargs)
      print("close file")
      return f
@createclass
def details(a,b):
    c=a*b
    return c
a=details(2,2)
print(a)
