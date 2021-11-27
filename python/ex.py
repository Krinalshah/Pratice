
def create_conn(func):
    def wrapper(*args,**kwargs):
      import pdb; pdb.set_trace()
      print("create connection")
      func(*args,**kwargs)
      print("close connection")
    return wrapper

@create_conn
def main1(name="krinal",**kwargs):
    response={
      "id":kwargs.get('id',15),
       "age":23,
       "username":name,

    }
    print("updated result is:",response)
    print("insert the value")
 
@create_conn
def main2():
  r={
         "department":"Marketing"
     }
  print("updated result is:",r)
  print("insert the value")
main1("mitul", id=224)
# main2()

def main3(name, *args, **kwargs):
  print(name)
  print(args)
  print("============================")
  if kwargs.get("hello"):
    print("hello key found")
  if len(args) < 3:
    print("no index")
  else:
    print(args[3])

  for i, val in enumerate(args):
    print(i, val)

# main3('mitul', 34, *[1,4,30, 6,3,6,43,5], **{"hello": "world"}, address='something', country='india')
