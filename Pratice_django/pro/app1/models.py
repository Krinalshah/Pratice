from django.db import models
class details(models.Model):
    name=models.CharField(max_length=20)
    rollno=models.IntegerField()
    


