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

WebUI.setText(findTestObject('Page_advisor to-do/input_Sign In_form-control'), 'admin@advisortodo.com')

WebUI.setEncryptedText(findTestObject('Page_advisor to-do/input_Sign In_form-control_1'), '7Dxoto1EjKeORhrTDROfog==')

WebUI.click(findTestObject('Page_advisor to-do/button_Sign In'))

WebUI.click(findTestObject('Page_advisor to-do/a_Tasks'))

WebUI.click(findTestObject('Page_advisor to-do/button_Archived Projects_addTask'))

WebUI.setText(findTestObject('Page_advisor to-do/input_Priority_combobox1'), 'New task for test')

WebUI.sendKeys(findTestObject('Page_advisor to-do/input_Priority_combobox1'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Page_advisor to-do/input_Priority_combobox1'), 'Test123')

WebUI.click(findTestObject('Page_advisor to-do/div_Project'))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/div_New project test'))

WebUI.click(findTestObject('Page_advisor to-do/div_High'))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/div_Low'))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/input_Low_taskDueDate'))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/div_16'))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/input_Low_form-control input-xs'))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/input_Low_form-control input-xs'))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/div_ option 03 focused 4 of 24 24 results a_27c91c'))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/div_03'))

WebUI.click(findTestObject('Page_advisor to-do/div_30'))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/div_15'))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/div_ option New focused 1 of 14 14 results _33863a'))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/div_Client Relationship'))

WebUI.setText(findTestObject('Object Repository/Page_advisor to-do/input_Client Relationship_react-tagsinput-input'), '123')

WebUI.sendKeys(findTestObject('Object Repository/Page_advisor to-do/input_Client Relationship_react-tagsinput-input'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/div_Admin Admin'))

WebUI.click(findTestObject('Page_advisor to-do/div_Nishit Sheth'))

WebUI.click(findTestObject('Page_advisor to-do/i_See More_fa fa-clone'))

WebUI.click(findTestObject('Page_advisor to-do/i_Createda few seconds ago_fa fa-trash'))

WebUI.click(findTestObject('Object Repository/Page_advisor to-do/a_No Notifications_profileDropdown'))

WebUI.click(findTestObject('Page_advisor to-do/span_Logout'))

WebUI.closeBrowser()

