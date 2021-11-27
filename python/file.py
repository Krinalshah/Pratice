class Fileread():
    def __init__(self,fname):
     self.fname=fname
    def __enter__(self):
        self.file=open(self.fname,"w")
        print("enter called")
        return self.file
    def __exit__(self, a, b, c):
      print("exit called")
      self.file.close()

with Fileread("abc1.txt") as f:
  f.write("hbehhd")
  print("file is written")
b=1
