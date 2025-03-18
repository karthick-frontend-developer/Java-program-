let arr = [1,2,3,4,5]
arr.push(6)//Adds at the end 
arr.unshift(0)//Adds at the beginning
console.log(arr)
arr.pop()//remove from the end
arr.shift()//remove from the beginning
console.log(arr)
//looping through an array
arr.forEach(element => {
    console.log(element)
});
console.log("end")
//problem 1 findmax n
// 
// umber in array
console.log(arr.length)
function maxnum(ar)
{
    let max = ar[0]
    ar.forEach(element =>{
        if(element > max)
            max = element
    })
    return max
}
console.log(maxnum([1,3,4,5]))
function minnum(ar)
{
    let max = ar[0]
    ar.forEach(element =>{
        if(element < max)
            max = element
    })
    return max
}
console.log(minnum([0,3,4,5,1]))
//arr.append("hello")
console.log(arr)
arr.splice(2,0,"nigga")//for add in spefic index
arr.splice(1,1)
console.log(arr)
class Node
{
    constructor(data)
    {
        this.data = data
        this.next = null
    } 
}
const fs = require('fs').promises;
const Papa = require('papaparse');
const loadcsv = async (file) => {
    try {
        const csvtext = await fs.readFile(file, 'utf-8');
        const csvdata = Papa.parse(csvtext, { header: true });
        return csvdata.data;
    } catch (error) {
        console.error("Error reading the CSV file:", error);
    }
};
loadcsv('data.csv').then((data) => {
    console.log(data);
});
function correctiontext(text){
    return text.toLowerCase().replace(/[^a-zA-Z0-9\s]/g,"").trim()
}
console.log(correctiontext("Hello!!! How are you?"));


