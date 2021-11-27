def abc(*args,**kargs):
    print(args,kargs)
    if kargs.get('id'):
      print("i got the id")
    else:
        print(kargs.get("id",{}))
    print(args[1])
abc(4,*[3,6,7,9],"krinal",**{"id":7})