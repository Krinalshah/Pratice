import datetime
class abc():
    t=210
    def __init__(self,name,r):
        self.name=name
        self.r=r
    def details(self):
        print(self.name)
        print(self.r)
    @staticmethod
    
    def age(bty):
        t_d=datetime.date.today()
        current_year=t_d.year
        a=current_year - bty
        print(a)
    @classmethod
    def per(cls):
        p=cls.t*100/300
        return p
    def printing(cls):
        b=cls.per()
        print(b)
        
   
a=abc.age(2001)
print(a)