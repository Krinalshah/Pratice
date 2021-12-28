from django.shortcuts import render

def example(request):
    context={"name":"krinal"}
    return render(request,"pratice.html",context)