const mongoose = require("mongoose");
const Schema = mongoose.Schema;


const info= new Schema({
    name:{
        type:String,
        required:true,
    },
    password:{
        type:String,
        required:true
    }

})
const Info = mongoose.model("Info",info);
module.exports=Info;