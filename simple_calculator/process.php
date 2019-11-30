<!DOCTYPE html>
<html lang="en">
<head>
<!--
				 "Time-stamp: <Sun, 05-27-18, 19:34:59 Eastern Daylight Time>"
//-->
<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="My online portfolio that illustrates skills acquired while working through various project requirements.">
	<meta name="author" content="George Guzman">
	<link rel="icon" href="favicon.ico">

	<title>LIS4381 - Simple Calculator</title>
		<?php include_once("../css/include_css.php"); ?>
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASxBjAu+SWDVnPi2ikFfwwEAa8hDDdjZipLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

	<link rel="stylesheet" href="css/formValidation.min.css"/>
	<link rel="stylesheet" href="css/starter-template.css"/>

	<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

</head>
<body>

<?php include_once("../global/nav.php"); ?>

<div class="container">
	<div class="starter-template">
		<div class="page-header">
			<?php include_once("global/header.php"); ?>
		</div>

		<?php

		if (!empty($_POST))
		{
			$num1=$_POST['num1'];
			$num2=$_POST['num2'];
			$operation=$_POST['operation'];
		}

echo '<h2>'."$operation".'</h2>';

switch ($operation)
{
	case "addition":
	echo "$num1" . " + " . "$num2" . " = ";
	echo $num1+$num2;
	break;

	case "subtraction":
	echo "$num1" . " - " . "$num2" . " = ";
	echo $num1-$num2;
	break; 

	case "multiplication":
	echo "$num1" . " * " . "$num2" . " = ";
	echo $num1*$num2;
	break;

	case "division":
	if ($num2 == 0)
	{
		echo "Cannot divide by zero!";
	}
	else
	{
		echo "$num1" . " / " . "$num2" . " = ";
		echo $num1/$num2;
	}
	break;

	case "exponentiation":
	echo "$num1" . " raised to the power of " . "$num2" . " = ";
	echo pow($num1,$num2);
	break;

	default:
	echo "Must select an operation!";
}


?>
		
		<?php include_once "global/footer.php"; ?>	
</body>