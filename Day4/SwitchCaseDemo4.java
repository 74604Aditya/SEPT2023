class SwitchCaseDemo4{

	public static void main( String args[] ){

		char choice = 'A'+32;

		switch( choice ){

			case 'A'|'a':
				System.out.println( "A");
				break;
			case 'B'|'b':
                                System.out.println( "B");
                                break;
			case 'C'|'c':
                                System.out.println( "C");
                                break;
			default:
				System.out.println( "default case");
		}

		System.out.println( "Out of switch case");
	}

}
