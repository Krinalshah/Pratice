class details:
   
    def __init__(self,name,rollno):
        self.name=name
        self.rollno=rollno 
        self.marks=[]
    def m(self):
      for i in range(0,4):
       k=int(input("enter the marks out of 50: "))
       self.marks.append(k)
       if self.marks[i]>50:
              print("you have enter wrong marks")
              break
        
    def print(self):
    
    
       print("name= ",self.name)
       print("rollno= ",self.rollno)
       print("marks= ",self.marks)
    def total(self):
        sum=0
        for i in self.marks:
            sum=sum+i
        print("Total=",sum)
        per=(sum*100)/200 
        print("percentage=",per)
        if per >=80:
          print("Grade=A")
        if per <80 and per >60:
           print("Grade=B") 
        if per <60 and per >40:
           print("Grade=C") 
        if per <40 :
           print("You are fail") 
    def update(self):
      print("update the marks")
      n=int(input("enter the position "))
      self.marks[n]=int(input("enter the marks out of 50"))
      
for i in range(0,2): 
  
  name=str(input("enter the name:"))
  rollno=int(input("enter your rollno:")) 
  d=details(name,rollno) 
  d.m()
  for j in range(0,4):
   if d.marks[j]>50:
    break 
  if d.marks[j]>50:
    break 
  else:
    print("1-upadte the marks")
    print("2-print the details")
    print("3- percentage")
    print("4-to exit")
    ch=int(input("enter your choice"))
    while(ch!=4):
     
     if ch==1:
      d.update()
     if ch==2:
      d.print()
     if ch==3:
      d.total()
     ch=int(input("enter your choice"))