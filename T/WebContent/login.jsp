<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./css/login.css">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="./css/bootstrap.css" type="text/css">
<link rel="stylesheet" href="./css/login.css" type="text/css">
<title>Tela de Login</title>
<link rel="icon" type="image/x-icon" href="img/logo_ico.png" />
</head>
<body>
<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<form class="login100-form validate-form" action="index.php" method="post">
					<span class="login100-form-logo">
						<img alt="logo" src="img/logo.png">
					</span>
					<div class="form-group">
							<label for="exampleInputEmail1">Email</label> 
							<input type="email" class="form-control" name="txt-user" id="nm-user" aria-describedby="emailHelp" required="required" class="form-control">
					</div>
					<div class="form-group">
							<label for="pass-user">Senha</label> 
							<input type="password" class="form-control" name="txt-pass" id="pass-user" required="required" >
					</div>
					<div class="container-login100-form-btn">
						<button type="submit" class="btn btn-dark">Login</button>
					</div>
				</form>
			</div>
		</div>
	</div>

<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
</body>
</html>