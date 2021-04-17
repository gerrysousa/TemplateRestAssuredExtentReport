package com.TemplateRestAssuredExtentReport.dbsteps;

import com.TemplateRestAssuredExtentReport.utils.DBUtils;
import com.TemplateRestAssuredExtentReport.utils.GeneralUtils;

public class UsersDBSteps {
    private static String queriesPath = System.getProperty("user.dir")+"/src/test/java/com/TemplateRestAssuredExtentReport/queries/";

    public static String getPasswordFromUser(String userName){
        String query = GeneralUtils.readFileToAString(queriesPath + "selectPasswordFromUser");
        query.replace("$name", userName);

        return DBUtils.getQueryResult(query).get(0);
    }
}
