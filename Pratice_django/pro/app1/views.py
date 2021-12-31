from django.forms.widgets import MediaDefiningClass
from django.shortcuts import redirect, render
from app1.forms import data1
from django.shortcuts import HttpResponse
from django.contrib import messages
from app1.models import details
from django.shortcuts import(get_object_or_404,render,HttpResponseRedirect)

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

def datas(request):
	context={}
	context["a"]=details.objects.values()
	return render(request,"data.html",context)


def update_view(request,id):
	context={}
	obj=get_object_or_404(details,id=id)
	form=data1(request.POST,instance=obj)
	if form.is_valid():
		form.save()
		return HttpResponseRedirect("/"+id)
	context['form']=form
	return render(request,"update_view.html",context)

def details1(request,id):

    context={}
    context["det"]=details.objects.get(id=id)
    return render(request,"updated_info.html",context)
