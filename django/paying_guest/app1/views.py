from django.shortcuts import render
from app1.forms import data1
from django.forms import formset_factory
def about_us(request):
    return render(request,'About_us.html')
# Create your views here.
def contact_us(request):
    return render(request,"Contact_us.html")

def display(request):
  
  context={}
  fm=formset_factory(data1,extra=3)
  formset=fm(request.POST)
  if formset.is_valid():
      for form in formset:
          print(form.cleaned_data)
  context['formset']=formset
  return render(request,"hom.html",context)

def query(request):
    return render(request,"queries.html")

def main_(request):
    return render(request,"main.html")