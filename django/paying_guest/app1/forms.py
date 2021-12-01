from django import forms
from app1.models import database
class data1(forms.ModelForm):
 class Meta:
     model=database
     fields=('email','password')
     widgets={
       'password': forms.PasswordInput(),
       'email':forms.Textarea(),
     }
     
     
  