<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>



<%
out.println("<html>");
out.println("<head><meta http-equiv=Content-Type content=\"text/html; charset=UTF-8\">");
out.println("<style type=\"text/css\">");
out.println("<!--");
out.println("span.cls_007{font-family:\"Calibri Light\",serif;font-size:22.0px;color:rgb(46,83,149);font-weight:normal;font-style:normal;text-decoration: underline}");
out.println("div.cls_007{font-family:\"Calibri Light\",serif;font-size:22.0px;color:rgb(46,83,149);font-weight:normal;font-style:normal;text-decoration: none}");
out.println("span.cls_002{font-family:\"Calibri\",serif;font-size:11.1px;color:rgb(0,0,0);font-weight:normal;font-style:normal;text-decoration: none}");
out.println("div.cls_002{font-family:\"Calibri\",serif;font-size:11.1px;color:rgb(0,0,0);font-weight:normal;font-style:normal;text-decoration: none}");
out.println("span.cls_004{font-family:\"Calibri Bold\",serif;font-size:11.1px;color:rgb(0,0,0);font-weight:bold;font-style:normal;text-decoration: none}");
out.println("div.cls_004{font-family:\"Calibri Bold\",serif;font-size:11.1px;color:rgb(0,0,0);font-weight:bold;font-style:normal;text-decoration: none}");
out.println("span.cls_005{font-family:\"Calibri Bold\",serif;font-size:14.1px;color:rgb(0,0,0);font-weight:bold;font-style:normal;text-decoration: none}");
out.println("div.cls_005{font-family:\"Calibri Bold\",serif;font-size:14.1px;color:rgb(0,0,0);font-weight:bold;font-style:normal;text-decoration: none}");
out.println("span.cls_008{font-family:\"Calibri\",serif;font-size:11.1px;color:rgb(4,98,193);font-weight:normal;font-style:normal;text-decoration: underline}");
out.println("div.cls_008{font-family:\"Calibri\",serif;font-size:11.1px;color:rgb(4,98,193);font-weight:normal;font-style:normal;text-decoration: none}");
out.println("span.cls_009{font-family:\"Calibri Bold\",serif;font-size:11.1px;color:rgb(0,0,0);font-weight:bold;font-style:normal;text-decoration: underline}");
out.println("div.cls_009{font-family:\"Calibri Bold\",serif;font-size:11.1px;color:rgb(0,0,0);font-weight:bold;font-style:normal;text-decoration: none}");
out.println("-->");
out.println("</style>");
out.println("<script type=\"text/javascript\" src=\"0f0a3140-386c-11e8-b174-0cc47a792c0a_id_0f0a3140-386c-11e8-b174-0cc47a792c0a_files/wz_jsgraphics.js\"></script>");
out.println("</head>");%>

<link type="text/css" rel="stylesheet" href="css/style.css">
<link type="text/css" rel="stylesheet" href="css/add-student-style.class">
<% 
out.println("<body>");
%>

<form name="myForm" onsubmit="return validateForm()" action="StudentControllerServlet" method="GET">
<input type="hidden" name="command" value="UPDATE">
<input type="hidden" name="studentId" value="${THE_STUDENT.id}">


<% 
out.println("<div style=\"position:absolute;left:50%;margin-left:-306px;top:0px;width:612px;height:792px;border-style:outset;overflow:hidden\">");
out.println("<div style=\"position:absolute;left:0px;top:0px\">");
%>
<div><img src="background1.jpg" width=612 height=792></div>
<% 
out.println("<div style=\"position:absolute;left:208.13px;top:123.38px\" class=\"cls_007\"><span class=\"cls_007\">Volunteer Registration</span></div>");
out.println("<div style=\"position:absolute;left:40.44px;top:175.22px\" class=\"cls_002\"><span class=\"cls_002\">Volunteer Name:");%><jsp:useBean id="volunteer" class="com.jdbc.connection.Student" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="volunteer"/><input type="text" required name="name" value="${THE_STUDENT.name}">   <%out.println(" Date:");%><input type="text" disabled="true" name="date" value="<%= new java.util.Date() %>" >   <%out.println(" </span></div>");
out.println("<div style=\"position:absolute;left:40.44px;top:197.66px\" class=\"cls_002\"><span class=\"cls_002\">Address:");%><input type="text" required name="address" value="${THE_STUDENT.address}" />">   <%out.println(" </span></div>");
out.println("<div style=\"position:absolute;left:40.44px;top:220.10px\" class=\"cls_002\"><span class=\"cls_002\">E-mail:");%><input type="text" required name="email" value="${THE_STUDENT.email}" />">   <%out.println(" </span></div>");
out.println("<div style=\"position:absolute;left:396.07px;top:220.10px\" class=\"cls_002\"><span class=\"cls_002\">Phone:");%><input type="text" required name="phonenum" value="${THE_STUDENT.phonenum}" />">   <%out.println(" </span></div>");
out.println("<div style=\"position:absolute;left:40.44px;top:242.66px\" class=\"cls_002\"><span class=\"cls_002\">Volunteer Age (Please checkoff and encircle): ");%><input type="radio" name="ageu18" value="ageu18"><%out.println(" Under 18 years  or  ");%><input type="radio" name="agea18" value="agea18">  <%out.print("  Over 18 years</span></div>");
out.println("<div style=\"position:absolute;left:40.44px;top:265.13px\" class=\"cls_004\"><span class=\"cls_004\">If volunteer is under 18 years of age:</span></div>");
out.println("<div style=\"position:absolute;left:40.44px;top:287.69px\" class=\"cls_002\"><span class=\"cls_002\">Parent or Legal Guardian Name :");%><input type="text" name="guardianname" value="${THE_STUDENT.guardianname}" />">   <%out.println(" </span></div>");
out.println("<div style=\"position:absolute;left:40.44px;top:310.13px\" class=\"cls_002\"><span class=\"cls_002\">Parent or Legal Guardian E-mail:");%><input type="text" name="guardianemail" value="${THE_STUDENT.guardianemail}" />">   <%out.println(" </span></div>");
out.println("<div style=\"position:absolute;left:40.44px;top:332.69px\" class=\"cls_002\"><span class=\"cls_002\">Parent or Legal Guardian Phone :");%><input type="text" name="guardianphone" value="${THE_STUDENT.guardianphone}" />">   <%out.println(" </span></div>");
out.println("<div style=\"position:absolute;left:40.44px;top:355.13px\" class=\"cls_004\"><span class=\"cls_004\">Emergency Contact</span></div>");
out.println("<div style=\"position:absolute;left:42.96px;top:377.57px\" class=\"cls_002\"><span class=\"cls_002\">Name:");%><input type="text" required name="emergencycont" value="${THE_STUDENT.emergencycont}" />">   <%out.println("  Relationship to Participant:");%><input type="text" required name="relationtype" value="${THE_STUDENT.relationtype}" />">   <%out.println(" </span></div>");
out.println("<div style=\"position:absolute;left:40.44px;top:400.13px\" class=\"cls_002\"><span class=\"cls_002\">Phone Number:");%><input type="text" required name="relationph" value="${THE_STUDENT.relationph}" />">   <%out.println(" </span></div>");
out.println("<div style=\"position:absolute;left:40.44px;top:422.59px\" class=\"cls_002\"><span class=\"cls_002\">Any allergies, medications, or other information needed in an emergency:</span></div>");
out.println("<div style=\"position:absolute;left:40.44px;top:437.11px\" class=\"cls_002\"><span class=\"cls_002\">");%><input type="text" name="allergies" value="${THE_STUDENT.allergies}" />">   <%out.println(" </span></div>");
out.println("<div style=\"position:absolute;left:25.92px;top:481.75px\" class=\"cls_007\"><span class=\"cls_007\">VOLUNTEERS MUST COMPLETE THE WAIVER AND RELEASE FORM</span></div>");
out.println("<div style=\"position:absolute;left:245.21px;top:510.67px\" class=\"cls_007\"><span class=\"cls_007\">ON NEXT PAGE</span></div>");
out.println("<div style=\"position:absolute;left:16.32px;top:562.15px\" class=\"cls_007\"><span class=\"cls_007\">PARENT/LEGAL GUARDIAN SIGNATURE IS REQUIRED ON NEXT PAGE</span></div>");
out.println("<div style=\"position:absolute;left:169.94px;top:591.22px\" class=\"cls_007\"><span class=\"cls_007\">IF VOLUNTEER IS UNDER AGE 18</span></div>");
out.println("<div style=\"position:absolute;left:273.65px;top:643.06px\" class=\"cls_005\"><span class=\"cls_005\">Sikhs of NY</span></div>");
out.println("<div style=\"position:absolute;left:275.21px;top:661.42px\" class=\"cls_002\"><span class=\"cls_002\">767 Fifth Ave,</span></div>");
out.println("<div style=\"position:absolute;left:260.09px;top:675.94px\" class=\"cls_002\"><span class=\"cls_002\">New York, NY-10153</span></div>");
out.println("<div style=\"position:absolute;left:268.13px;top:690.46px\" class=\"cls_002\"><span class=\"cls_002\">+1-347.453.9786</span></div>");
out.println("<div style=\"position:absolute;left:254.69px;top:704.98px\" class=\"cls_008\"><span class=\"cls_008\"> </span><A HREF=\"mailto:contact@sikhsofny.org\">contact@sikhsofny.org</A> </div>");
out.println("<div style=\"position:absolute;left:303.29px;top:764.62px\" class=\"cls_002\"><span class=\"cls_002\">1</span></div>");
out.println("</div>");
out.println("</div>");
out.println("<div style=\"position:absolute;left:50%;margin-left:-306px;top:802px;width:612px;height:792px;border-style:outset;overflow:hidden\">");
out.println("<div style=\"position:absolute;left:0px;top:0px\">");
out.println("<img src=\"0f0a3140-386c-11e8-b174-0cc47a792c0a_id_0f0a3140-386c-11e8-b174-0cc47a792c0a_files/background2.jpg\" width=612 height=792></div>");
out.println("<div style=\"position:absolute;left:198.50px;top:40.92px\" class=\"cls_009\"><span class=\"cls_009\">Volunteer Release and Waiver of Liability Form</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:69.84px\" class=\"cls_002\"><span class=\"cls_002\">This Release and Waiver of Liability (the \"release\") executed on ");%><input type="text" name="volunteerDate" value="<%= new java.util.Date() %>">   <%out.println("\"(date) by \"");%><%out.println("");%> <%out.println("</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:84.38px\" class=\"cls_002\"><span class=\"cls_002\">(\"Volunteer\") releases \"</span><span class=\"cls_009\">Sikhs of NY</span><span class=\"cls_002\">\", (\"Nonprofit\"), a nonprofit corporation organized and existing under</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:98.90px\" class=\"cls_002\"><span class=\"cls_002\">the laws of the State of New York and each of its directors, officers, employees, and agents. The Volunteer</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:113.42px\" class=\"cls_002\"><span class=\"cls_002\">desires to provide volunteer services for Nonprofit and engage in activities related to serving as a</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:127.82px\" class=\"cls_002\"><span class=\"cls_002\">volunteer.</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:156.86px\" class=\"cls_002\"><span class=\"cls_002\">Volunteer understands that the scope of Volunteer’s relationship with Nonprofit is limited to a volunteer</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:171.38px\" class=\"cls_002\"><span class=\"cls_002\">position and that no compensation is expected in return for services provided by Volunteer; that</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:185.78px\" class=\"cls_002\"><span class=\"cls_002\">Nonprofit will not provide any benefits traditionally associated with employment to Volunteer; and that</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:200.30px\" class=\"cls_002\"><span class=\"cls_002\">Volunteer is responsible for his/her own insurance coverage in the event of personal injury or illness as a</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:214.82px\" class=\"cls_002\"><span class=\"cls_002\">result of Volunteer’s services to Nonprofit.</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:243.74px\" class=\"cls_009\"><span class=\"cls_009\">1. Waiver and Release:</span><span class=\"cls_002\"> I, the Volunteer, release and forever discharge and hold harmless Nonprofit and</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:258.29px\" class=\"cls_002\"><span class=\"cls_002\">its successors and assigns from any and all liability, claims, and demands of whatever kind of nature, either</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:272.81px\" class=\"cls_002\"><span class=\"cls_002\">in law or in equity, which arise or may hereafter arise from the services I provide to Nonprofit. I understand</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:287.33px\" class=\"cls_002\"><span class=\"cls_002\">and acknowledge that this Release discharges Nonprofit from any liability or claim that I may have against</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:301.73px\" class=\"cls_002\"><span class=\"cls_002\">Nonprofit with respect to bodily injury, personal injury, illness, death, or property damage that may result</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:316.25px\" class=\"cls_002\"><span class=\"cls_002\">from the services I provide to Nonprofit or occurring while I am providing volunteer services.</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:330.77px\" class=\"cls_009\"><span class=\"cls_009\">2. Insurance:</span><span class=\"cls_002\"> Further I understand that Nonprofit does not assume any responsibility for or obligation to</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:345.29px\" class=\"cls_002\"><span class=\"cls_002\">provide me with financial or other assistance, including but not limited to medical, health, or disability</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:359.69px\" class=\"cls_002\"><span class=\"cls_002\">benefits or insurance. I expressly waive any such claim for compensation or liability on the part of</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:374.21px\" class=\"cls_002\"><span class=\"cls_002\">Nonprofit beyond what may be offered freely by Nonprofit in the event of injury or medical expenses</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:388.73px\" class=\"cls_002\"><span class=\"cls_002\">incurred by me.</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:403.25px\" class=\"cls_009\"><span class=\"cls_009\">3. Medical Treatment:</span><span class=\"cls_002\"> I hereby Release and forever discharge Nonprofit from any claim whatsoever which</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:417.65px\" class=\"cls_002\"><span class=\"cls_002\">arises or may hereafter arise on account of any first-aid treatment or other medical services rendered in</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:432.19px\" class=\"cls_002\"><span class=\"cls_002\">connection with an emergency during my tenure as a volunteer with Nonprofit.</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:446.71px\" class=\"cls_009\"><span class=\"cls_009\">4. Assumption of Risk:</span><span class=\"cls_002\"> I understand that the services I provide to Nonprofit may include activities that</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:461.23px\" class=\"cls_002\"><span class=\"cls_002\">may be hazardous to me including, but not limited to exposure to rain/snow/inclement weather</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:475.63px\" class=\"cls_002\"><span class=\"cls_002\">conditions, lifting and transportation of heavy material involving inherently dangerous activities. As a</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:490.15px\" class=\"cls_002\"><span class=\"cls_002\">volunteer, I hereby expressly assume risk of injury or harm from these activities and Release Nonprofit</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:504.67px\" class=\"cls_002\"><span class=\"cls_002\">from all liability.</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:519.19px\" class=\"cls_009\"><span class=\"cls_009\">5. Photographic Release:</span><span class=\"cls_002\"> I grant and convey to Nonprofit all right, title, and interests in any and all</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:533.59px\" class=\"cls_002\"><span class=\"cls_002\">photographs, images, video, or audio recordings of me or my likeness or voice made by Nonprofit in</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:548.11px\" class=\"cls_002\"><span class=\"cls_002\">connection with my providing volunteer services to Nonprofit.</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:562.63px\" class=\"cls_009\"><span class=\"cls_009\">6. Other:</span><span class=\"cls_002\"> As a volunteer, I expressly agree that this Release is intended to be as broad and inclusive as</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:577.15px\" class=\"cls_002\"><span class=\"cls_002\">permitted by the laws of the State of New York and that this Release shall be governed by and interpreted</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:591.55px\" class=\"cls_002\"><span class=\"cls_002\">in accordance with the laws of the State of New York. I agree that in the event that any clause or provision</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:606.10px\" class=\"cls_002\"><span class=\"cls_002\">of this Release is deemed invalid, the enforceability of the remaining provisions of this Release shall not</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:620.62px\" class=\"cls_002\"><span class=\"cls_002\">be affected.</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:649.66px\" class=\"cls_002\"><span class=\"cls_002\">I express my understanding and intent to enter into this Release and Waiver of Liability</span></div>");
out.println("<div style=\"position:absolute;left:72.02px;top:664.06px\" class=\"cls_002\"><span class=\"cls_002\">willingly and voluntarily.");%><input type="Submit" value="I Agree" class="save"><a href="StudentControllerServlet">Back to List</a>
<% out.println("</span></div>");%>


<% 
out.println("<div style=\"position:absolute;left:303.29px;top:764.62px\" class=\"cls_002\"><span class=\"cls_002\">2</span></div>");
out.println("</div>");
out.println("");
%>

</form>
<% 
out.println("</body>");
out.println("</html>");
%>