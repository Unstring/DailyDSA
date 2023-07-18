let fs = require("fs");
let str = "https://github.com/Unstring/DailyDSA/blob/master/LeetCode_150/"
let data = fs.readFileSync("touch.txt","utf8").split(" ");
data.forEach(e=>{
    console.log(str + e);
})