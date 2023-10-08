class SwitchCaseDemo2{

	public static void main( String args[] ){

		char choice = 'a';

		switch( choice ){

			case 'A'|'a':
				System.out.println( "case A");
				break;
			case 'B'|'b':
                                System.out.println( "case B");
                                break;
			case 'C'|'c':
                                System.out.println( "case C");
                                break;
			default:
				System.out.println( "default case");
		}

		System.out.println( "Out of switch case");
	}

}
