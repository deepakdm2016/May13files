<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>


<head>

<link type="text/css" rel="stylesheet" href="css/style.css">
<link type="text/css" rel="stylesheet" href="css/add-student-style.class">

</head>


<body>

<%
out.println("<div class=\"cls_009\" style=\"text-align: center;\"><span style=\"text-decoration: underline;\"><strong><span class=\"cls_009\">Volunteer Release and Waiver of Liability Form</span></strong></span></div>");
out.println("<div class=\"cls_009\" style=\"text-align: center;\">&nbsp;</div>");
out.println("<div class=\"cls_009\" style=\"text-align: center;\">&nbsp;</div>");
out.println("<div class=\"cls_009\" style=\"text-align: center;\"><span style=\"text-decoration: underline;\"><strong><span class=\"cls_009\">PARENT/LEGAL GUARDIAN SIGNATURE IS REQUIRED ON NEXT PAGE<br />IF VOLUNTEER IS UNDER AGE 18</span></strong></span></div>");
out.println("<div class=\"cls_009\" style=\"text-align: center;\"><img src=\"https://d2g8igdw686xgo.cloudfront.net/26871836_1515634563.87.jpg\" alt=\"turban day\" width=\"200\" height=\"200\" /></div>");
out.println("<div class=\"cls_002\"><span class=\"cls_002\">This Release and Waiver of Liability (the &ldquo;release&rdquo;) executed on 04/07/2018 by me</span><span class=\"cls_002\">&nbsp;releases &ldquo;</span><span class=\"cls_009\">Sikhs of NY</span><span class=\"cls_002\">&rdquo;, (&ldquo;Nonprofit&rdquo;), a nonprofit corporation organized and existing under&nbsp;</span><span class=\"cls_002\">the laws of the State of New York and each of its directors, officers, employees, and agents. The Volunteer</span></div>");
out.println("<div class=\"cls_002\"><span class=\"cls_002\">desires to provide volunteer services for Nonprofit and engage in activities related to serving as a&nbsp;</span><span class=\"cls_002\">volunteer.</span></div>");
out.println("<div class=\"cls_002\">&nbsp;</div>");
out.println("<div class=\"cls_002\">&nbsp;</div>");
out.println("<div class=\"cls_002\"><span class=\"cls_002\">Volunteer understands that the scope of Volunteer&rsquo;s relationship with Nonprofit is limited to a volunteer&nbsp;</span><span class=\"cls_002\">position and that no compensation is expected in return for services provided by Volunteer; that&nbsp;</span><span class=\"cls_002\">Nonprofit will not provide any benefits traditionally associated with employment to Volunteer; and that&nbsp;</span><span class=\"cls_002\">Volunteer is responsible for his/her own insurance coverage in the event of personal injury or illness as a&nbsp;</span><span class=\"cls_002\">result of Volunteer&rsquo;s services to Nonprofit.</span></div>");
out.println("<div class=\"cls_002\">&nbsp;</div>");
out.println("<div class=\"cls_009\"><span class=\"cls_009\">1. Waiver and Release:</span><span class=\"cls_002\">&nbsp;I, the Volunteer, release and forever discharge and hold harmless Nonprofit and&nbsp;</span><span class=\"cls_002\">its successors and assigns from any and all liability, claims, and demands of whatever kind of nature, either&nbsp;</span><span class=\"cls_002\">in law or in equity, which arise or may hereafter arise from the services I provide to Nonprofit. I understand&nbsp;</span><span class=\"cls_002\">and acknowledge that this Release discharges Nonprofit from any liability or claim that I may have against&nbsp;</span><span class=\"cls_002\">Nonprofit with respect to bodily injury, personal injury, illness, death, or property damage that may result f</span><span class=\"cls_002\">rom the services I provide to Nonprofit or occurring while I am providing volunteer services.</span></div>");
out.println("<div class=\"cls_009\">&nbsp;</div>");
out.println("<div class=\"cls_009\"><span class=\"cls_009\">2. Insurance:</span><span class=\"cls_002\">&nbsp;Further I understand that Nonprofit does not assume any responsibility for or obligation to&nbsp;</span><span class=\"cls_002\">provide me with financial or other assistance, including but not limited to medical, health, or disability</span></div>");
out.println("<div class=\"cls_002\"><span class=\"cls_002\">benefits or insurance. I expressly waive any such claim for compensation or liability on the part of&nbsp;</span><span class=\"cls_002\">Nonprofit beyond what may be offered freely by Nonprofit in the event of injury or medical expenses&nbsp;</span><span class=\"cls_002\">incurred by me.</span></div>");
out.println("<div class=\"cls_002\">&nbsp;</div>");
out.println("<div class=\"cls_002\">&nbsp;</div>");
out.println("<div class=\"cls_009\"><span class=\"cls_009\">3. Medical Treatment:</span><span class=\"cls_002\">&nbsp;I hereby Release and forever discharge Nonprofit from any claim whatsoever which&nbsp;</span><span class=\"cls_002\">arises or may hereafter arise on account of any first-aid treatment or other medical services rendered in&nbsp;</span><span class=\"cls_002\">connection with an emergency during my tenure as a volunteer with Nonprofit.</span></div>");
out.println("<div class=\"cls_009\">&nbsp;</div>");
out.println("<div class=\"cls_009\"><span class=\"cls_009\">4. Assumption of Risk:</span><span class=\"cls_002\">&nbsp;I understand that the services I provide to Nonprofit may include activities that&nbsp;</span><span class=\"cls_002\">may be hazardous to me including, but not limited to exposure to rain/snow/inclement weather&nbsp;</span><span class=\"cls_002\">conditions, lifting and transportation of heavy material involving inherently dangerous activities. As a&nbsp;</span><span class=\"cls_002\">volunteer, I hereby expressly assume risk of injury or harm from these activities and Release Nonprofit&nbsp;</span><span class=\"cls_002\">from all liability.</span></div>");
out.println("<div class=\"cls_009\">&nbsp;</div>");
out.println("<div class=\"cls_009\"><span class=\"cls_009\">5. Photographic Release:</span><span class=\"cls_002\">&nbsp;I grant and convey to Nonprofit all right, title, and interests in any and all&nbsp;</span><span class=\"cls_002\">photographs, images, video, or audio recordings of me or my likeness or voice made by Nonprofit in&nbsp;</span><span class=\"cls_002\">connection with my providing volunteer services to Nonprofit.</span></div>");
out.println("<div class=\"cls_009\">&nbsp;</div>");
out.println("<div class=\"cls_009\"><span class=\"cls_009\">6. Other:</span><span class=\"cls_002\">&nbsp;As a volunteer, I expressly agree that this Release is intended to be as broad and inclusive as&nbsp;</span><span class=\"cls_002\">permitted by the laws of the State of New York and that this Release shall be governed by and interpreted&nbsp;</span><span class=\"cls_002\">in accordance with the laws of the State of New York. I agree that in the event that any clause or provision&nbsp;</span><span class=\"cls_002\">of this Release is deemed invalid, the enforceability of the remaining provisions of this Release shall not&nbsp;</span><span class=\"cls_002\">be affected.</span></div>");
out.println("<div class=\"cls_002\">&nbsp;</div>");
out.println("<div class=\"cls_002\">");
out.println("<div class=\"cls_002\"><span class=\"cls_002\">By agreeing to above, I express my understanding and intent to enter into this Release and Waiver of Liability willingly and voluntarily.</span></div>");
out.println("");
out.println("</div>");
%>

<form onsubmit="return validateForm()" action="StudentControllerServlet" method="POST">
<input type="hidden" name="command" value="ADDFINAL">
<input type="Submit" value="agreed" class="save">
</form>



<a href="StudentControllerServlet">Back to List</a>

</body>
</html>
