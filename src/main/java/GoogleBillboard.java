

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) boolean found = false;
int i = 2; 
String chunk = new String();
double num;

while(!found){
    chunk = e.substring(i,i+10);
    num = Double.parseDouble(chunk);
    if (isPrime(num)){
      System.out.println(num);
      found = true;
    }
    i++;
 }
}

	//Finish this function
	public boolean isPrime(double num)  
{   
  if (num<=1)
    return false;
  for(int i = 2; i<= Math.sqrt(num); i++){
    if (num%i==0) return false;
  }
  return true;
	}

}

