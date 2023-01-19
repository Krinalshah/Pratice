var fs=require('fs');
fs.rename('date.js','date1.js',function(err)
{
    if (err) throw err;
    console.log("file is rename")

});