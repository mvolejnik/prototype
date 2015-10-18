<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cloud Web Application</title>
</head>

<body>

	<form action="/webapp/rest/mail/send" id="mail" target="_self">
		<h3>Send Email</h3>
		<div>To:</div>
		<br>
		<div><input type="text" name="to" value="Michal.Volejnik@ness.com"></div>
		<br>
		<div>Subject:</div>
		<br>
		<div><input type="text" name="subject" value="Test Email from Cloud App"></div>
		<br>
		<div>Message:</div>
		<br>
		<textarea name="content" rows="10" cols="30">
					Test Email.
		</textarea>
		<br>
		<input type="submit" form="mail" formmethod="post" name="submit" >
	</form>

</body>

</html>