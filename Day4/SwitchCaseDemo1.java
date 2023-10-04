class SwitchCaseDemo1{

	public static void main( String args[] ){

		String choice = "two";

		switch( choice ){

			case "one":
				System.out.println( "case one");
				break;
			case "two":
                                System.out.println( "case two");
                                break;
			case "three":
                                System.out.println( "case three");
                                break;
			default:
				System.out.println( "default case");
		}

		System.out.println( "Out of switch case");
	}

}
