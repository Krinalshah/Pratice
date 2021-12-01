from django.db import models
class data(models.Model):
  email=models.CharField(max_length=40)
class database(models.Model):
  email=models.CharField(max_length=40)
  password=models.CharField(max_length=8)
class links(models.Model):
     link=models.URLField(max_length=30)
     name=models.CharField(max_length=20)       
# Create your models here.
