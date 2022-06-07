<html>
    <style>
        
        .mytheme
        {
            height: 150px;
            font-size: 30px;
            width:20%;
        }
        .mytheme:hover
        {
            background-color: darkgray;
        }
        a{
            text-decoration: none;
            color:white;
        };
    </style>
    <body> 
    
        <table>
            
        </table>        
        
        <div style="width:100%;height:50px;background:gray; ">
            
            <form action="UserLoginCode.jsp">
            <table width='100%' >
                <tr>
<td style='background-color: lightskyblue' ><font color='white'>USER SIGN IN</font></td>
                    <td><font color='white'>UserId</font></td>
                    <td><input type='text' placeholder="Enter id here"  name="usId"></td>
                    <td><font color='white'>Password</font></td>
                    <td><input type='password' placeholder="Enter password here" name="uPass"></td>
                    <td><input type='submit' value='Login'></td>
                    <td><marquee scrollamount='7' behavior='alternate'><font size="5"> <font color='white'>what if dogs are angels with a tail and a little fur too!!!</font></marquee>
            </td>
                </tr>
            </table>    
                </form>
        </div>
        
        <div style="width:100%;height:50px;background:white">
            <table width="100%">
                <tr>
<td width="20%"><img src="dogg.jpg.png"></td>
<td width="5%"><font size="10px">Pick<br> My <br>Dog</font></td>
<td>
    <table WIDTH="100%">
        <tr BGCOLOR="lightblue" align="center">
            <td  class='mytheme'><marquee behavior='slide'><a href='homepage.jsp' >HOME</a></marquee></td>
            <td class='mytheme'><marquee behavior='slide'><a href='PasswordSetting.jsp'>PASSWORD</a></marquee></td>
            
            <td class='mytheme'><marquee behavior='slide'><a href='viewprofile.jsp'>DELETE</a></marquee></td>
            <td class='mytheme'><marquee behavior='slide'><a href='homepage.jsp'>LOGOUT</a></marquee></td>
            
        </tr>
    </table>
</td>
                </tr>
            </table>
        </div>
        <br><br><br><br><br><br><br><br><br><br><br>
        

        <div style="width:100%;height:100%;background-image:url('images11.jpg')">
        
            <div style="width:100%;height:100%;background-image:url('images11.jpg')">
        
                <form action="DeleteProfileCode.jsp">
                
                    <table align='left' border='1' cellpadding='20' cellspacing='20' style='color: black;margin-top: 80px;margin-right:500px ;margin-left: 600px ;background-color: lightblue;opacity:0.6 '>
                <tr>
                    <td colspan='2'>DELETE PROFILE</td>
                </tr>
                <TR>
                    <td>SEARCH ID</td>
                      <td><input type='text' name="userId"></td>
             
                </TR>
                <tr>
                    <td><input type='submit' value='Delete'></td>
                    
            </table>
            
                    </form>
        </div>
            
            
            
        </div>
            
    </body>
</html>