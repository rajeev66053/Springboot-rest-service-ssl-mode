# Rest Service in SSL mode

* SSL stands for Secure Sockets Layer which is used to keep an internet connection secure and safegaurding any sensitive
  data that is being sent between two systems.
* It uses encryption algorithms to scramble data in transit.
* SSL Certificates are small data files that digitally bind a cryptographic key to an organizations details.
* When certificates installed on a web server, it activates the padlock and the https protocol and allows secure
  connections from a web server to a browser.
* TLS stands for Transport Layer Security and is updated and more secure version of SSL.
* Truststore and keystore both are used to store SSL certificates in java.
* Truststore is used to store public certificates while keystore is used to store private certificates or client or
  server.
* Selfsigned SSL certificate where keytool initiate the key generate, genkey is the flag which initiate the
  keygeneration, alias is use to give the certificate a name, keyalg is the key algorithm here RSA is the key algorithm,
  keysize keyword is use to give a file size, keypass is the keystore password, storepass is for truststore password and
  keystore is for where keystore will be generate.
  > keytool -genkey -alias local_sslcert_selfSigned -keyalg RSA -keysize 2048 -validity 700 -keypass rajeev -storepass rajeev -keystore ssl_server.jks
  
* To view the key we have to write command from the path where the certificate exists, in this application the certificate exists in `E:\springboot-rest-service-ssl-mode\registrationService`
  > keytool -list -keystore ssl_server.jks
  >
  It will return the certificate.

### To create the ssl certificate in our application

* Go to root directory of the application and open the command prompt.
* Type the following command and hit enter, it will generate the ssl file in application.
  > keytool -genkey -alias local_sslcert_selfSigned -keyalg RSA -keysize 2048 -validity 700 -keypass rajeev -storepass rajeev -keystore ssl_server.jks

* To view the ssl command from the file, we havve to type this command in commad prompt from the root directory of
  project:
  > keytool -list -keystore ssl-server.jks

* After creating the ssl certificate we have to enable the ssl in application.properties file.

### To launch the application in browser we need to provide `https` otherwise it will not work.

  > https://localhost:8086/registration/sellersList

* If Registration application is in https mode then from orderApp we cannot access it until we disable the ssl mode or validate the ssl from order App. If we tried to hit `http://localhost:8085/sellerList` it will throw 500 internal server error with message 
  > unable to find valid certification path to requested target
  
* If we disable the ssl certificate from orderconfig then we will not get any error or if we validate the ssl from orderconfig then also it will work normally.
