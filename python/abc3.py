class abc1():
    pass
class abc3(abc1):
    pass
class abc2(abc3):
    pass
class abc4(abc2,abc1):
 pass
print(abc4.mro())