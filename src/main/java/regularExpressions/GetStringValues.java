package regularExpressions;

public class GetStringValues {

	public static String[] dataValues() {

		String[] data = new String[5];

		data[0] = "ABCDEFabZZZXXYYYWWcdef123450SQLJava*&%@#!}{w3resource.com";
		data[1] = "SQL_program";
		data[2] = "Java1234";
		data[3] = "*&%@#!}{";
		data[4] = "w3resource.com";
		return data;
	}

	public void removeNumbers() {

		String[] dataValues = GetStringValues.dataValues();

		String replaceAll = dataValues[0].replaceAll("[^0-9]", "");

		System.out.println(replaceAll);
	}

	public void removelowerCaseString() {

		String[] dataValues = GetStringValues.dataValues();

		String replaceAll = dataValues[0].replaceAll("[a-z]", "");

		System.out.println(replaceAll);
	}

	public void removeUpperCaseString() {

		String[] dataValues = GetStringValues.dataValues();

		String replaceAll = dataValues[0].replaceAll("[A-Z]", "");

		System.out.println(replaceAll);
	}

	public void remove_Values() {

		String[] dataValues = GetStringValues.dataValues();

		String replaceAll = dataValues[0].replaceAll("[^a-zA-Z0-9]", "");

		System.out.println(replaceAll);
	}

	public void matchValues() {

		String[] dataValues = GetStringValues.dataValues();

		String replaceAll = dataValues[2].replaceAll("\\d{4}|\\d{6}|\\d{8}", "");

		System.out.println(replaceAll);
	}

	public void removeSpecialCharacters() {

		String[] dataValues = GetStringValues.dataValues();

		String replaceAll = dataValues[0].replaceAll("[^a-zA-Z0-9]", "");

		System.out.println(replaceAll);
	}

	public static void main(String[] args) {

		GetStringValues rmn = new GetStringValues();
		rmn.removeNumbers();
		
		rmn.remove_Values();
		
	}

}
