import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://app.gntkwhqzn-test.advisortodo.com/#/auth/signin')

WebUI.setText(findTestObject('Object Repository/Project/Page_advisor to-do/input_Sign In_form-control'), 'admin@advisortodo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Project/Page_advisor to-do/input_Sign In_form-control_1'), '7Dxoto1EjKeORhrTDROfog==')

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/a_Projects'))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/button_Archived Projects_addProject'))

WebUI.setText(findTestObject('Object Repository/Project/Page_advisor to-do/input_Archived Projects_ml-2 m-0 form-contr_5e655b'), 
    'New project test')

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/div_Contact'))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/div_Kumar'))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/input_Kumar_projectDurationStartInput'))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/div_16'))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/input_Kumar_projectDurationEndInput'))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/div_31'))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/div_Project Owner'))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/div_Nishit Sheth'))

WebUI.setText(findTestObject('Object Repository/Project/Page_advisor to-do/textarea_test project_1'), 'test project\n')

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/div_New project testKKumar NSNishit Shethte_dbe608'))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/p_0'))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/button_test project_addTask'))

WebUI.setText(findTestObject('Object Repository/Project/Page_advisor to-do/input_test project_combobox1'), 'New test project task')

WebUI.sendKeys(findTestObject('Object Repository/Project/Page_advisor to-do/input_test project_combobox1'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/p_New test project task'))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/div_High'))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/div_Medium'))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/input_Medium_taskDueDate'))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/div_17'))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/div_00'))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/div_02'))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/div_ option New focused 1 of 14 14 results _33863a'))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/div_Production'))

WebUI.setText(findTestObject('Object Repository/Project/Page_advisor to-do/input_Production_react-tagsinput-input'), 'new')

WebUI.sendKeys(findTestObject('Object Repository/Project/Page_advisor to-do/input_Production_react-tagsinput-input'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/i_test project_fa fa-clone'))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/button_Createda few seconds ago_deleteTask'))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/img_No Notifications_sb-avatar__image'))

WebUI.click(findTestObject('Object Repository/Project/Page_advisor to-do/span_Logout'))

WebUI.closeBrowser()

