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

					<h2>Perform Calculation</h2>

						<form id="defaultForm" method="post" class="form-horizontal" action="process.php">
								<div class="form-group">
										<label class="col-sm-4 control-label">Num1:</label>
										<div class="col-sm-4">
												<input type="text" class="form-control" name="num1" placeholder="enter first number" />
										</div>
								</div>

								<div class="form-group">
										<label class="col-sm-4 control-label">Num2:</label>
										<div class="col-sm-4">
												<input type="text" class="form-control" name="num2" placeholder="enter second number" />
										</div>
								</div>
								
								<div class="form-group">
									<div class="col-sm-12">
										<label class="checkbox-inline">
											<input type="radio" name="operation" id="addition" value="addition" checked="true"> addition
										</label>

										<label class="checkbox-inline">
											<input type="radio" name="operation" id="subtraction" value="subtraction"> subtraction
										</label>

										<label class="checkbox-inline">
											<input type="radio" name="operation" id="multiplication" value="multiplication"> multiplication
										</label>

										<label class="checkbox-inline">
											<input type="radio" name="operation" id="division" value="division"> division
										</label>

										<label class="checkbox-inline">
											<input type="radio" name="operation" id="exponentiation" value="exponentiation"> exponentiation
										</label>

										</div>
								</div>


								<div class="form-group">
									<div class="col-sm-6 col-sm-offset-3">
									<button type="submit" class="btn btn-primary" name="calculate" value="Calculate">Calculate</button>
										</div>
								</div>
						</form>
<p>&nbsp;</p>

			<?php include_once "global/footer.php"; ?>
			
		</div> <!-- end starter-template -->
 </div> <!-- end container -->

</body>
</html>
