const express= require("express");
const app= express();
const port=3000;
const path= require("path");
const mongoose= require("mongoose");
const info= require("./models/info");
const dburl='mongodb://127.0.0.1:27017/backendpractice';
let connect_db= async ()=>{
    try {
       await mongoose.connect(dburl);
    
    console.log("the mongodb is connected");

    } catch (e) {
       console.log(e.message,"some error in db");
       
    }
}
connect_db();

// ejs
app.set("view engine","ejs");
app.set("views",path.join(__dirname,"/views"));
// for public folder
app.use(express.static(path.join(__dirname,"public")));
//for req.body ke data ku read karne ke liye
app.use(express.urlencoded({extended:true}));

app.get("/",((req,res)=>{
  
   res.render("index.ejs");
}))
//login route
app.get("/login",(req,res)=>{

    res.render("login.ejs");
})
//login post route
app.post("/login",async(req,res)=>{
    let{name,password}=req.body;
    let result= await info.insertMany([{name,password}]);
    console.log(result);
    res.redirect("/");
})



app.listen(3000,()=>{
    console.log(`the app is listening on the port ${port}`);
})