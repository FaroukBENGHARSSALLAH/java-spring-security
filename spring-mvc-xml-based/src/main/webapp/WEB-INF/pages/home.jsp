<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html >
	<head>
	    <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
	    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet"   type="text/css" />
	    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet"  type="text/css" />
		<link href="<c:url value="/resources/css/style.css"  />" rel="stylesheet"  type="text/css"/>
		<link href="<c:url value="/resources/css/typeahead.css"  />" rel="stylesheet"  type="text/css"/>
		<link href="<c:url value="/resources/css/gritter.css" />" rel="stylesheet"  type="text/css"/>
	    <title>spring-mvc-xml-based</title>
	    <style type="text/css">
	       .content-footer{
	          margin-top: 10%;
	       }
	       @media only screen and (orientation: portrait) and (max-width:1000px){
	              
	              }
	              
	      @media only screen and (orientation: landscape) and (max-width:1000px){
	              
	              }
	              
	      @media only screen and (orientation: landscape) and (min-width:1100px){
	              
	              }
	    </style>
	</head>
	
	<body>
	
	<%@include file="fragment/header.jsp" %>
	
		<div class="container-fluid">
		     <div class="row">    
				       <div class="col-sm-8 col-md-6 col-xs-10 col-md-offset-3 col-sm-offset-2 col-xs-offset-1" > 
				           <div class="text-center"><h4 style="margin-top: 33%; font-style: italic;font-weight: 300;">Welcome ${user}</h4></div>
				        </div> 
		        </div>
		 </div>
		 
		 
	
		  
		 <%@include file="fragment/footer.jsp" %>
		  
		 <script   src="<c:url value="/resources/js/jquery.js" />" type="text/javascript" ></script>
		 <script   src="<c:url value="/resources/js/bootstrap.js" />" type="text/javascript" ></script>
		
		 
		  <script type="text/javascript"    >

					$(document).ready(function () {
				
  
						
				
				         });


		</script>
		
		
	</body>
	
</html>