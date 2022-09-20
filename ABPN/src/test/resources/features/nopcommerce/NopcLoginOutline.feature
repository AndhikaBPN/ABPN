Feature: Login Invalid Username Password

	Scenario Outline: User invalid login Outline
		When Browser open nopcommerce Outline
		And Enter invalid <username> and <password> Outline
		And button login click Outline
		Then System check credentials

	Examples:
		| username | password  |
		| Admin@gmail.com		 | Admin1234 |
		| Amin@gmail.com		 | adminn123 |
		| Adminn@gmail.com	 | Addmin123 |
		| Admmin@gmail.com	 | admin123  |
		| Admins@gmail.com	 | minad921  |
		| Adminss@gmail.com	 | admin1233 |

