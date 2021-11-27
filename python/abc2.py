from abc import ABC,abstractmethod
class vehicle():
    def __init__(self,vname):
        self.vname=vname
    def detail(self):
        print("it is two wheeler")
        print(f"the name of vechile is{self.vname}")
    def wheels(self):
        a=2
        return a
    @abstractmethod
    def price(self):
        pass
class scooty(vehicle):
    def __init__(self,vname):
        super().__init__(vname)
    def price(self):
        print("the price of scooty is 45000")
    def wheels(self):
        b=super(scooty,self).wheels()
        b=b+1
        print(b)
class bike(vehicle):
    def __init__(self,vname):
        super().__init__(vname)
    def price(self):
      print("the price of bike is 50000")
obj=scooty("tvs")
obj.price()
obj.detail()
obj.wheels()
obj1=bike("honda")
obj1.price()
obj1.detail()
print(bike.mro())
