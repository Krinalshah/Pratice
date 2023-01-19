
var fs=require('fs');
    fs.appendFile('date-time.js','hello friend',function(err)
    {
        
        if (err) throw err;
        console.log('data is saved');
        
    });

