package personality;

class Personality {
	  String firstName;
	  String familyName;
	  int age;

	  Personality( ){
	  }

	  Personality( String initFirstName, String initFamilyName, int initAge )	{
	    this.firstName = initFirstName;
	    this.familyName = initFamilyName;
	    this.age = initAge;
	  }

	  String getFullName()	{
		    String fullName = this.firstName + " " + this.familyName;
		    return fullName;
	  }

	  public static void main( String arg[] ){
	    Personality person1 = new Personality("Masayuki", "Nii", 43);
	    System.out.println( person1.getFullName() + "さんの年齢は" + person1.age );
	    Personality person2 = new Personality("Jiro", "Motohashi", 4);
	    Personality person3 = new Personality();
	    person3.familyName = "Sawada";
	    person3.firstName = "Taro";
	    
	    System.out.println( "person1のfamilyName:::" + person1.familyName );
	    System.out.println( "person2のfamilyName:::" + person2.familyName );
	    System.out.println( "person3のfamilyName:::" + person3.familyName );

	    JapanesePersonality jperson1 = new JapanesePersonality("園田","健二",20);
	    AmericanPersonality aperson1 = new AmericanPersonality("John","Dow",22);
	    System.out.println( "jperson1のgetFullName:::" + jperson1.getFullName() );
//	    System.out.println( "jperson1のgetInitial:::" + jperson1.getInitial() );
	    System.out.println( "aperson1のgetFullName:::" + aperson1.getFullName() );
	    System.out.println( "aperson1のgetInitial:::" + aperson1.getInitial() );
	  }
	}

	class JapanesePersonality extends Personality{
	  JapanesePersonality(String initFamilyName, String initFirstName, int initAge) {
	    super(initFirstName, initFamilyName, initAge);
	  }
	  
	  String getFullName()	{
	    String fullName = this.familyName + "　" + this.firstName;
	    return fullName;
	  }
	}

	class AmericanPersonality extends Personality{
	  AmericanPersonality(String initFirstName, String initFamilyName, int initAge) {
	    super(initFirstName, initFamilyName, initAge);
	  }
	  
	  String getInitial(){
	    String initialString = this.firstName.substring(0,1)
	                         + "." + this.familyName.substring(0,1);
	    return initialString;
	  }
	  
	  String getFullName(){
		    String fullName = this.firstName + " " + this.familyName;
		    return fullName;
		  }
	}