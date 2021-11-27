class details:
   
    def __init__(self,name,rollno):
        self.name=name
        self.rollno=rollno 
        self.marks={}
    def m(self):
      sum=0
      for i in range(0,2):
       p=str(input("enter the subject name: "))
       k=int(input("enter the marks out of 50: "))
       self.marks.update({p:k})
      print(self.marks["maths"])
    
      sum=sum+self.marks["maths"]+self.marks["sci"]  
      print(sum)     
        
    def print(self):
    
    
       print("name= ",self.name)
       print("rollno= ",self.rollno)
       print("marks= ",self.marks)
     
  
name=str(input("enter the name:"))
rollno=int(input("enter your rollno:")) 
d=details(name,rollno) 
d.m()
d.print()
     