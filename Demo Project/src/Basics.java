import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

import java.io.IOException;
//import io.restassured.http.Headers;
public class Basics {

	public static void main(String[] args) throws IOException {
		
		RestAssured.baseURI="https://orders-management.run.aws-usw02-price.predix.io/";
		 RestAssured.proxy("http://grc-americas-sanra-pitc-wkcz.proxy.corporate.gtm.ge.com:80");
		 RestAssured.proxy("https://grc-americas-sanra-pitc-wkcz.proxy.corporate.gtm.ge.com:80");
		 RestAssuredConfig.newConfig().sslConfig((new SSLConfig()).relaxedHTTPSValidation().allowAllHostnames());
		 //RestAssured.useRelaxedHTTPSValidation();
		 //RestAssured.proxy("api.grc-apps.svc.ice.ge.com,login.grc-apps.svc.ice.ge.com,loggregator.grc-apps.svc.ice.ge.com,uaa.grc-apps.svc.ice.ge.com,console.grc-apps.svc.ice.ge.com,$no_proxy,127.0.0.1,localhost,engage.local,github.build.ge.com,openge.ge.com,ice.ge.com");
		given().relaxedHTTPSValidation(). 
		  param("companyId","abc7b55f-8e81-44f0-8a46-e3e2633cd3f6").
		  param("pageNumber",1).
		  param("pageSize",20).
		  param("locale","english").
          header("ApplicationKey","engage-subsea").
          header("TenantId","fbc838e3-aa68-4748-844a-752370c03d68").
          header("Authorization","eyJhbGciOiJSUzI1NiIsImtpZCI6ImxlZ2FjeS10b2tlbi1rZXkiLCJ0eXAiOiJKV1QifQ.eyJqdGkiOiIyNGQzMGQ0MGJhZjI0OGM5Yjc1MmRkNmRkYjJhOWM3MyIsInN1YiI6IjgwZGQzN2FhLWI0YWUtNDgzNy05MTkwLTI0ZDJkOTZiZDgwZSIsInNjb3BlIjpbIm9wZW5pZCJdLCJjbGllbnRfaWQiOiJkaWdpdGFsX2VuZ2FnZUJIR0VfZGV2IiwiY2lkIjoiZGlnaXRhbF9lbmdhZ2VCSEdFX2RldiIsImF6cCI6ImRpZ2l0YWxfZW5nYWdlQkhHRV9kZXYiLCJncmFudF90eXBlIjoiYXV0aG9yaXphdGlvbl9jb2RlIiwidXNlcl9pZCI6IjgwZGQzN2FhLWI0YWUtNDgzNy05MTkwLTI0ZDJkOTZiZDgwZSIsIm9yaWdpbiI6ImdlLXNzby1iMmIiLCJ1c2VyX25hbWUiOiIyMTI3MDQwMzIiLCJlbWFpbCI6Ik1FR0hBLkdVUFRBQGJoZ2UuY29tIiwiYXV0aF90aW1lIjoxNTc0NzUzNTA5LCJyZXZfc2lnIjoiZmZlODYxODgiLCJpYXQiOjE1NzQ3NTM1ODIsImV4cCI6MTU3NDc2Nzk4MiwiaXNzIjoiaHR0cHM6Ly9hOGEyZmZjNC1iMDRlLTRlYzEtYmZlZC03YTUxZGQ0MDg3MjUucHJlZGl4LXVhYS5ydW4uYXdzLXVzdzAyLXByLmljZS5wcmVkaXguaW8vb2F1dGgvdG9rZW4iLCJ6aWQiOiJhOGEyZmZjNC1iMDRlLTRlYzEtYmZlZC03YTUxZGQ0MDg3MjUiLCJhdWQiOlsiZGlnaXRhbF9lbmdhZ2VCSEdFX2RldiIsIm9wZW5pZCJdfQ.dnVvtxCgyeX3k_qArpSej63UCBV6IRchfRBxrym-oFj2xo1o6KzKyAAnjAjYuROte4W7FBnrzkanBvii8_s7ydWMMWkho3cnfbvQV9y16xsvoQoqgrtPdSW1xGVwGsBapip_W69Dr2M5gIN0YF-KQiaQ24AtymKaV2TUqFDWG7rCYKYLRUwxp-_C8Jk0RVbfXgvgTqcPSU5aLAuVHolguOyMXaIjmK_I6TVpoeKhM9WwFVsqSNFUECVmiyUBqe8pTvqjqutYkygbLcatdHnL2QWQ0BFlxes2RreMNcN2uNUJFCnE_iNlUUyL_SuXfIsh8MAqaA7iBh4-n9RckxiwkQ").
         when().
          get("api/v1/so/paginatedtable").
         then().
         assertThat().statusCode(200).and().contentType(ContentType.JSON);            
	}

}
