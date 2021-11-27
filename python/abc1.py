from datetime import date
class abc():
    a=0.5
    def __init__(self,fn,ln):
      self.fullname=self.name(fn,ln)

    def name(self,fn,ln):
        fullname=fn+ln
        print (fullname) 
        print(self.triangle(2,4)) 
    @classmethod
    def triangle(cls,b,h):
        print (f"area of triangle is{b*h*cls.a}")
        print(cls.age(2000))
    
    @staticmethod
    def age(by):
      td=date.today()
      cy=td.year
      age=cy-by
      
      return age
      
abc.triangle(2,3)
age=abc.age(2001)
print(age)
obj=abc("krinal","shah")
