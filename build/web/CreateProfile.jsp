
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
            <td class='mytheme'><marquee behavior='slide'><a href='AboutUs.jsp'>ABOUT</a></marquee></td>
            
            <td class='mytheme'><marquee behavior='slide'><a href='AdminPage.jsp'>ADMIN LOGIN</a></marquee></td>
            <td class='mytheme'><marquee behavior='slide'><a href='ViewProfile.jsp'>VIEW PROFILE</a></marquee></td>
            
        </tr>
    </table>
</td>
                </tr>
            </table>
        </div>
        <br><br><br><br><br><br><br><br><br><br><br>
        

        <div style="width:100%;height:100%;background-image:url('images11.jpg')">
        
            <div style="width:100%;height:100%;background-image:url('images11.jpg')">
        
                <form action="CreateProfileCode.jsp">
                
                    <table align='left' border='1' cellpadding='20' cellspacing='20' style='color: black;;margin-left: 400px ;background-color: lightblue;opacity:0.6 '>
                <tr>
                    <td colspan='2'>CREATE PROFILE</td>
                </tr>
               
                <TR>
                    <td>USERID</td>
                      <td><input type='text' name="userId"></td>
                </TR>
                <TR>
                    <td>DOG NAME</td>
                                        <td><input type='text' name="dogname"></td>

                </TR>
                <TR>
                    <td>DOG BREED</td>
                            <td><input type='text' name="dogbreed"></td>

                </TR>
                <TR>
                    <td>Email</td>
                     <td><input type='text' name="emailid"></td>

                </TR>
                
                <TR>
                    <td>City</td>
                    <td><select name="city">
                        <option>Select City</option>
                        <option>indore</option>
                        <option>pune</option>
                        </select></td>

                </TR>
                <tr>
                    <td><input type='submit' value='CREATE'></td>
                </tr>
                    
            </table>
            
                    </form>
        </div>
            
            
            
        </div>
            
    </body>
</html>