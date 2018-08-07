
   var webtn=document.getElementById("webtn");
            var mask=document.getElementById("mask");
            var wechat=document.getElementById("wechat");
            var qqbtn=document.getElementById("qqbtn");
            var blogbtn=document.getElementById("blogbtn");
            var qq=document.getElementById("qq");
            var blog=document.getElementById("blog");
            
            webtn.onclick=function(){
                mask.style.display="block";
                wechat.style.display="block";
            };
            var close_wechat=document.getElementById("close_wechat");
            close_wechat.onclick=function(){
                mask.style.display="none";
                wechat.style.display="none";
            };
             qqbtn.onclick=function(){
                mask.style.display="block";
                qq.style.display="block";
            };
            var close_qq=document.getElementById("close_qq");
            close_qq.onclick=function(){
                mask.style.display="none";
                qq.style.display="none";
            };
            blogbtn.onclick=function(){
                mask.style.display="block";
                blog.style.display="block";
            };
            var close_blog=document.getElementById("close_blog");
            close_blog.onclick=function(){
                mask.style.display="none";
                blog.style.display="none";
            };


   
 
 
   
            
