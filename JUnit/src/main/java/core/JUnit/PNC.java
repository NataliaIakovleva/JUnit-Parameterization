package core.JUnit;

public class PNC {
		public Boolean validate(final Integer primerN) 
		{
			for (int i = 2; i < (primerN /2); i++)
			{
				if (primerN % i == 0)
				{
					return false;
				}
			}
			return true;
		}
}
