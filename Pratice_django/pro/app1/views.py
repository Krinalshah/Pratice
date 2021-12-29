from django.shortcuts import render
from app1.models import details
from django.shortcuts import HttpResponse

def example(request):
    context={"name":"krinal"}
    return render(request,"pratice.html",context)

def data(request):
    a=details.objects.create(name="xyz",rollno=2)
    return HttpResponse(details.objects.values())