package hotel_management.main;

import java.sql.*;
import hotel_management.main.View.Main_View;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) throws SQLException
    {
    	Main_View mainview = new Main_View();
    	mainview.displayOptions();
    }
}
