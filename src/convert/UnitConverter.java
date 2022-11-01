package convert;
public class UnitConverter {

    // Method taken from my Assignment 2 code
    // Slight changes were made to return a String value and to have an additional boolean parameter which dictate whether the output is in scientific notation
    public static String convertUnits(String value, String startUnit, String finalUnit, boolean sciNot) {
        double convertedValue = 0;
        double inputValue = 0;
        String startingUnit = startUnit.toLowerCase(); // allows the input units to be case-insensitive
        String desiredUnit = finalUnit.toLowerCase(); // however, the result is displayed with the same capitalization
                                                       // as the user input
        try {
            inputValue = Double.parseDouble(value);
        } catch (Exception ex) {
            //System.out.println("Invalid value entered! Please input a double (decimal number)!");
            return "Invalid value entered! Please input a double (decimal number)!";
        } // ensure that the user input a valid number value

        // When first writing the code for converting the units, the type of measurement
        // written was length.
        // At that point, it had not been determined that the program would allow the
        // user to convert to
        // the same unit that the user started with (example: cm to cm).
        // This is why the cases in the nested switch statement do not have a fixed
        // order for units of length,
        // with the unit which is same as the starting unit being the case directly
        // before the default.
        switch (startingUnit) {
            case "km":
                switch (desiredUnit) {
                    case "m":
                        convertedValue = inputValue * 1000;
                        break;
                    case "cm":
                        convertedValue = inputValue * 1000 * 100;
                        break;
                    case "mm":
                        convertedValue = inputValue * 1000 * 1000;
                        break;
                    case "in":
                        convertedValue = inputValue * 1000 * 100 / 2.54;
                        break;
                    case "ft":
                        convertedValue = inputValue * 1000 * 100 / 2.54 / 12.0;
                        break;
                    case "yd":
                        convertedValue = inputValue * 1000 * 100 / 2.54 / 36.0;
                        break;
                    case "mi":
                        convertedValue = inputValue * 1000 * 100 / 2.54 / 12.0 / 5280.0;
                        break;
                    case "km":
                        convertedValue = inputValue;
                        break;
                    default:
                        //System.out.println("Invalid desired unit entered!");
                        //System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return "";
                }
                break;
            case "m":
                switch (desiredUnit) {
                    case "km":
                        convertedValue = inputValue / 1000.0;
                        break;
                    case "cm":
                        convertedValue = inputValue * 100;
                        break;
                    case "mm":
                        convertedValue = inputValue * 1000;
                        break;
                    case "in":
                        convertedValue = inputValue * 100 / 2.54;
                        break;
                    case "ft":
                        convertedValue = inputValue * 100 / 2.54 / 12.0;
                        break;
                    case "yd":
                        convertedValue = inputValue * 100 / 2.54 / 36.0;
                        break;
                    case "mi":
                        convertedValue = inputValue * 100 / 2.54 / 12.0 / 5280.0;
                        break;
                    case "m":
                        convertedValue = inputValue;
                        break;
                    default:
                        //System.out.println("Invalid desired unit entered!");
                        //System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return "";
                }
                break;
            case "cm":
                switch (desiredUnit) {
                    case "km":
                        convertedValue = inputValue / 1000.0 / 100.0;
                        break;
                    case "m":
                        convertedValue = inputValue / 100.0;
                        break;
                    case "mm":
                        convertedValue = inputValue * 10;
                        break;
                    case "in":
                        convertedValue = inputValue / 2.54;
                        break;
                    case "ft":
                        convertedValue = inputValue / 2.54 / 12.0;
                        break;
                    case "yd":
                        convertedValue = inputValue / 2.54 / 36.0;
                        break;
                    case "mi":
                        convertedValue = inputValue / 2.54 / 12.0 / 5280.0;
                        break;
                    case "cm":
                        convertedValue = inputValue;
                        break;
                    default:
                        //System.out.println("Invalid desired unit entered!");
                        //System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return "";
                }
                break;
            case "mm":
                switch (desiredUnit) {
                    case "km":
                        convertedValue = inputValue / 1000.0 / 1000.0;
                        break;
                    case "m":
                        convertedValue = inputValue / 1000.0;
                        break;
                    case "cm":
                        convertedValue = inputValue / 10.0;
                        break;
                    case "in":
                        convertedValue = inputValue / 10.0 / 2.54;
                        break;
                    case "ft":
                        convertedValue = inputValue / 10.0 / 2.54 / 12.0;
                        break;
                    case "yd":
                        convertedValue = inputValue / 10.0 / 2.54 / 36.0;
                        break;
                    case "mi":
                        convertedValue = inputValue / 10.0 / 2.54 / 12.0 / 5280.0;
                        break;
                    case "mm":
                        convertedValue = inputValue;
                        break;
                    default:
                        //System.out.println("Invalid desired unit entered!");
                        //System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return "";
                }
                break;
            case "in":
                switch (desiredUnit) {
                    case "km":
                        convertedValue = inputValue * 2.54 / 100 / 1000;
                        break;
                    case "m":
                        convertedValue = inputValue * 2.54 / 100;
                        break;
                    case "cm":
                        convertedValue = inputValue * 2.54;
                        break;
                    case "mm":
                        convertedValue = inputValue * 2.54 * 10.0;
                        break;
                    case "ft":
                        convertedValue = inputValue / 12.0;
                        break;
                    case "yd":
                        convertedValue = inputValue / 36.0;
                        break;
                    case "mi":
                        convertedValue = inputValue / 12.0 / 5280.0;
                        break;
                    case "in":
                        convertedValue = inputValue;
                        break;
                    default:
                        //System.out.println("Invalid desired unit entered!");
                        //System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return "";
                }
                break;
            case "ft":
                switch (desiredUnit) {
                    case "km":
                        convertedValue = inputValue * 12.0 * 2.54 / 100 / 1000;
                        break;
                    case "m":
                        convertedValue = inputValue * 12.0 * 2.54 / 100;
                        break;
                    case "cm":
                        convertedValue = inputValue * 12.0 * 2.54;
                        break;
                    case "mm":
                        convertedValue = inputValue * 12.0 * 2.54 * 10.0;
                        break;
                    case "in":
                        convertedValue = inputValue * 12.0;
                        break;
                    case "yd":
                        convertedValue = inputValue / 3.0;
                        break;
                    case "mi":
                        convertedValue = inputValue / 5280.0;
                        break;
                    case "ft":
                        convertedValue = inputValue;
                        break;
                    default:
                        //System.out.println("Invalid desired unit entered!");
                        //System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return "";
                }
                break;
            case "yd":
                switch (desiredUnit) {
                    case "km":
                        convertedValue = inputValue * 36.0 * 2.54 / 100 / 1000;
                        break;
                    case "m":
                        convertedValue = inputValue * 36.0 * 2.54 / 100;
                        break;
                    case "cm":
                        convertedValue = inputValue * 36.0 * 2.54;
                        break;
                    case "mm":
                        convertedValue = inputValue * 36.0 * 2.54 * 10.0;
                        break;
                    case "in":
                        convertedValue = inputValue * 36.0;
                        break;
                    case "ft":
                        convertedValue = inputValue * 3.0;
                        break;
                    case "mi":
                        convertedValue = inputValue * 3.0 / 5280.0;
                        break;
                    case "yd":
                        convertedValue = inputValue;
                        break;
                    default:
                        //System.out.println("Invalid desired unit entered!");
                        //System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return "";
                }
                break;
            case "mi":
                switch (desiredUnit) {
                    case "km":
                        convertedValue = inputValue * 5280.0 * 12.0 * 2.54 / 100 / 1000;
                        break;
                    case "m":
                        convertedValue = inputValue * 5280.0 * 12.0 * 2.54 / 100;
                        break;
                    case "cm":
                        convertedValue = inputValue * 5280.0 * 12.0 * 2.54;
                        break;
                    case "mm":
                        convertedValue = inputValue * 5280.0 * 12.0 * 2.54 * 10.0;
                        break;
                    case "in":
                        convertedValue = inputValue * 5280.0 * 12.0;
                        break;
                    case "ft":
                        convertedValue = inputValue * 5280.0;
                        break;
                    case "yd":
                        convertedValue = inputValue * 5280.0 / 3.0;
                        break;
                    case "mi":
                        convertedValue = inputValue;
                        break;
                    default:
                        //System.out.println("Invalid desired unit entered!");
                        //System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return "";
                }
                break;

            case "mg":
                switch (desiredUnit) {
                    case "mg":
                        convertedValue = inputValue;
                        break;
                    case "g":
                        convertedValue = inputValue / 1000.0;
                        break;
                    case "kg":
                        convertedValue = inputValue / 1000.0 / 1000.0;
                        break;
                    case "oz":
                        convertedValue = inputValue / 1000.0 / 1000.0 * 2.20462 * 16;
                        break;
                    case "lb":
                        convertedValue = inputValue / 1000.0 / 1000.0 * 2.20462;
                        break;
                    default:
                        //System.out.println("Invalid desired unit entered!");
                        //System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return "";
                }
                break;
            case "g":
                switch (desiredUnit) {
                    case "mg":
                        convertedValue = inputValue * 1000.0;
                        break;
                    case "g":
                        convertedValue = inputValue;
                        break;
                    case "kg":
                        convertedValue = inputValue / 1000.0;
                        break;
                    case "oz":
                        convertedValue = inputValue / 1000.0 * 2.20462 * 16;
                        break;
                    case "lb":
                        convertedValue = inputValue / 1000.0 * 2.20462;
                        break;
                    default:
                        //System.out.println("Invalid desired unit entered!");
                        //System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return "";
                }
                break;
            case "kg":
                switch (desiredUnit) {
                    case "mg":
                        convertedValue = inputValue * 1000.0 * 1000.0;
                        break;
                    case "g":
                        convertedValue = inputValue * 1000.0;
                        break;
                    case "kg":
                        convertedValue = inputValue;
                        break;
                    case "oz":
                        convertedValue = inputValue * 2.20462 * 16;
                        break;
                    case "lb":
                        convertedValue = inputValue * 2.20462;
                        break;
                    default:
                        //System.out.println("Invalid desired unit entered!");
                        //System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return "";
                }
                break;
            case "oz":
                switch (desiredUnit) {
                    case "mg":
                        convertedValue = inputValue / 16.0 / 2.20462 * 1000.0 * 1000.0;
                        break;
                    case "g":
                        convertedValue = inputValue / 16.0 / 2.20462 * 1000.0;
                        break;
                    case "kg":
                        convertedValue = inputValue / 16.0 / 2.20462;
                        break;
                    case "oz":
                        convertedValue = inputValue;
                        break;
                    case "lb":
                        convertedValue = inputValue / 16.0;
                        break;
                    default:
                        //System.out.println("Invalid desired unit entered!");
                        //System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return "";
                }
                break;
            case "lb":
                switch (desiredUnit) {
                    case "mg":
                        convertedValue = inputValue / 2.20462 * 1000.0 * 1000.0;
                        break;
                    case "g":
                        convertedValue = inputValue / 2.20462 * 1000.0;
                        break;
                    case "kg":
                        convertedValue = inputValue / 2.20462;
                        break;
                    case "oz":
                        convertedValue = inputValue * 16.0;
                        break;
                    case "lb":
                        convertedValue = inputValue;
                        break;
                    default:
                        //System.out.println("Invalid desired unit entered!");
                        //System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return "";
                }
                break;

            case "f":
                switch (desiredUnit) {
                    case "f":
                        convertedValue = inputValue;
                        break;
                    case "c":
                        convertedValue = (inputValue - 32) * (5.0 / 9.0);
                        break;
                    case "k":
                        convertedValue = ((inputValue - 32) * (5.0 / 9.0)) + 273.15;
                        break;
                    default:
                        //System.out.println("Invalid desired unit entered!");
                        //System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return "";
                }
                break;
            case "c":
                switch (desiredUnit) {
                    case "f":
                        convertedValue = ((9.0 / 5.0) * inputValue) + 32;
                        break;
                    case "c":
                        convertedValue = inputValue;
                        break;
                    case "k":
                        convertedValue = inputValue + 273.15;
                        break;
                    default:
                        //System.out.println("Invalid desired unit entered!");
                        //System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return "";
                }
                break;
            case "k":
                switch (desiredUnit) {
                    case "f":
                        convertedValue = ((9.0 / 5.0) * (inputValue - 273.15)) + 32;
                        break;
                    case "c":
                        convertedValue = inputValue - 273.15;
                        break;
                    case "k":
                        convertedValue = inputValue;
                        break;
                    default:
                        //System.out.println("Invalid desired unit entered!");
                        //System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return "";
                }
                break;

            case "ms":
                switch (desiredUnit) {
                    case "ms":
                        convertedValue = inputValue;
                        break;
                    case "s":
                        convertedValue = inputValue / 1000.0;
                        break;
                    case "min":
                        convertedValue = inputValue / 1000.0 / 60.0;
                        break;
                    case "h":
                        convertedValue = inputValue / 1000.0 / 60.0 / 60.0;
                        break;
                    case "d":
                        convertedValue = inputValue / 1000.0 / 60.0 / 60.0 / 24.0;
                        break;
                    default:
                        //System.out.println("Invalid desired unit entered!");
                        //System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return "";
                }
                break;
            case "s":
                switch (desiredUnit) {
                    case "ms":
                        convertedValue = inputValue * 1000.0;
                        break;
                    case "s":
                        convertedValue = inputValue;
                        break;
                    case "min":
                        convertedValue = inputValue / 60.0;
                        break;
                    case "h":
                        convertedValue = inputValue / 60.0 / 60.0;
                        break;
                    case "d":
                        convertedValue = inputValue / 60.0 / 60.0 / 24.0;
                        break;
                    default:
                        //System.out.println("Invalid desired unit entered!");
                        //System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return "";
                }
                break;
            case "min":
                switch (desiredUnit) {
                    case "ms":
                        convertedValue = inputValue * 1000.0 * 60.0;
                        break;
                    case "s":
                        convertedValue = inputValue * 60.0;
                        break;
                    case "min":
                        convertedValue = inputValue;
                        break;
                    case "h":
                        convertedValue = inputValue / 60.0;
                        break;
                    case "d":
                        convertedValue = inputValue / 60.0 / 24.0;
                        break;
                    default:
                        //System.out.println("Invalid desired unit entered!");
                        //System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return "";
                }
                break;
            case "h":
                switch (desiredUnit) {
                    case "ms":
                        convertedValue = inputValue * 1000.0 * 60.0 * 60.0;
                        break;
                    case "s":
                        convertedValue = inputValue * 60.0 * 60.0;
                        break;
                    case "min":
                        convertedValue = inputValue * 60.0;
                        break;
                    case "h":
                        convertedValue = inputValue;
                        break;
                    case "d":
                        convertedValue = inputValue / 24.0;
                        break;
                    default:
                        //System.out.println("Invalid desired unit entered!");
                        //System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return "";
                }
                break;
            case "d":
                switch (desiredUnit) {
                    case "ms":
                        convertedValue = inputValue * 1000.0 * 60.0 * 60.0 * 24.0;
                        break;
                    case "s":
                        convertedValue = inputValue * 60.0 * 60.0 * 24.0;
                        break;
                    case "min":
                        convertedValue = inputValue * 60.0 * 24.0;
                        break;
                    case "h":
                        convertedValue = inputValue * 24.0;
                        break;
                    case "d":
                        convertedValue = inputValue;
                        break;
                    default:
                        //System.out.println("Invalid desired unit entered!");
                        //System.out.println("Please type \"help\" to see a list of all accepted units!");
                        return "";
                }
                break;

            default:
                //System.out.println("Invalid starting unit entered!");
                //System.out.println("Please type \"help\" to see a list of all accepted units!");
                return "";

        }
        if (sciNot == true) {
            return String.format("%s %s = %.4e %s", value, startUnit, convertedValue, finalUnit);
        }
        else {
            return String.format("%s %s = %f %s", value, startUnit, convertedValue, finalUnit);
        }
        
    }




}
