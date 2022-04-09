package day10_SwitchStatement;

public class Http {
    public static void main(String[] args) {
      int statusCode= 307;
      String resultCode= "";
      if(statusCode==200 ||statusCode==201 ||statusCode==202 ||statusCode==301 ||statusCode==303 ||statusCode==304
              ||statusCode==307 ||statusCode==400 ||statusCode==401 ||statusCode==403 ||statusCode==404
              ||statusCode==410 ||statusCode==500 || statusCode==503) {
          switch (statusCode) {
              case 200:
                  resultCode = "OK";
                  break;
              case 201:
                  resultCode = "Created";
                  break;
              case 202:
                  resultCode = "Accepted";
                  break;
              case 301:
                  resultCode = "Moved Permanently";
                  break;
              case 303:
                  resultCode = "See Other";
                  break;
              case 304:
                  resultCode = "Not Modified";
                  break;
              case 307:
                  resultCode = "Temporary Redirect";
                  break;
              case 400:
                  resultCode = "Bad Request";
                  break;
              case 401:
                  resultCode = "Unauthorized";
                  break;
              case 403:
                  resultCode = "Forbidden";
                  break;
              case 404:
                  resultCode = "Not Found";
                  break;
              case 410:
                  resultCode = "Gone";
                  break;
              case 500:
                  resultCode = "Internal Server Error";
                  break;
              case 503:
                  resultCode = "Service Unavailable";
                  break;
              default:
                  resultCode = " Invalid";
          }
          System.out.println(statusCode+ ", "+ resultCode);


      }

    }
}
/*HTTP is the protocol that governs communications between web-servers and web clients.
 Part of the protocol includes a status code returned by the server
  to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status codes and their meanings:
	                200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable


         declare an int variable called statusCode, and a valid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

            NOTE: MUST USE TERNARY.


 */
