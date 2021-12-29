from django import forms
from app1.models import details

class data1(forms.ModelForm):
 class Meta:
     model=details
     fields="__all__"