import random
state=random.getstate()
print(random.getstate())
print(random.setstate(state))
