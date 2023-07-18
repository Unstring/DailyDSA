const { log } = require("console");
const fs = require("fs");

let data = fs.readFileSync("all.txt","utf8").split("\n\n")
// console.log(data.length);

// let count = 0;
// data.forEach(e=>{
//     console.log("Number of Question in " + e.split("\n")[0] + " is: " + (e.split("\n").length - 1) / 3);
//     count += (e.split("\n").length - 1) / 3;
// })
// console.log("Total no of question is: " +  count);

// data.forEach((qes)=>{
//     qes.split("\n").forEach((e,i)=>{
//         if (i%3 == 1) {
//             let qn = qes.split("\n")[i + 2].replace(/[^0-9]/g, '');
//             if (qn.length == 1) {
//                 qn = "000" + qn
//             } else if (qn.length == 2) {
//                 qn = "00" + qn
//             } else if (qn.length == 3) {
//                 qn = "0" + qn
//             }
//             console.log("https://walkccc.me/LeetCode/problems/" + qn + "/");
//         }
//     })
// })


let str = "touch "
data.forEach((qes)=>{
    qes.split("\n").forEach((e,i)=>{
        if (i%3 == 1) {
            let qn = qes.split("\n")[i]
            str += qn.split(" ").join("") + ".java "
        }
    })
})
console.log(str);