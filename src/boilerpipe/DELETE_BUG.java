/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boilerpipe;

/**
 *
 * @author Mallick
 */
public class DELETE_BUG 
{
    public static void main(String[] args) 
    {
        
       for(int i=401;i<801;i++)
       {
           System.out.println("INSERT INTO [AMM_TRASH].[dbo].[MAPPING_DETAILS]\n" +
"           ([MAP_ID]\n" +
"           ,[MAP_NAME]\n" +
"           ,[MAP_SPEC_VERSION]\n" +
"           ,[MAP_DESCRIPTION]\n" +
"           ,[PROJECT_ID]\n" +
"           ,[SOURCE_EXTRACT_QUERY]\n" +
"           ,[SOURCE_EXTRACT_DESCRIPTION]\n" +
"           ,[TARGET_UPDATE_STRATEGY]\n" +
"           ,[TRRGET_UPGATE_STRATEGY_NOTES]\n" +
"           ,[TEST_DISPOSITION]\n" +
"           ,[TESTING_NOTES]\n" +
"           ,[CREATED_BY]\n" +
"           ,[CREATED_DATE_TIME]\n" +
"           ,[LAST_MODIFIED_BY]\n" +
"           ,[LAST_MODIFIED_DATE_TIME]\n" +
"           ,[STATUS]\n" +
"           ,[VERSIONLABEL]\n" +
"           ,[CHANGED_DESCRIPTION]\n" +
"           ,[PLAN_DEVELOP_LOE]\n" +
"           ,[PLAN_NOTES]\n" +
"           ,[ACTUAL_DEVELOP_LOE]\n" +
"           ,[ACTUAL_NOTES]\n" +
"           ,[PLAN_MAPPING_EFFORT]\n" +
"           ,[PLAN_MAPPING_EFFORT_UNITS]\n" +
"           ,[PLAN_ETL_EFFORT]\n" +
"           ,[PLAN_ETL_EFFORT_UNITS]\n" +
"           ,[ACTUAL_MAPPING_EFFORT]\n" +
"           ,[ACTUAL_MAPPING_EFFORT_UNITS]\n" +
"           ,[ACTUAL_ETL_EFFORT]\n" +
"           ,[ACTUAL_ETL_EFFORT_UNITS]\n" +
"           ,[JOB_XREF]\n" +
"           ,[UPDATE_SRC_METADATA]\n" +
"           ,[UPDATE_TGT_METADATA]         \n" +
"           ,[ISPUBLISHED]\n" +
"           ,[PUBLISH_NOTES]\n" +
"           ,[EFFECTIVE_DATE]\n" +
"           ,[STATE_ID]\n" +
"           ,[SUBSTATE_ID]\n" +
"           ,[SUBJECT_ID]\n" +
"           ,[RM_ENVIRONMENT_ID])\n" +
"           \n" +
"     VALUES\n" +
"           (\n" +
"		   "+i+"\n" +
"		   ,'AUTOMATE_MAP"+i+"'\n" +
"		   ,1.00\n" +
"		   ,''\n" +
"		   ,1  \n" +
"		   ,''\n" +
"           , ''\n" +
"           , ''\n" +
"           , ''\n" +
"           ,'P'\n" +
"           , ''\n" +
"           , 'Administrator'\n" +
"           , getdate()\n" +
"           ,'Administrator'\n" +
"           , getdate()\n" +
"           ,'Active'\n" +
"           ,''\n" +
"           ,''\n" +
"           , ''\n" +
"           , ''\n" +
"           ,''\n" +
"           ,''\n" +
"           , 0.0\n" +
"           ,''\n" +
"           ,0\n" +
"           , ''\n" +
"           ,0\n" +
"           , ''\n" +
"           , 0\n" +
"           ,''\n" +
"           ,''\n" +
"           , 'N'\n" +
"           ,'N'    \n" +
"           , 'N'\n" +
"           , ''\n" +
"           , null\n" +
"           , 2\n" +
"           , null\n" +
"           , -1\n" +
"           , null		 \n" +
"            )\n" +
"\n" +
"\n" +
"		");
       
       }
        
    }    
}
