from django.forms.widgets import MediaDefiningClass
from django.shortcuts import render
from app1.forms import data1
from django.shortcuts import HttpResponse
from django.contrib import messages

def example(request):
    context={"name":"krinal"}
    return render(request,"pratice.html",context)

def data(request):
    context={}
    username=request.POST.get('name',False)
    form=data1(request.POST)
    if form.is_valid():
        form.save()
        messages.success(request, f' Thanks {username} !!')
    context['form']=form
    return render(request,"info.html",context)