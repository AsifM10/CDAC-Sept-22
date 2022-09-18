// WAP to work with enum week dataset.:{Mon, Tue, Wed, Thur, Fri, Sat, Sun}
	
public class Switch2 {
	enum Level {
   Mon,
   Tue,
   Wed,
   Thur,
   Fri,
   Sat,
   Sun,
	}
	


  public static void main(String[] args) {
    Level myVar = Level.Sat;

    switch(myVar) {
      case Mon:
        System.out.println("Today is Monday");
        break;
		case Tue:
        System.out.println("Today is Tuesday");
        break;
		case Wed:
        System.out.println("Today is Wednesday");
        break;
		case Thur:
        System.out.println("Today is Thursday");
        break;
		case Fri:
        System.out.println("Today is Friday");
        break;
		case Sat:
        System.out.println("Today is Saturday");
        break;
		case Sun:
        System.out.println("Today is Sunday");
        break;
    }
  }
}